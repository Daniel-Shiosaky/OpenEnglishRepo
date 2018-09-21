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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.mailinator.com/')

WebUI.setText(findTestObject('Page_Mailinator/input_inboxfield'), 'jenkins.desktopleveltwo@mailinator.com')

WebUI.click(findTestObject('Page_Mailinator/button_Go'))

WebUI.click(findTestObject('Page_Mailinator/div_Sandbox Bienvenido a Open'))

WebUI.switchToWindowTitle('')

WebUI.click(findTestObject('Page_Mailinator/img'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/h2_Crea tu perfil'))

not_run: WebUI.setText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni'), 'jenkins.desktopleveltwo@mailinator.com')

not_run: WebUI.setText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_1'), 'jenkins.desktopleveltwo@mailinator.com')

not_run: WebUI.setText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_2'), 'jenkins.desktopleveltwo@mailinator.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_3'), 'w8atsD+HWGA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_4'), '5YBX8nk5MuA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_5'), 'KMoFZeaWkJg=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_6'), 'P11S1FO2cCA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_7'), 'NuaXv/4AAps=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_8'), 'cMQcevJf9ME=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_9'), 'QJblfja5Cso=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_10'), 
    'QJblfja5Cso=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_11'), 
    'FdO0uRdxX7w=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_12'), 
    'N8dYfePzTlk=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_13'), 
    'opsn5aT1huw=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_14'), 
    'xy2cDMAbuuQ=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_15'), 
    'SNZVX1sRRm0=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_16'), 
    'YYihmgnHZBQ=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_17'), 
    'YYihmgnHZBQ=')

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/div_Tus Credenciales Elige un'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_18'), 
    'w8atsD+HWGA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_19'), 
    '5YBX8nk5MuA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_20'), 
    'KMoFZeaWkJg=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_21'), 
    'P11S1FO2cCA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_22'), 
    'NuaXv/4AAps=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_23'), 
    'cMQcevJf9ME=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_24'), 
    'QJblfja5Cso=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_25'), 
    'w8atsD+HWGA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_26'), 
    '5YBX8nk5MuA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_27'), 
    'KMoFZeaWkJg=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_28'), 
    'P11S1FO2cCA=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_29'), 
    'NuaXv/4AAps=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_30'), 
    'cMQcevJf9ME=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_31'), 
    'QJblfja5Cso=')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_OpenEnglish/input_Elige un correo electrni_32'), 
    'QJblfja5Cso=')

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_SIGUIENTE'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_SIGUIENTE'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_Regresar'))

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenEnglish/select_MM010203040506070809101'), 
    '07', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenEnglish/select_DD010203040506070809101'), 
    '12', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenEnglish/select_AAAA1928192919301931193'), 
    '1995', true)

not_run: WebUI.selectOptionByValue(findTestObject('Object Repository/Page_OpenEnglish/select_GneroMasculinoFemenino'), 'M', 
    true)

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_SIGUIENTE'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/td_Nada de ingls'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_SIGUIENTE_1'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/a_0  1 ao'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_SIGUIENTE_2'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_CONOCE LOS CONSEJOS'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/input_He Ledo_paddingClass'))

not_run: WebUI.click(findTestObject('Object Repository/Page_OpenEnglish/button_INICIA TU CURSO YA'))

not_run: WebUI.closeBrowser()

