package features.loginAndCreateAccount.postLogin

import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import cucumber.api.java.en.And
import cucumber.api.java.en.Given

class PostLoginStep {

	private final PostLoginUsecase postLoginUsecase = new PostLoginUsecase()

	@Given("aplikasi dibuka dari awal")
	def freshInstallApp() {
		postLoginUsecase.startApp()
	}

	@When('User berada di splash screen')
	def user_see_onboarding_screen() {
		postLoginUsecase.validateOnboarding()
	}

	@And('User login dengan password "akun konvensional" yang valid')
	def userLoginValidAccount() {
		postLoginUsecase.validateLogin()
	}

	@And('User login dengan password "akun syariah" yang valid')
	def userLoginSyariahAccount() {
		postLoginUsecase.validateLogin()
	}

	@Then('User berhasil login dan masuk ke Beranda')
	def userShouldBeRedirectedToHomeScreen() {
		postLoginUsecase.validateHomeScreen()
	}
}
