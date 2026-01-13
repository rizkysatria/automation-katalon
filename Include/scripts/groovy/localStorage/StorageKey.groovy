package localStorage
/**
 * Centralized registry for all runtime keys used by SimpleThreadStore.
 * Purpose:
 * --------
 * - Avoid string-based keys and typo issues
 * - Make runtime state discoverable in ONE place
 * - Improve readability and maintainability
 *
 * How to use:
 * -----------
 * Set value:
 *   LocalStore.set(StoreKey.IS_LOGGED_IN.name(), true)
 *
 * Get value with default:
 *   boolean loggedIn =
 *       LocalStore.get(StoreKey.IS_LOGGED_IN.name(), false)
 *
 * Check existence:
 *   if (LocalStore.has(StoreKey.TOKEN.name())) { ... }
 *
 * Remove value:
 *   LocalStore.remove(StoreKey.SKIP_LOGIN.name())
 */


enum StoreKey {
	USERNAME,
	PASSWD,
}