package features.loginAndAccount.cardDetails

enum CardDetailType {
	VISA_KONVEN("Visa Konven"),
	VISA_KONVEN_PREMIUM("Visa Konven Premium"),
	VISA_SYARIAH("Visa Syariah"),
	VISA_SYARIAH_PREMIUM("Visa Syariah Premium"),
	GPN("GPN"),
	GPN_GOLD("GPN Gold"),
	GPN_PLATINNUM("GPN Platinum"),
	GPN_SYARIAH("GPN Syariah"),
	GPN_SYARIAH_GOLD("GPN Syariah Gold"),
	GPN_SYARIAH_PLATINUM("GPN Syariah Platinum"),
	KARTU_JAKARTA("Kartu Jakarta")

	final String label

	CardDetailType(String label) {
		this.label = label
	}

	static CardDetailType from(String text) {
		def tab = values().find {
			it.label.equalsIgnoreCase(text)
		}
		if (!tab) {
			throw new IllegalArgumentException("Unknown tab: " + text)
		}
		return tab
	}
}