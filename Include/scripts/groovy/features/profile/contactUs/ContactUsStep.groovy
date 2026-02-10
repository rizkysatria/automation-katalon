
package features.profile.contactUs

import features.profile.contactUs.ContactUsUsecase

class ContactUsStep {

	private final ContactUsUsecase contactUsUsecase = new ContactUsUsecase()

	@When {'Pengguna menekan section Hubungi Kami'}{
		def onTapContactUs() {
			contactUsUsecase.tapContactUsBtn()
		}
	}

	@and {'Halaman Hubungi Kami tampil'}{
		def onVerifyContactUs() {
			contactUsUsecase.verifyScreen()
		}
	}

	@Then {'Pengguna kembali ke halaman beranda'}{
		def onBackToProfile() {
			contactUsUsecase.tapBackBtn()
		}
	}

}
