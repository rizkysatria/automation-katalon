
package features.profile.language

import core.ui.UIAction
import core.ui.UIAssert

class LanguageScreen {

	void verififyTitleLanguageID() {
		UIAssert.textEquals("PROFILE_TITLE_LANGUAGE", "Pilih Bahasa")
	}

	void verififyTitleLanguageEN() {
		UIAssert.textEquals("PROFILE_TITLE_LANGUAGE", "Language")
	}

	void tapToggleID() {
		UIAction.tap("LANGUAGE_TOGLE_ID")
	}

	void tapToggleEN() {
		UIAction.tap("LANGUAGE_TOGLE_EN")
	}
}
