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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.stg.openenglish.com/')

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_firstName'), FirstName)

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_lastName'), LastName)

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_emailAddress'), Email)

WebUI.selectOptionByValue(findTestObject('Page_Open English Sitio Oficial. Cl/select_Pas de residencia Argen'), country, 
    true)

WebUI.selectOptionByValue(findTestObject('Page_Open English Sitio Oficial. Cl/select_Regin donde reside Chuq'), city, true)

WebUI.click(findTestObject('Page_Open English Sitio Oficial. Cl/label_Celular'))

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_form-control phone-input'), phone1)

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_form-control phone-input_1'), phone3)

WebUI.setText(findTestObject('Page_Open English Sitio Oficial. Cl/input_form-control phone-input_2'), phone4)

WebUI.click(findTestObject('Page_Open English Sitio Oficial. Cl/label_Para m'))

WebUI.selectOptionByValue(findTestObject('Page_Open English Sitio Oficial. Cl/select_Qu edad tienes 0-7 aos8'), '4', true)

WebUI.click(findTestObject('Page_Open English Sitio Oficial. Cl/button_Comienza ahora'))

WebUiBuiltInKeywords.delay(30)

not_run: WebUI.navigateToUrl('https://test.salesforce.com/')

not_run: WebUI.setText(findTestObject('Page_Login  Salesforce/input_username'), 'shiosaky@gmail.com')

not_run: WebUI.setText(findTestObject('Page_Login  Salesforce/input_pw'), 'DS.4285716010*')

not_run: WebUI.click(findTestObject('Page_Login  Salesforce/input_Login'))

not_run: WebUI.click(findTestObject('Page_Salesforce - Performance Editi/a_Leads'))

not_run: WebUI.setText(findTestObject('Page_Leads Home  Salesforce - Perfo/input_str'), Email)

not_run: WebUI.click(findTestObject('Page_Leads Home  Salesforce - Perfo/input_phSearchButton'))

not_run: WebUiBuiltInKeywords.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/Page_Search Results  Salesforce - P (1)/a_StudentName'))

not_run: WebUI.click(findTestObject('Page_Lead Daniel Levelthree  Salesf/input_sales_tool'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0frmConditionscmdOrg'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/button_SELECT DISCOUNT'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_1'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_2'))

not_run: WebUiBuiltInKeywords.delay(15)

not_run: WebUI.switchToFrame(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/iframe_immediateCapture_iframe'), 
    5)

not_run: WebUiBuiltInKeywords.delay(5)

not_run: WebUI.selectOptionByLabel(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/select_VisaMasterCard'), 
    'Visa', false)

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardNumber'), '4012 8888 8888 1881')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardExpiry'), '10 / 2019')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardName'), 'Approved')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_CardCvv'), '123')

not_run: WebUI.setText(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/input_contractHolderName'), 
    'Approved')

not_run: WebUiBuiltInKeywords.delay(5)

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/label_I accept the terms and w'))

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/label_Term of the Course I und'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Sales Tool  Salesforce - Perfo (1)/button_Submit payment'))

not_run: WebUiBuiltInKeywords.delay(60)

not_run: WebUI.verifyTextPresent('Congratulations your Payment', true)

'Switch back to current window'
not_run: WebUI.switchToDefaultContent()

not_run: WebUI.click(findTestObject('Page_Sales Tool  Salesforce - Perfo/input_j_id0j_id110j_id111mainF_3'))

not_run: WebUiBuiltInKeywords.delay(15)

WebUI.closeBrowser()

