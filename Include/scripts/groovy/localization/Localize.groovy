package localization

import internal.GlobalVariable
import localization.id
import localization.en

class Localize {
	private static Object store() {
		String lang = GlobalVariable.LANG ?: "id"
		switch(lang) {
			case "en": return en
			default  : return id
		}
	}

	static String get(String key) {
		def store = store()
		if (!store.metaClass.hasProperty(store, key)) {
			throw new RuntimeException("Localization key '${key}' not found")
		}
		return store."$key"
	}
}