import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import core.scaffold.ScaffoldTrigger

//ScaffoldTrigger.generateFeature("home")

//ScaffoldTrigger.generateStepsFromFeature(featurePath: "Include/features/profile/changeEmail.feature", stepDefPath: "Include/scripts/groovy/features/profile/changeemail/ChangeEmailStep.groovy")
ScaffoldTrigger.generateEpicWithoutFolder("loginAndAccount", "AccountListingTabunganList")
ScaffoldTrigger.generateStepsFromFeature(featurePath: "Include/features/loginAndAccount/AccountListingTabunganList.feature", stepDefPath: "Include/scripts/groovy/features/loginAndAccount/accountListingTabunganList/AccountListingTabunganListStep.groovy")
