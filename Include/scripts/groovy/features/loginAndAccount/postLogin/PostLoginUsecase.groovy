package features.loginAndAccount.postLogin

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import core.runtime.storage.StorageManager
import features.loginAndAccount.postLogin.PostLoginScreen
import features.onboarding.OnboardingScreen
import internal.GlobalVariable
import localStorage.StoreKey

class PostLoginUsecase {

	private final PostLoginScreen postLoginScreen = new PostLoginScreen()
	private final OnboardingScreen  onboardingScreen = new OnboardingScreen()

	static String username = StorageManager.get(StoreKey.USERNAME.name())
	static String psswd = StorageManager.get(StoreKey.PASSWD.name())

	void validateOnboarding() {
		onboardingScreen.verifyOnboarding()
		onboardingScreen.tapNextBtn()
		onboardingScreen.tapLoginOnBoarding()
	}

	void validateLogin() {
		postLoginScreen.setUsername(username)
		postLoginScreen.setPassword(psswd)
		postLoginScreen.tapLogin()
	}

	void validateHomeScreen() {
		postLoginScreen.verifyButtonBeranda()
	}

	void startApp() {
		Mobile.startApplication(GlobalVariable.APP_PATH, true)
	}
}
