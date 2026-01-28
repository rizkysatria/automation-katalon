package api.assertion

import api.context.ApiContext
import java.time.OffsetDateTime

class ApiAssert {

    static void statusIs(int expected) {
        assert ApiContext.lastStatus == expected :
            "Expected HTTP ${expected} but got ${ApiContext.lastStatus}"
    }

    static void bodyHasField(String fieldName) {
        assert ApiContext.lastBody[fieldName] != null :
            "Response body does not contain field '${fieldName}'"
    }

    static void fieldEquals(String fieldName, Object expected) {
        assert ApiContext.lastBody[fieldName] == expected :
            "Expected ${fieldName}=${expected} but got ${ApiContext.lastBody[fieldName]}"
    }
	
	static void fieldExists(String field) {
		assert ApiContext.lastBody.containsKey(field) :
			"Contract violation: missing field '${field}'"
	}

	static void fieldTypeIs(String field, Class expectedType) {
		def value = ApiContext.lastBody[field]
		assert value != null :
			"Contract violation: field '${field}' is null"

		assert expectedType.isInstance(value) :
			"Contract violation: field '${field}' expected ${expectedType.simpleName} but got ${value.getClass().simpleName}"
	}

	static void nestedFieldTypeIs(List path, Class expectedType) {
		def current = ApiContext.lastBody
		path.each { key ->
			assert current.containsKey(key) :
				"Contract violation: missing field '${key}' in path ${path}"
			current = current[key]
		}

		assert expectedType.isInstance(current) :
			"Contract violation: field '${path.join('.')}' expected ${expectedType.simpleName} but got ${current.getClass().simpleName}"
	}

	static void fieldIsIsoDate(String field) {
		def value = ApiContext.lastBody[field]
		assert value instanceof String :
			"Contract violation: field '${field}' is not String"

		try {
			OffsetDateTime.parse(value)
		} catch (Exception e) {
			assert false :
				"Contract violation: field '${field}' is not ISO-8601 datetime"
		}
	}

	static void objectHasFields(String field, List<String> expectedFields) {
		def obj = ApiContext.lastBody[field]
		assert obj instanceof Map :
			"Contract violation: '${field}' is not an object"

		expectedFields.each {
			assert obj.containsKey(it) :
				"Contract violation: '${field}' missing '${it}'"
		}
	}
}
