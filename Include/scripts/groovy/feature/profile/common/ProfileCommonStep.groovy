package feature.profile.common

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import features.profile.referral.ReferralUsecase
import internal.GlobalVariable

public class ProfileCommonStep {

	private final ReferralUsecase referralUsecase = new ReferralUsecase()

	@Given("Pengguna dihalaman Profile")
	def penggunaDihalamanProfile() {
		referralUsecase.verifyProfileScreen()
	}

	@Then("Pengguna kembali ke halaman beranda")
	def penggunaKembaliKeHalamanBeranda() {
		// TODO: implement
	}
}
