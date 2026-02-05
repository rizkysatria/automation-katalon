import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import adapter.ExecutionAdapter
import adapter.GlueAdapter
import adapter.MobileCapabilitiesAdapter
import adapter.StorageAdapter
import core.runtime.locator.LocatorRegistry
import core.runtime.storage.StorageManager
import cucumber.api.java.After
import internal.GlobalVariable
import localStorage.StoreKey
import locators.AndroidLocator
import locators.IOSLocator

class GlobalListener {
    
    @BeforeTestCase
    def setupBeforeTestCase() { 
        GlueAdapter.init()
		ExecutionAdapter.init()
//		MobileCapabilitiesAdapter.init()
		initLocator()
		StorageAdapter.init()
		Mobile.startApplication(GlobalVariable.APP_PATH, false)
		
    } 
	
	private void initLocator() {
		if (GlobalVariable.platform.toString() == "android") {
			LocatorRegistry.register(AndroidLocator)
		} else {
			LocatorRegistry.register(IOSLocator)
		}
	}
}   