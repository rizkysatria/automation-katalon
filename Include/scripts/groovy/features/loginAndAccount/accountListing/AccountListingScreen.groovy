package features.loginAndAccount.accountListing

import core.ui.UIAction
import core.ui.UIAssert

class AccountListingScreen {

	void verifyScreenBeranda() {
	}

	void  verifyMyAccountScreen() {
	}

	void verifyTitleTab(AccountListType type) {
		String keyLocator = "ACCOUNT_LIST_TAB_TITLE_${type.key}"
		String expectedTitle = type.label
		UIAssert.textContains(keyLocator, expectedTitle)
	}

	void tapTab(AccountListType type) {
		String keyLocator = "ACCOUNT_LIST_TAB_TITLE_${type.key}"
		UIAction.tap(keyLocator)
	}

	void tapShowHideIcon(AccountListType type) {
		String keyLocator = "ACCOUNT_LIST_ICN_SHOWHIDE_SALDO${type.key}"
		UIAction.tap(keyLocator)
	}

	void hideTextSaldo(AccountListType type) {
		String keyLocator = "ACCOUNT_LIST_LABEL_SALDO_${type.key}"
		UIAssert.textContains(keyLocator, "****", "SALDO TIDAK TERLIHAT")
	}

	void showTextSaldo(AccountListType type) {
		String keyLocator = "ACCOUNT_LIST_LABEL_SALDO_${type.key}"
		UIAssert.textNotContains(keyLocator, "****", "SALDO TERLIHAT")
	}
}
