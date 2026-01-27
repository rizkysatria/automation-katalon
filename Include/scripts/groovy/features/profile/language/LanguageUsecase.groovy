
package features.profile.language

import features.profile.language.LanguageScreen

class LanguageUsecase {

	private final LanguageScreen languageScreen = new LanguageScreen()

	void tapToggleChangeLanguage(String language) {
		if (language == "id") {
			languageScreen.tapToggleID()
		} else {
			languageScreen.tapToggleEN()
		}
	}

	void verifyLanguageAlreadyChanges(String language) {
		if (language == "id") {
			languageScreen.verififyTitleLanguageID()
		} else {
			languageScreen.verififyTitleLanguageEN()
		}
	}
}
