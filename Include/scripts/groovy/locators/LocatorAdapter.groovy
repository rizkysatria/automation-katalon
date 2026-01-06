package locators

import core.LocatorStore
import internal.GlobalVariable

public class LocatorAdapter {

	static final String PLATFORM_IOS = "ios"
	
	void init() {
		if (GlobalVariable.platform.toString().toLowerCase() == PLATFORM_IOS) {
			LocatorStore.init(IOSLocator)
		} else {
			LocatorStore.init(AndroidLocator)
		}
	}

}
