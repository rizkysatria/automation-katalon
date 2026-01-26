
package features.profile.changeemail

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.changeemail.ChangeEmailUsecase

class ChangeEmailStep {

	private final ChangeEmailUsecase changeemailUsecase = new ChangeEmailUsecase()

	@When("Pengguna menekan Email section")
	def penggunaMenekanEmailSection() {
		// TODO: implement
	}

	@And("Pengguna memasukan email baru")
	def penggunaMemasukanEmailBaru() {
		// TODO: implement
	}

	@And("Pengguna memasukan OTP")
	def penggunaMemasukanOTP() {
		// TODO: implement
	}

	@And("Pengguna Memasukan PIN")
	def penggunaMemasukanPIN() {
		// TODO: implement
	}

	@Then("Email berhasil di ubah popup tampil")
	def emailBerhasilDiUbahPopupTampil() {
		// TODO: implement
	}
}