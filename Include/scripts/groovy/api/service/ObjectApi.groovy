package api.service

import api.client.ApiClient
import api.context.ApiContext

class ObjectApi {

    static void addObject() {

		Map headers = [
		"Content-Type": "application/json",
		"Accept" : "application/json"
		]
		
		Map productData = [
		year : 2019,
		price : 1849.99,
		"CPU model" : "Intel Core i9",
		"Hard disk size": "1 TB"
		]

		Map body = [
		name: "Apple MacBook Pro 16",
		data: productData
		]
		
		ApiContext.reset()
		ApiClient.post("https://api.restful-api.dev/objects", headers, body)
    }
}