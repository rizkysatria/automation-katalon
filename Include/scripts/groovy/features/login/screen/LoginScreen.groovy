package features.login.screen

import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.model.FailureHandling

import core.runtime.locator.LocatorResolver
import core.ui.UIAction

class LoginScreen {

	static void setUsername(String username) {
		UIAction.setText("LOGIN_TF_USER_NAME", username)
	}

	static void setPassword(String password) {
		UIAction.setText("LOGIN_TF_PASSWORD", password)
	}

	static void tapLogin() {
		UIAction.tap("LOGIN_BTN_MASUK")
	}

	static void verifyButtonBeranda() {
		UIAction.waitMedium()
	}
}
