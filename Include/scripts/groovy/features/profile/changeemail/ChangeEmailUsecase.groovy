
package features.profile.changeemail

import features.profile.changeemail.ChangeEmailScreen

class ChangeEmailUsecase {

	private final ChangeEmailScreen changeEmailScreen = new ChangeEmailScreen()

	void tapSectionChangeEmail() {
		changeEmailScreen.tapSectionEmail()
	}

	void inputNewEmail() {
		changeEmailScreen.inputCurrentEmail()
		changeEmailScreen.inputNewEmail()
		changeEmailScreen.tapNextBtn()
	}
}
