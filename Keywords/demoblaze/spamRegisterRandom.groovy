package demoblaze

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.apache.commons.lang3.RandomStringUtils

public class spamRegisterRandom {
	/**
	 * Generate random user name based on no of characters
	 * 
	 * 
	 * @param noOfChar no of characters to generate random user name
	 * @return
	 */
	@Keyword(keywordObject='RandomUser')
	def randomizeUsername(int noOfChar) {
		String mainUsername = "eff_demo";
		String randomUsername = RandomStringUtils.random(noOfChar, true, true);
		String username = mainUsername + randomUsername;
		KeywordUtil.logInfo("Generated username with " + noOfChar + " characters : " + username);
		return username;
	}

	/**
	 * Automate login test steps instead of creating login test steps one by one in a test case
	 * 
	 * 
	 * @param username user name
	 * @param pass password
	 * @return
	 */
	@Keyword(keywordObject='RandomUser')
	def automateLogin(String username, String pass) {
		WebUI.navigateToUrl('https://www.demoblaze.com/index.html')

		WebUI.click(findTestObject('Object Repository/demoblaze/Page_STORE/a_Log in'))

		KeywordUtil.logInfo("Logging in with user name " + username);

		WebUI.setText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Username_loginusername'), username)

		WebUI.setEncryptedText(findTestObject('Object Repository/demoblaze/Page_STORE/input_Password_loginpassword'), pass)

		WebUI.click(findTestObject('Object Repository/demoblaze/Page_STORE/button_Log in'))

		WebUI.verifyElementPresent(findTestObject('Object Repository/demoblaze/Page_STORE/a_Log out'), 0)
	}
}
