package sample
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import org.openqa.selenium.Keys as Keys


class Helper {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUI.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUI.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}

	@Keyword
	def void deleteText(TestObject input) {
		WebUI.sendKeys(input, Keys.chord(Keys.CONTROL, 'A'))
		WebUI.sendKeys(input, Keys.chord(Keys.DELETE))
	}

	@Keyword
	def void clearText() {

		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/04_input_Employee Full Name_firstName'))
		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/05_input_Employee Full Name_middleName'))
		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/06_input_Employee Full Name_lastName'))
		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/08_input_Employee Id'))
		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/18_input_Date of Birth'))

//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/07_input_Nickname'))
//
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/09_input_Other Id'))
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/10_input_concat(Driver, , s License Number)'))
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/11_input_License Expiry Date'))
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/12_input_SSN Number'))
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/13_input_SIN Number'))
//
//
//		deleteText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/21_input_Military Service'))
	}
}