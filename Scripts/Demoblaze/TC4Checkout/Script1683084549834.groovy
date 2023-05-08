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

WebUI.callTestCase(findTestCase('Demoblaze/TC3AddToCart'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('demoblaze/Page_STORE/a_Cart'), 0)

WebUI.click(findTestObject('demoblaze/Page_STORE/a_Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/demoblaze/Page_STORE/td_Samsung galaxy s6'), 0)

WebUI.click(findTestObject('Object Repository/demoblaze/Page_STORE/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Name_name'), name)

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Country_country'), 'mesia')

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_City_city'), 'kolumpo')

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Credit card_card'), '123456789012')

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Month_month'), '09')

WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Year_year'), '2024')

WebUI.click(findTestObject('Object Repository/demoblaze/Page_STORE/button_Purchase'))

WebUI.verifyElementPresent(findTestObject('Object Repository/demoblaze/Page_STORE/h2_Thank you for your purchase'), 0)

