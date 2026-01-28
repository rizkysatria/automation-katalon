package api.client

import groovy.json.JsonOutput
import groovy.json.JsonSlurper
import api.context.ApiContext

class ApiClient {

	static void post(String url, Map headers = [:], Object body = null) {

		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection()
		conn.requestMethod = "POST"
		conn.doOutput = true
		conn.connectTimeout = 15000
		conn.readTimeout = 15000

		// headers
		headers.each { key, value ->
			conn.setRequestProperty(key, value.toString())
		}

		// body
		if (body != null) {
			conn.outputStream.withWriter("UTF-8") { writer ->
				writer << JsonOutput.toJson(body)
			}
		}

		// response
		int status = conn.responseCode
		def stream = status < 400 ? conn.inputStream : conn.errorStream
		def response = new JsonSlurper().parse(stream)

		ApiContext.lastStatus = status
		ApiContext.lastBody = response
	}
}