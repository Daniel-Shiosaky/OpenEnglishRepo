import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://learningplatform.stg.openenglish.com/login.html')

WebUI.setText(findTestObject('Object Repository/Page_OpenEnglish/input_Welcome_email'), 'daniel.oeauto+4@mailinator.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Welcome_password'), 'QJblfja5Cso=')

WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_Log In'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_OpenEnglish/small_The email you entered is'), 30)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_Log In'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Page_OpenEnglish/small_The email you entered is'), 30)

WebUI.closeBrowser()

