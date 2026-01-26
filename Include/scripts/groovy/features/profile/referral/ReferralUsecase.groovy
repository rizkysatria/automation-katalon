
package features.profile.referral

import features.home.HomeScreen
import features.loginAndAccount.postLogin.PostLoginUsecase
import features.onboarding.OnboardingScreen
import features.profile.referral.ReferralScreen

class ReferralUsecase {

	private final HomeScreen homeScreen = new HomeScreen()
	private final ReferralScreen referralScreen = new ReferralScreen()

	void verifyProfileScreen() {
		homeScreen.tapProfileBtn()
		referralScreen.verifyTitleProfile()
	}

	void tapButtonCopy() {
		referralScreen.tapButtonCopy()
		referralScreen.backToHome()
	}
}
