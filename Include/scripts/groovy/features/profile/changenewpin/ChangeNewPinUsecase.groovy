
package features.profile.changenewpin

import features.profile.changenewpin.ChangeNewPinScreen

class ChangeNewPinUsecase {

	private final ChangeNewPinScreen ChangeNewPinScreen = new ChangeNewPinScreen()

	void tapSectionChangePin() {
		ChangeNewPinScreen.tapSectionChangePin()
	}

	void inputOldPin() {
		ChangeNewPinScreen.verifyTitleOldPinScreen()
		ChangeNewPinScreen.tapInputPin("123456")		
	}
	
	void inputNewPin() {
		ChangeNewPinScreen.tapInputPin("321654")
		
	}
	
	void inputConfirmPin() {
		ChangeNewPinScreen.tapInputPin("321654")
		ChangeNewPinScreen.tapOkeBtn()
	}
}