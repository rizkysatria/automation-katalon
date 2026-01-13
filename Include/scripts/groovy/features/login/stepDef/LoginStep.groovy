package features.login.stepDef

import features.login.usecase.LoginUsecase
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And

class LoginStep {

	private final LoginUsecase loginUsecase = new LoginUsecase()

	@When('user see onboarding screen')
	def user_see_onboarding_screen() {
		loginUsecase.validateOnboarding()
	}

	@And('user login with valid account')
	def userLoginValidAccount() {
		loginUsecase.successLogin()
	}

	@Then('user should be redirected to home screen')
	def userShouldBeRedirectedToHomeScreen() {
	}
}
