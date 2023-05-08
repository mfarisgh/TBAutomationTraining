import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/input_Username_username'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/input_Password_password'), 
    pass)

WebUI.click(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/h2_Make Appointment'), 
    0)

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/cura/VerifyCuraData'), true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    facility, true)

WebUI.click(findTestObject('Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/input_Medicaid_programs', [('param') : program]))

WebUI.setText(findTestObject('Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    date)

WebUI.setText(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    comment)

WebUI.click(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cura_ParameterizedObj/Page_CURA Healthcare Service/h2_Appointment Confirmation'), 
    0)

WebUI.closeBrowser()

