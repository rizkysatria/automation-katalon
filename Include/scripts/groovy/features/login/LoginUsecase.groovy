package features.login

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import core.runtime.storage.StorageManager
import features.login.LoginScreen
import features.onboarding.OnboardingScreen
import internal.GlobalVariable
import localStorage.StoreKey

class LoginUsecase {

	private final LoginScreen loginScreen = new LoginScreen()
	private final OnboardingScreen  onboardingScreen = new OnboardingScreen()

	static String username = StorageManager.get(StoreKey.USERNAME.name())
	static String psswd = StorageManager.get(StoreKey.PASSWD.name())

	void validateOnboarding() {
		onboardingScreen.verifyOnboarding()
		onboardingScreen.tapNextBtn()
		onboardingScreen.tapLoginOnBoarding()
	}

	void validateLogin() {
		loginScreen.setUsername(username)
		loginScreen.setPassword(psswd)
		loginScreen.tapLogin()
	}

	void validateHomeScreen() {
		loginScreen.verifyButtonBeranda()
	}

	void startApp() {
		Mobile.startApplication(GlobalVariable.APP_PATH, true)
	}
}
