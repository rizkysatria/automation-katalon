package features.login

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Given

class LoginStep {

	private final LoginUsecase loginUsecase = new LoginUsecase()

	@Given("aplikasi dibuka dari awal")
	def freshInstallApp() {
		loginUsecase.startApp()
	}

	@When('User berada di splash screen')
	def user_see_onboarding_screen() {
		loginUsecase.validateOnboarding()
	}

	@And('User login dengan password "akun konvensional" yang valid')
	def userLoginValidAccount() {
		loginUsecase.validateLogin()
	}

	@And('User login dengan password "akun syariah" yang valid')
	def userLoginSyariahAccount() {
		loginUsecase.validateLogin()
	}

	@Then('User berhasil login dan masuk ke Beranda')
	def userShouldBeRedirectedToHomeScreen() {
		loginUsecase.validateHomeScreen()
	}
}
