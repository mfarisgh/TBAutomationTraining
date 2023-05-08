package customOne

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class customOccupation {
	@Keyword(keywordObject='Job')
	def occChoose(int num) {
		String type;
		switch(num) {
			case 1:
				type = "Auto";
				println(type);
				break;

			case 2:
				type = "Manual";
				println(type);
				break;
		}
		return type;
	}

	@Keyword(keywordObject='Job')
	def occCalc(int num1, int calc, int num2) {
		int calcRes;
		switch(calc) {
			case 1:
				calcRes = num1 + num2;
				println(calcRes);
				break;

			case 2:
				calcRes = num1 - num2;
				println(calcRes);
				break;

			case 3:
				calcRes = num1 * num2;
				println(calcRes);
				break;

			case 4:
				calcRes = num1 / num2;
				println(calcRes);
				break;
		}
		return calcRes;
	}
}
