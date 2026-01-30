
package features.loginAndAccount.cardDetails

import core.ui.UIAction
import core.ui.UIAssert

class CardDetailsScreen {
	
	void tapCard() {
		UIAction.tap("ACCOUNT_LIST_CARD_LIST_INDEX_0")
	}

	void verifySeeDetailBtn() {
		UIAssert.textContains("CARD_DETAIL_SEE_DETAIL_BTN", "Tampilkan detail")
	}
	
	void tapSeeDetailBtn() {
		UIAction.tap("CARD_DETAIL_SEE_DETAIL_BTN")
	}
	
}
	