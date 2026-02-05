package feature.testLocalization

import core.ui.UIAction
import core.ui.UIAssert
import internal.GlobalVariable
import localization.Localize

public class TestLocalizationScreen {

	void assertTitleScreen() {
		UIAction.waitShort()
		UIAssert.textEquals("TITLE_HOME_SCREEN", Localize.get("TITLE_HOME_SCREEN"))
	}

	void tapButtonNextAtas() {
		UIAction.waitShort()
		UIAssert.textEquals("TITLE_BTN_NEXT_ATAS", Localize.get("TITLE_BTN_NEXT_ATAS"))
		UIAction.tap("TITLE_BTN_NEXT_ATAS")
	}

	void tapItemJournal() {
		UIAction.waitShort()
		UIAssert.textEquals("LIST_ITEM_CODING_JURNAL", Localize.get("LIST_ITEM_CODING_JURNAL"))
		UIAction.tap("LIST_ITEM_CODING_JURNAL")
	}
	
	void tapItemHackerNews() {
		UIAction.waitShort()
		UIAssert.textEquals("LIST_ITEM_HACKER_NEWS", Localize.get("LIST_ITEM_HACKER_NEWS"))
		UIAction.tap("LIST_ITEM_HACKER_NEWS")
	}
}
