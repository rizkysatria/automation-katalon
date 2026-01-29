package features.loginAndAccount.accountListing

enum AccountListType {
	TABUNGAN("Tabungan", "TABUNGAN"),
	EWALLET("E-Wallet", "EWALLET"),
	TABUNGAN_RENCANA("Tabungan Rencana", "TABUNGAN_RENCANA"),
	DEPOSITO("Deposito", "DEPOSITO"),
	PINJAMAN("Pinjaman", "PINJAMAN")

	final String label
	final String key

	AccountListType(String label, String key) {
		this.label = label
		this.key = key
	}

	static AccountListType from(String text) {
		def tab = values().find {
			it.label.equalsIgnoreCase(text)
		}
		if (!tab) {
			throw new IllegalArgumentException("Unknown tab: " + text)
		}
		return tab
	}
}