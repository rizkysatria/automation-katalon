package feature.testLocalization

import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class TestLocalizationStep {

	private TestLocalizationUsecase testLocalizationUsecase = new TestLocalizationUsecase()

	@Given("check title screen")
	def checkTitleScreen() {
		testLocalizationUsecase.checkTitleScreen()
	}

	@When("check button next")
	def checkButtonNext() {
		testLocalizationUsecase.checkButtonNextAtas()
	}

	@Then("finish")
	def finish() {
	}
}
