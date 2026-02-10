
package features.profile.changenewpin

import core.ui.UIAction
import core.ui.UIAssert

class ChangeNewPinScreen {

	void verifyTitleSectionChangePin() {
		UIAssert.textContains("PROFILE_SECTION_CHANGE_PIN", "Ubah Pin")
	}

	void tapSectionChangePin() {
		UIAction.tap("PROFILE_ICON_ARROW_CHANGE_PIN")
	}

	void verifyTitleOldPinScreen() {
		UIAssert.textContains("OLD_PIN_TITLE_SCREEN", "PIN LAMA")
	}

	void tapInputPin(String pin) {
	UIAction.waitShort()
	
		pin.eachWithIndex { char digit, int index ->
			String locatorKey = "PIN_BOX_${index + 1}"
			UIAction.waitShort()
			UIAction.tap(locatorKey)
			UIAction.setText(locatorKey, digit.toString())}
	}
	
	void tapOkeBtn() {
		UIAssert.textContains("PROFILE_SECTION_SUCCESS_CHANGE_PIN", "Ganti PIN Berhasil")
		UIAction.tap("CHANGE_PIN_OKE_BTN")
	}
}
