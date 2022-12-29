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

WebUI.navigateToUrl('https://opensource-demo.orangehrmlive.com/web/index.php/auth/login')

WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Add_Employee/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.click(findTestObject('Object Repository/Add_Employee/button_Login'))

WebUI.click(findTestObject('Object Repository/Add_Employee/span_PIM'))

WebUI.click(findTestObject('Object Repository/Add_Employee/a_Add Employee'))

WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Employee Full Name_firstName'), firstName)

WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Employee Full Name_middleName'), middleName)

WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Employee Full Name_lastName'), lastName)

not_run: CustomKeywords.'sample.Helper.deleteText'(findTestObject('Add_Employee/input_Employee Id_oxd-input oxd-input--focus'))

not_run: WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Employee Id_oxd-input oxd-input--focus'), employeeId)

WebUI.click(findTestObject('Add_Employee/toggle_detail'))

WebUI.setText(findTestObject('Add_Employee/input_Username_oxd-input oxd-input--focus'), username)

WebUI.setText(findTestObject('Object Repository/Add_Employee/input_Password_oxd-input oxd-input--focus o_671073'), password)

WebUI.setText(findTestObject('Add_Employee/input_Confirm Password_oxd-input oxd-input--focus'), password)

WebUI.click(findTestObject('Object Repository/Add_Employee/button_Save'))

WebUI.click(findTestObject('Object Repository/Add_Employee/p_Success'))

WebUI.closeBrowser()

