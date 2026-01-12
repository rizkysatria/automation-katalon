package generator

class EpicGenerator {

	static void generate(String featureName, String epicName, Boolean withFolder = true) {
		String epicBase = PathResolver.epicBasePath(featureName, epicName.toLowerCase())
		if (withFolder) {
			generateWithFolder(featureName, epicBase, epicName)
		} else {
			generateWithoutFolder(featureName,epicBase, epicName)
		}
		println "✅ Epic created: ${epicName}"
	}
	
	/**
	 * Generate file FLAT mode
	 * features 
	 * 	- {epic}
	 * 		{Epic}Usecase.groovy
	 * 		{Epic}Step.groovy
	 * 		{Epic}Screen.groovy
	 * @param featureName
	 * @param base
	 * @param epic
	 */

	private static void generateWithoutFolder(String featureName, String base, String epic) {
		File baseDir = new File(base)
		if (!baseDir.exists()) {
			baseDir.mkdirs()
		}

		new File(base, "${epic}Usecase.groovy")
				.text = TemplateFactory.usecaseTemplate(featureName, epic, false)

		new File(base, "${epic}Screen.groovy")
				.text = TemplateFactory.screenTemplate(featureName, epic, false)

		new File(base, "${epic}Step.groovy")
				.text = TemplateFactory.stepTemplate(featureName, epic, false)
	}
	
	/**
	 * Generate file LAYER mode
	 * features 
	 * 	{epic}
	 * 		usecase 
	 * 			{Epic}Usecase.groovy
	 * 		stepDef
	 * 			{Epic}Step.groovy
	 * 		screen 
	 * 			{Epic}Screen.groovy
	 * @param featureName
	 * @param base
	 * @param epic
	 */

	private static void generateWithFolder(String featureName, String base, String epic) {
		def usecaseDir = new File("${base}/usecase")
		def screenDir  = new File("${base}/screen")
		def stepDir    = new File("${base}/stepDef")

		[
			usecaseDir,
			screenDir,
			stepDir
		].each { it.mkdirs() }

		new File(usecaseDir, "${epic}Usecase.groovy")
				.text = TemplateFactory.usecaseTemplate(featureName, epic)

		new File(screenDir, "${epic}Screen.groovy")
				.text = TemplateFactory.screenTemplate(featureName, epic)

		new File(stepDir, "${epic}Step.groovy")
				.text = TemplateFactory.stepTemplate(featureName, epic)
	}
}
