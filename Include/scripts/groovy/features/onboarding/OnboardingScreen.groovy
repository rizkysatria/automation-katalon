package features.onboarding

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import core.runtime.locator.LocatorResolver
import core.ui.UIAction
import core.utility.AssertUtil

public class OnboardingScreen {

	static void checkTextOnboarding() {
		def ONBOARDING_TITLE = LocatorResolver.create("ONBOARDING_TITLE")
		Mobile.waitForElementPresent(ONBOARDING_TITLE, 5)
		AssertUtil.assertEquals("ONBOARDING_TITLE", "Selamat datang di Vello")
		def ONBOARDING_SUB_TITLE = LocatorResolver.create("ONBOARDING_SUB_TITLE")
		Mobile.waitForElementPresent(ONBOARDING_SUB_TITLE, 5)
		AssertUtil.assertEquals("ONBOARDING_SUB_TITLE", "Nikmati kemudahan bertransaksi dengan aman dan cepat.")
	}

	static void tapNextBtn() {
		UIAction.tap("ONBOARDING_BTN_MULAI")
	}

	static void tapLoginOnBoarding() {
		def BTN_MASUK = LocatorResolver.create("BTN_MASUK")
		Mobile.waitForElementPresent(BTN_MASUK, 5)
		UIAction.tap("BTN_MASUK")
	}
}
