package generator

import com.kms.katalon.core.annotation.Keyword

class ScaffoldTrigger {

	@Keyword
	def generateFeature(String featureName) {
		FeatureGenerator.generate(featureName)
	}

	@Keyword
	def generateEpic(String featureName, String epicName) {
		EpicGenerator.generate(featureName, epicName)
	}

	@Keyword
	def generateEpicWithoutFolder(String featureName, String epicName) {
		EpicGenerator.generate(featureName, epicName, false)
	}
}
