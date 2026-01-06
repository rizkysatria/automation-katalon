import com.kms.katalon.core.annotation.BeforeTestCase

import adapter.ExecutionAdapter
import adapter.GlueAdapter
import adapter.MobileCapabilitiesAdapter
import internal.GlobalVariable
import locators.LocatorAdapter

class GlobalListener {
    
    @BeforeTestCase
    def setupBeforeTestCase() { 
        GlueAdapter.init()
		ExecutionAdapter.init()
		LocatorAdapter.init()
		MobileCapabilitiesAdapter.init()
    } 
	
}   