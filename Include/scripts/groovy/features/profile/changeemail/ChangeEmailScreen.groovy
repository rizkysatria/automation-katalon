
package features.profile.changeemail

import core.ui.UIAction
import core.ui.UIAssert

class ChangeEmailScreen {

	void verifyTitleSectionEmail() {
		UIAssert.textContains("PROFILE_SECTION_EMAIL", "Email")
	}

	void tapSectionEmail() {
		UIAction.tap("PROFILE_ICON_ARROW_EMAIL")
	}

	void verifyTitleEditEmailScreen() {
		UIAssert.textContains("EDIT_EMAIL_TITLE_SCREEN", "EDIT EMAIL")
	}

	void inputCurrentEmail() {
		UIAction.waitShort()
		UIAction.tap("EDIT_EMAIL_TXTFIELD_CURRENT")
		UIAction.waitShort()
		UIAction.setText("EDIT_EMAIL_TXTFIELD_CURRENT", "currentemail@gmail.com")
	}

	void inputNewEmail() {
		UIAction.waitShort()
		UIAction.tap("EDIT_EMAIL_TXTFIELD_NEW")
		UIAction.waitShort()
		UIAction.setText("EDIT_EMAIL_TXTFIELD_NEW", "newemail@gmail.com")
	}

	void tapNextBtn() {
		UIAction.tap("EDIT_EMAIL_NEXT_BTN")
	}
}
