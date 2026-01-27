
package features.profile.changeemail

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.changeemail.ChangeEmailUsecase

class ChangeEmailStep {

	private final ChangeEmailUsecase changeEmailUsecase = new ChangeEmailUsecase()

	@When("Pengguna menekan Email section")
	def penggunaMenekanEmailSection() {
		changeEmailUsecase.tapSectionChangeEmail()
	}

	@And("Pengguna memasukan email baru")
	def penggunaMemasukanEmailBaru() {
		changeEmailUsecase.inputNewEmail()
	}

//	@And("Pengguna memasukan OTP")
//	def penggunaMemasukanOTP() {
//		// TODO: implement
//	}
//
//	@And("Pengguna Memasukan PIN")
//	def penggunaMemasukanPIN() {
//		// TODO: implement
//	}
//
//	@Then("Email berhasil di ubah popup tampil")
//	def emailBerhasilDiUbahPopupTampil() {
//		// TODO: implement
//	}
}