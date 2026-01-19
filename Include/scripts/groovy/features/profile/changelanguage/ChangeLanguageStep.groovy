
package features.profile.changelanguage

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.changelanguage.ChangeLanguageUsecase

class ChangeLanguageStep {

	private final ChangeLanguageUsecase changelanguageUsecase = new ChangeLanguageUsecase()

	@When("Pengguna menekan tombol EN ID dari bahasa indonesia")
	def penggunaMenekanTombolENIDDariBahasaIndonesia() {
		// TODO: implement
	}

	@When("Pengguna menekan tombol EN ID dari bahasa inggris")
	def penggunaMenekanTombolENIDDariBahasaInggris() {
		// TODO: implement
	}
}