package features.login.usecase

import features.login.screen.LoginScreen
import features.onboarding.OnboardingScreen

class LoginUsecase {

	private final LoginScreen loginScreen = new LoginScreen()
	private final OnboardingScreen  onboardingScreen = new OnboardingScreen()

	void validateOnboarding() {
		onboardingScreen.checkTextOnboarding()
		onboardingScreen.tapNextBtn()
		onboardingScreen.tapLoginOnBoarding()
	}

	void successLogin() {
		loginScreen.setUsername("emilys")
		loginScreen.setPassword("emilyspass")
		loginScreen.tapLogin()p
	}
}
