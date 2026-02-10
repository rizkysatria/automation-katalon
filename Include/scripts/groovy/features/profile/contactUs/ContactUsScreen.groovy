
package features.profile.contactUs

class ContactUsScreen {

	void verifyScreen() {
		// TODO: implement screen verification
		UIAssert.textEquals("PROFILE_TITLE_CONTACT_US", "Hubungi Kami")
	}

	void tapContactUs() {
		UIAction.tap("CONTACT_US")
	}

	void tapFindUs() {
		UIAction.tap("FIND_US_BTN")
	}

	void tapOfficeBranch() {
		UIAction.tap("OFFICE_BRANCH_BTN")
	}

	void tapATM() {
		UIAction.tap("ATM_BTN")
	}

	void tapMerchant() {
		UIAction.tap("MERCHANT_BTN")
	}

	void tapEDC() {
		UIAction.tap("EDC_BTN")
	}

	void tapBackBtn(){
		UIAction.tap("BTN_BACK_NAVIGATION")
	}

	void verifyContactUsScreen(){
		UIAssert.textEquals("TITLE_CONTACT_US", "HUBUNGI KAMI")
	}
}
