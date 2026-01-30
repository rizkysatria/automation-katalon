
package features.loginAndAccount.cardDetails

import features.loginAndAccount.cardDetails.CardDetailsScreen

class CardDetailsUsecase {

	private final CardDetailsScreen cardDetailsScreen = new CardDetailsScreen()

	void onTapCard(CardDetailType cardType) {
		cardDetailsScreen.tapCard()
	}

	void verifyCardDetailsScreen() {
		cardDetailsScreen.verifySeeDetailBtn()
	}
}
