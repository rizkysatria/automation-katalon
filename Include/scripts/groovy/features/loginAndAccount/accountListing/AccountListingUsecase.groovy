
package features.loginAndAccount.accountListing

import features.loginAndAccount.accountListing.AccountListingScreen

class AccountListingUsecase {

	private final AccountListingScreen accountlistingScreen = new AccountListingScreen()
	boolean textIsHide = false

	void validateBerandaScreen() {
		accountlistingScreen.verifyScreenBeranda()
	}

	void validateMyAccountScreen() {
		accountlistingScreen.verifyMyAccountScreen()
	}

	void onTapAndvalidateTab(AccountListType type) {
		accountlistingScreen.verifyTitleTab(type)
		accountlistingScreen.tapTab(type)
	}

	void onTapShowHideIcon(AccountListType type) {
		accountlistingScreen.tapShowHideIcon(type)
	}

	void verifyTextSaldo(AccountListType type) {
		accountlistingScreen.hideTextSaldo(type)
		accountlistingScreen.showTextSaldo(type)
	}
}
