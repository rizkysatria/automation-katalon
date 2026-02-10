
package features.profile.contactUs

import features.profile.contactUs.ContactUsScreen

class ContactUsUsecase {

	private final ContactUsScreen contactUsScreen = new ContactUsScreen()

	void tapContactUsBtn() {
		contactUsScreen.tapContactUs()
	}

	void tapFindUsBtn() {
		contactUsScreen.tapFindUs()
	}

	void tapOfficeBranchBtn() {
		contactUsScreen.tapOfficeBranch()
	}

	void tapATMBtn() {
		contactUsScreen.tapATM()
	}

	void tapMerchantBtn() {
		contactUsScreen.tapMerchant()
	}

	void tapEDCBtn() {
		contactUsScreen.tapEDC()
	}

	void tapBackBtn() {
		contactUsScreen.tapBackBtn()
	}

	void verifyScreen() {
		contactUsScreen.verifyContactUsScreen()
	}
}
