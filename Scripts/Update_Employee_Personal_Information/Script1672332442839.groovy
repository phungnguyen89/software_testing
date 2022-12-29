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
import org.junit.After as After
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Test Cases/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/01_a_PIM'))

WebUI.click(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/02_button_Search'))

WebUI.click(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/03_Detail_Employee'))

CustomKeywords.'sample.Helper.clearText'()

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/04_input_Employee Full Name_firstName'), firstName)

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/05_input_Employee Full Name_middleName'), middleName)

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/06_input_Employee Full Name_lastName'), lastName)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/07_input_Nickname'), nickName)

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/08_input_Employee Id'), employeeId)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/09_input_Other Id'), otherId)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/10_input_concat(Driver, , s License Number)'), drivingLicense)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/11_input_License Expiry Date'), drivingLicenseExpiredDate)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/12_input_SSN Number'), ssnNumber)

//WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/13_input_SIN Number'), sinNumber)

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/18_input_Date of Birth'), birthday)

WebUI.setText(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/21_input_Military Service'), militaryService)

WebUI.click(findTestObject('OrangeHRM/PIM_Update_Employee_Personal_Information/23_button_Save_inforamtion'))

