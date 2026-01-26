
package features.profile.language

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When
import features.profile.language.LanguageUsecase

class LanguageStep {

	private final LanguageUsecase languageUsecase = new LanguageUsecase()

	@When("Pengguna menekan tombol EN ID dari bahasa indonesia")
	def penggunaMenekanTombolENIDDariBahasaIndonesia() {
		languageUsecase.tapToggleChangeLanguage("en")
		languageUsecase.verifyLanguageAlreadyChanges("en")
	}

	@When("Pengguna menekan tombol EN ID dari bahasa inggris")
	def penggunaMenekanTombolENIDDariBahasaInggris() {
		languageUsecase.tapToggleChangeLanguage("id")
		languageUsecase.verifyLanguageAlreadyChanges("id")
	}
}