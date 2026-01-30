
package features.loginAndAccount.cardDetails

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.loginAndAccount.cardDetails.CardDetailsUsecase

class CardDetailsStep {

	private final CardDetailsUsecase cardDetailsUsecase = new CardDetailsUsecase()

	@When('Pengguna pilih tabungan dengan jenis kartu (.*) pada listing tabungan')
	def userSelectCard(String cardType) {
		CardDetailType type = CardDetailType.from(cardType)
		cardDetailsUsecase.onTapCard(cardType)
	}

	@Then('sistem menampilkan informasi tabungan sesuai dengan jenis kartu (.*)')
	def appSeeCardDetails(String cardType) {
		cardDetailsUsecase.verifyCardDetailsScreen()
	}
}
