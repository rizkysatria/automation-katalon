package adapter

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

public class GlueAdapter {

	static boolean initialized = false
	static String PATH_SCRIPTS_GROOVY = "/Include/scripts/groovy"

	static void init() {
		println("GLUE INIT CALLED")
		if (initialized) return
			def gluePkgs = []
		def baseDir = new File(RunConfiguration.getProjectDir() + PATH_SCRIPTS_GROOVY)
		if (baseDir.exists()) {
			baseDir.eachDir {  dir ->
				println("GLUE INIT CALLED ===== dir.name ${dir.name}")
				gluePkgs << dir.name
			}
		}
		println("GLUE INIT CALLED ===== baseDir ${baseDir}")
		CucumberKW.GLUE = gluePkgs
		println("FINAL GLUE CONTENT = " + CucumberKW.GLUE)
		initialized = true
	}
}
