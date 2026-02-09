package feature.testLocalization

class TestLocalizationUsecase {

	private TestLocalizationScreen testLocalizationScreen = new TestLocalizationScreen()


	void checkTitleScreen() {
		testLocalizationScreen.assertTitleScreen()
	}

	void checkButtonNextAtas() {
		testLocalizationScreen.tapItemJournal()
		testLocalizationScreen.tapItemHackerNews()
		testLocalizationScreen.tapButtonNextAtas()
	}
}