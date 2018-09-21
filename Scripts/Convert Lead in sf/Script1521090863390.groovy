import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUiBuiltInKeywords.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://test.salesforce.com/')

WebUiBuiltInKeywords.delay(5)

WebUI.setText(findTestObject('Page_Login  Salesforce/input_username'), UserName)

WebUI.setText(findTestObject('Page_Login  Salesforce/input_pw'), Password)

WebUI.click(findTestObject('Page_Login  Salesforce/input_Login'))

WebUiBuiltInKeywords.delay(5)

WebUI.click(findTestObject('Page_Salesforce - Performance Editi/a_Leads'))

WebUI.setText(findTestObject('Page_Leads Home  Salesforce - Perfo/input_str'), Email)

WebUI.click(findTestObject('Page_Leads Home  Salesforce - Perfo/input_phSearchButton'))

WebUiBuiltInKeywords.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Search Results  Salesforce - P (1)/a_StudentName'))

WebUI.click(findTestObject('Page_Lead Daniel Levelthree  Salesf/input_sales_tool'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0frmConditionscmdOrg'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/button_SELECT DISCOUNT'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_1'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_2'))

WebUiBuiltInKeywords.delay(30)

WebUI.switchToFrame(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/iframe_immediateCapture_iframe'), 
    5)

WebUiBuiltInKeywords.delay(5)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/select_VisaMasterCard'), 
    'Visa', false)

WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardNumber'), '4012 8888 8888 1881')

WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardExpiry'), '10 / 2019')

WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardName'), 'Approved')

WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardCvv'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_contractHolderName'), 'Approved')

WebUiBuiltInKeywords.delay(5)

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/label_I accept the terms and w'))

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/label_Term of the Course I und'))

WebUiBuiltInKeywords.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/button_Submit payment'))

WebUiBuiltInKeywords.delay(60)

WebUI.verifyTextPresent('Congratulations! Your payment is successfully processed!', true)

'Switch back to current window'
WebUI.switchToDefaultContent()

WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_3'))

WebUiBuiltInKeywords.delay(15)

WebUI.closeBrowser()

