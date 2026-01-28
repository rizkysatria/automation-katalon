import api.service.ObjectApi
import api.assertion.ApiAssert


ObjectApi.addObject()

ApiAssert.statusIs(200)
ApiAssert.fieldExists("id")
ApiAssert.fieldTypeIs("id", String)
ApiAssert.fieldExists("name")
ApiAssert.fieldTypeIs("name", String)
ApiAssert.fieldExists("createdAt")
ApiAssert.fieldIsIsoDate("createdAt")
ApiAssert.objectHasFields("data", [
"year",
"price",
"CPU model",
"Hard disk size",
])
ApiAssert.nestedFieldTypeIs(["data", "year"], Integer)
ApiAssert.nestedFieldTypeIs(["data", "price"], BigDecimal)
ApiAssert.nestedFieldTypeIs(["data", "CPU model"], String)
ApiAssert.nestedFieldTypeIs(["data", "Hard disk size"], String)