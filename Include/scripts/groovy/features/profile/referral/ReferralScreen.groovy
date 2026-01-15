
package features.profile.referral

import core.ui.UIAction
import core.ui.UIAssert
import core.utility.AssertUtil

class ReferralScreen {

	void verifyTitleProfile() {
		UIAction.waitMedium()
		UIAssert.textEquals("PROFILE_TITLE", "Profil", "Title page must be 'Profil'")
	}

	void tapButtonCopy() {
		UIAction.tap("PROFILE_COPYPASTE_ICON")
	}

	void backToHome() {
		UIAction.pressBack()
	}
}
