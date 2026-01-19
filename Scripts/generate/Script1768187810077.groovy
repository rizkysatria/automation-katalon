import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import core.scaffold.ScaffoldTrigger

//ScaffoldTrigger.generateFeature("home")

ScaffoldTrigger.generateStepsFromFeature(featurePath: "Include/features/profile/changeLanguage.feature", stepDefPath: "Include/scripts/groovy/features/profile/changelanguage/ChangeLanguageStep.groovy")
//ScaffoldTrigger.generateEpicWithoutFolder("profile", "ChangeLanguage")
//ScaffoldTrigger.generateEpic("profile", "Referral")