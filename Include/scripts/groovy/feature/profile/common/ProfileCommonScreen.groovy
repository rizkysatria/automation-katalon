package feature.profile.common

import core.ui.UIAction
import core.ui.UIAssert
import internal.GlobalVariable

public class ProfileCommonScreen {

	void verifyTitleProfile() {
		UIAction.waitMedium()
		UIAssert.textEquals("PROFILE_TITLE", "Profil", "Title page must be 'Profil'")
	}

	void backToHome() {
		UIAction.pressBack()
	}
}
