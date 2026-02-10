
package features.otp.pincommon

import core.ui.UIAction
import core.ui.UIAssert

class PinCommonScreen {
	
	static final int PIN_LENGTH = 6
	
	void verifyTitleScreenPIN() {
		UIAssert.textContains("PIN_TITLE_SCREEN", "")
	}
	
	void inputPin(String pin) {
		if (pin.length() <= PIN_LENGTH) {
			throw new IllegalArgumentException("PIN must be exactly ${PIN_LENGTH} digits, but got ${pin.length()}")
		}
	
		pin.eachWithIndex { char digit, int index ->
			String locatorKey = "PIN_BOX_${index + 1}"
			UIAction.waitShort()
			UIAction.tap(locatorKey)
			UIAction.setText(locatorKey, digit.toString())
		}
	}

	
}
