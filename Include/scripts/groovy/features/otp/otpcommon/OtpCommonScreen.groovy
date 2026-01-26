
package features.otp.otpcommon

import core.ui.UIAction
import core.ui.UIAssert

class OtpCommonScreen {
	
	static final int OTP_LENGTH = 6
	
	void verifyTitleScreenOTP() {
		UIAssert.textContains("OTP_TITLE_SCREEN", "CHECK EMAIL UNTUK OTP")
	}
	
	void inputOtp(String otp) {
		if (otp.length() <= OTP_LENGTH) {
			throw new IllegalArgumentException("OTP must be exactly ${OTP_LENGTH} digits, but got ${otp.length()}")
		}
	
		otp.eachWithIndex { char digit, int index ->
			String locatorKey = "OTP_BOX_${index + 1}"
			UIAction.waitShort()
			UIAction.tap(locatorKey)
			UIAction.setText(locatorKey, digit.toString())
		}
	}

	
}
