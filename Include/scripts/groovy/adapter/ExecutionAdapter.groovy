package adapter

import internal.GlobalVariable
import core.types.Platform

public class ExecutionAdapter {

	static boolean initialized = false
	static String PATH_CLASS_EXECUTION_CONTEXT = "core.runtime.profile.ExecutionProfile"
	static String METHOD_NAME_SET_PLATFORM = "setPlatform"

	static void init() {

		String platformValue = GlobalVariable.platform.toString()

		if (initialized && !platformValue) return

			try {
				Class executionProfile = Class.forName(PATH_CLASS_EXECUTION_CONTEXT)
				Object platform = Enum.valueOf(Platform, platformValue.toUpperCase())
				def setPlatformMethod = executionProfile.getDeclaredMethod(METHOD_NAME_SET_PLATFORM, Platform)
				setPlatformMethod.invoke(null, platform)
			} catch (ClassNotFoundException e) {
				println "[INFO] Core JAR not present, skip platform injection"
			} catch (Exception e) {
				println "[ERROR] Failed to init ExecutionAdapter: ${e.message}"
				e.printStackTrace()
			}

		initialized = true
	}
}
