
package features.profile.referral

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.referral.ReferralUsecase

class ReferralStep {

	private final ReferralUsecase referralUsecase = new ReferralUsecase()

	@When("Pengguna menekan icon copy pada section referralcode")
	def penggunaMenekanIconCopyPadaSectionReferralcode() {
		referralUsecase.tapButtonCopy()
	}
}