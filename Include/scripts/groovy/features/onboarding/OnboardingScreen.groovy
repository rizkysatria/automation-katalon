package features.onboarding

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import core.runtime.locator.LocatorResolver
import core.ui.UIAction
import core.ui.UIAssert
import core.utility.AssertUtil

public class OnboardingScreen {

	void verifyOnboarding() {
		UIAssert.textEquals("ONBOARDING_TITLE", "Selamat datang di Vello")
		UIAssert.textEquals("ONBOARDING_SUB_TITLE", "Nikmati kemudahan bertransaksi dengan aman dan cepat.")
	}

	void tapNextBtn() {
		UIAction.tap("ONBOARDING_BTN_MULAI")
	}

	static void tapLoginOnBoarding() {
		UIAction.tap("BTN_MASUK")
	}
}
