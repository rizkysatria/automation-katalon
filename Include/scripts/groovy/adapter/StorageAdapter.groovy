package adapter

import core.runtime.storage.StorageManager
import localStorage.StoreKey

public class StorageAdapter {

	static void init() {
		StorageManager.set(StoreKey.USERNAME.name(), "emilys")
		StorageManager.set(StoreKey.PASSWD.name(), "emilyspass")
	}
}
