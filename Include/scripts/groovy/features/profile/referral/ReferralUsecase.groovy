
package features.profile.referral

import features.home.HomeScreen
import features.login.usecase.LoginUsecase
import features.onboarding.OnboardingScreen
import features.profile.referral.ReferralScreen

class ReferralUsecase {

	private final LoginUsecase loginUsecase = new LoginUsecase()
	private final HomeScreen homeScreen = new HomeScreen()
	private final OnboardingScreen onboardingScreen = new OnboardingScreen()
	private final ReferralScreen referralScreen = new ReferralScreen()

	void verifyProfileScreen() {
		onboardingScreen.tapNextBtn()
		onboardingScreen.tapLoginOnBoarding()
		loginUsecase.validateLogin()
		homeScreen.tapProfileBtn()
		referralScreen.verifyTitleProfile()
	}

	void tapButtonCopy() {
		referralScreen.tapButtonCopy()
		referralScreen.backToHome()
	}
}
