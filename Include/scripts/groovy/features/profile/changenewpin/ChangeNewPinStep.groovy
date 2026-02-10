
package features.profile.changenewpin

import cucumber.api.java.en.And
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.changeemail.ChangeNewPinUsecase

class ChangeNewPinStep {

	private final ChangeNewPinUsecase changeNewPinUsecase = new ChangeNewPinUsecase()

	@Given("Pengguna dihalaman Masukan PIN Lama")
	def penggunaAksesUbahPin() {
		changeNewPinUsecase.verifyTitleSectionChangePin()
		changeNewPinUsecase.tapSectionChangePin()
	}
	
	@When("Pengguna mengisi PIN Lama")
	def penggunaInputPinLama() {
		changeNewPinUsecase.tapSectionOldPin()
	}

	@And("Pengguna mengisi PIN baru")
	def penggunaMemasukkanEmailBaru() {
		changeNewPinUsecase.tapSectionNewPin()
	}

	@And("Pengguna mengisi Konfirmasi PIN Baru")
	def penggunaMemasukkanKonfimasiEmailBaru() {
		ChangeNewPinUsecase.tapSectionConfirmNewPin()
	}
	
	@Then("Halaman PIN Baru tampil")
	def emailBerhasilDiUbahPopupTampil() {
		changeNewPinUsecase.tapOkeBtn()
	}
}