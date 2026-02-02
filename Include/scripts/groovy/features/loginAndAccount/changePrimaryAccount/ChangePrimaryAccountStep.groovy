package features.loginAndAccount.changePrimaryAccount

import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import cucumber.api.java.en.And

import features.loginAndAccount.changePrimaryAccount.ChangePrimaryAccountUsecase

class ChangePrimaryAccountStep {

	private final ChangePrimaryAccountUsecase changePrimaryAccountUsecase = new ChangePrimaryAccountUsecase()

	@When("Pengguna klik icon edit Akun Utama")
	def userClickIconEditAccount() {
	}

	@And("Pengguna memilih Sumber Dana")
	def userSelectCard() {
	}

	@And("Pengguna menekan tombol Lanjut")
	def userTapNextButton() {
	}

	@Then("Sistem memperbarui akun utama")
	def appChangesAccount() {
	}
}
