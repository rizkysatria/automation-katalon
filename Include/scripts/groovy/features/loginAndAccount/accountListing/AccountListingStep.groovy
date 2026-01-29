
package features.loginAndAccount.accountListing

import features.loginAndAccount.accountListing.AccountListingUsecase
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

class AccountListingStep {

	private final AccountListingUsecase accountlistingUsecase = new AccountListingUsecase()
	private AccountListType tab = AccountListType.TABUNGAN

	@Given("Pengguna dihalaman Beranda")
	def penggunaDihalamanBeranda() {
		accountlistingUsecase.validateBerandaScreen()
	}

	@Given("Pengguna berada di halaman Akun Anda")
	def penggunaBeradaDiHalamanAkunAnda() {
		accountlistingUsecase.validateMyAccountScreen()
	}

	@When("Pengguna menekan wording Lihat Semua")
	def penggunaMenekanWordingLihatSemua() {
		// TODO: implement
	}

	@When('Pengguna klik Tab "(.*)"')
	def penggunnaKlikTab(String tabName) {
		tab = AccountListType.from(tabName)
		accountlistingUsecase.onTapAndvalidateTab(tab)
	}

	@And("Pengguna menekan icon hide unhide (saldo|nominal deposito|nominal Sisa Pembiayaan)")
	def penggunaMenekanIconHideunhideSaldo(String value) {
		accountlistingUsecase.onTapShowHideIcon(tab)
	}

	@Then("Sistem menampilkan atau menyembunyikan nominal (saldo|deposito|Sisa Pembiayaan)")
	def sistemMenampilkanmenyembunyikanNominalSaldo(String value) {
		accountlistingUsecase.verifyTextSaldo()
	}
}