package adapter

import internal.GlobalVariable

public class ExecutionAdapter {

	static boolean initialized = false
	static String PATH_CLASS_PLATFORM = "utility.Platform"
	static String PATH_CLASS_EXECUTION_CONTEXT = "core.context.ExecutionContext"
	static String METHOD_NAME_SET_PLATFORM = "setPlatform"

		static void init() {
	
			String platformValue = GlobalVariable.platform
	
			if (initialized && !platformValue) return
	
				try {
					Class platformEnum =Class.forName(PATH_CLASS_PLATFORM)
					Class executionContext = Class.forName(PATH_CLASS_EXECUTION_CONTEXT)
					Object platform = Enum.valueOf(platformEnum, platformValue.toUpperCase())
					def setPlatformMethod = executionContext.getDeclaredMethod(METHOD_NAME_SET_PLATFORM, platformEnum)
					setPlatformMethod.invoke(null, platform)
				} catch (ClassNotFoundException e) {
					println "[INFO] Core JAR not present, skip platform injection"
				} catch (Exception e) {
					println "[ERROR] Failed to init ExecutionContext: ${e.message}"
					e.printStackTrace()
				}
	
			initialized = true
		}
}
