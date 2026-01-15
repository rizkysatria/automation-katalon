
package features.profile.referral

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.referral.ReferralUsecase

class ReferralStep {

	private final ReferralUsecase referralUsecase = new ReferralUsecase()

	@Given("Pengguna dihalaman Profile")
	def penggunaDihalamanProfile() {
		referralUsecase.verifyProfileScreen()
	}


	@When("Pengguna menekan icon copy pada section referralcode")
	def penggunaMenekanIconCopyPadaSectionReferralcode() {
		referralUsecase.tapButtonCopy()
	}


	@Then("Pengguna kembali ke halaman beranda")
	def penggunaKembaliKeHalamanBeranda() {
		// TODO: implement
	}
}