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

for (def index : (0..2)) {

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.deleteAllCookies()

WebUI.navigateToUrl('https://app.papaya.cl/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('Object Repository/Page_Login - Papaya Facturacin Elec/input_Email_Email'), 'soporte@papaya.cl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - Papaya Facturacin Elec/input_Contrasea_Password'), 
    'p1abwHQQl5YObcYsFQb+lA==')

WebUI.click(findTestObject('Object Repository/Page_Login - Papaya Facturacin Elec/a_Ingresar'))

WebUI.click(findTestObject('Object Repository/Page_Empresa - Papaya Facturacin El/strong_JULQ ASESORAS SPA'))

WebUI.click(findTestObject('Object Repository/Page_Bienvenido - Papaya Facturacin/a_Emitir Factura Exenta'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_2MiCliente'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/span_Seleccione_caret'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_TURNER INVERSIONES SPA'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/select_Seleccione'), '2631', 
    true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/span_CM_caret'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_CM'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_3Detalle'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/input_Buscar en catlogo_TipoIn'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/span_Buscar en catlogo..._care'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Formateos            0023'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/select_Buscar en catlogo...'), 
    '524', true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Aadir Lnea'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_4PagoyOtros'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/span_Seleccione_caret_1'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Tarjeta de Crdito'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/select_Seleccione             _1'), 
    'TC', true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/span_Das pago_caret'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_30'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/select_0'), '30', true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Aadir medio de pago'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Emitir'))

WebUI.delay(4)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/a_Confirmar'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Emitir Factura Exenta - Papaya/button_Terminar'))

WebUI.closeBrowser()

}