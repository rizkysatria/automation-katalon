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
 *   LocalStore.set(StoreKey.IS_LOGGED_IN, true)
 *
 * Get value with default:
 *   boolean loggedIn =
 *       LocalStore.get(StoreKey.IS_LOGGED_IN, false)
 *
 * Check existence:
 *   if (LocalStore.has(StoreKey.TOKEN)) { ... }
 *
 * Remove value:
 *   LocalStore.remove(StoreKey.SKIP_LOGIN)
 */


enum StoreKey {

    IS_LOGGED_IN,
    USERNAME,
    USER_ID,
    TOKEN,
    IS_FIRST_LAUNCH,
    HAS_ONBOARDING,
    SKIP_LOGIN

}