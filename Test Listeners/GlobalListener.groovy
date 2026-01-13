import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import adapter.ExecutionAdapter
import adapter.GlueAdapter
import adapter.MobileCapabilitiesAdapter
import core.runtime.locator.LocatorRegistry
import internal.GlobalVariable
import locators.AndroidLocator
import locators.IOSLocator
//import core.runtime.storage

class GlobalListener {
    
    @BeforeTestCase
    def setupBeforeTestCase() { 
        GlueAdapter.init()
		ExecutionAdapter.init()
//		MobileCapabilitiesAdapter.init()
		initLocator()
		runApp()
    } 
	
	private void initLocator() {
		if (GlobalVariable.platform.toString() == "android") {
			LocatorRegistry.register(AndroidLocator)
		} else {
			LocatorRegistry.register(IOSLocator)
		}
	}
	
	private void runApp() {
		Mobile.startApplication(GlobalVariable.APP_PATH, false)
	}
	
	private void initStorageManager() {
//		StorageManager.setMetaClass()
//		LocalStore .set(StoreKey.IS_LOGGED_IN.name(), true)
	}
	
}   