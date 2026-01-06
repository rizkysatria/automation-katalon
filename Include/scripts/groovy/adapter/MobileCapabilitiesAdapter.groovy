package adapter

import groovy.json.JsonSlurper
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import internal.GlobalVariable
import utility.LogUtil

class MobileCapabilitiesAdapter {

	private static boolean initialized = false
	static final String MOBILE_CAPABILITIES = "mobile.capabilities"
	static final String PATH_CAPABILITIES_BASE = "Include/config/capabilities/%s.base.json"
	static final String PATH_CAPABILITIES_TARGET = "Include/config/capabilities/%s.%s.json"


	private static void init() {
		if (initialized) {
			LogUtil.debug("MobileCapabilitiesAdapter already initialized – skip")
			return
		}

		String platform = GlobalVariable.platform.toString().toLowerCase()
		String target = GlobalVariable.executionTarget.toString().toLowerCase()

		Map baseCaps = loadCaps(String.format(PATH_CAPABILITIES_BASE , platform))
		Map targetCaps = [:]

		if (target != "local") {
			targetCaps = loadCaps(String.format(PATH_CAPABILITIES_TARGET, platform, target))
		}

		Map finalCaps = [:]
		finalCaps.putAll(baseCaps)
		finalCaps.putAll(targetCaps)

		validate(finalCaps, target)

		RunConfiguration.setExecutionSetting([(MOBILE_CAPABILITIES): finalCaps])

		initialized = true

		LogUtil.info("🚀 TestBootstrap applied | platform=${platform} | target=${target}")
	}

	private static Map loadCaps(String path) {
		File file = new File(path)

		if (!file.exists()) {
			throw new IllegalStateException(
			"❌ Capability file not found: ${path}"
			)
		}

		return new JsonSlurper().parse(file) as Map
	}

	private static void validate(Map caps, String target) {

		assert caps.platformName :
		"platformName is required"

		assert caps["appium:automationName"] :
		"automationName is required"

		if (target == "browserstack") {
			assert caps.remoteWebDriverUrl :
			"BrowserStack requires remoteWebDriverUrl"

			assert caps.app?.toString()?.startsWith("bs://") :
			"BrowserStack app must start with bs://"

			assert caps["bstack:options"]?.deviceName :
			"BrowserStack deviceName is required"

			assert caps["bstack:options"]?.osVersion :
			"BrowserStack osVersion is required"

			assert caps["browserstack.user"] :
			"BrowserStack username missing"

			assert caps["browserstack.key"] :
			"BrowserStack access key missing"
		}

		if (target == "katalon") {
			assert caps.remoteWebDriverUrl :
			"Katalon Cloud requires remoteWebDriverUrl"

			assert caps.app?.toString()?.startsWith("cloud://") :
			"Katalon Cloud app must start with cloud://"
		}
	}
}