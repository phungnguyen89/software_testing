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

WebUI.setText(findTestObject('Object Repository/Update_Contact_Detail/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Update_Contact_Detail/input_Password_password'), 'hUKwJTbofgPU9eVlw/CnDQ==')

WebUI.sendKeys(findTestObject('Object Repository/Update_Contact_Detail/input_Password_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Update_Contact_Detail/a_PIM'))

WebUI.click(findTestObject('Object Repository/Update_Contact_Detail/div_EID1111AaliyahfirstNamefirstName middle_e7c24d'))

WebUI.click(findTestObject('Object Repository/Update_Contact_Detail/a_Contact Details'))

CustomKeywords.'sample.Helper.deleteText'(findTestObject('Update_Contact_Detail/input_Street 1_oxd-input oxd-input--focus'))

CustomKeywords.'sample.Helper.deleteText'(findTestObject('Update_Contact_Detail/input_StateProvince_oxd-input oxd-input--focus'))

CustomKeywords.'sample.Helper.deleteText'(findTestObject('Update_Contact_Detail/input_ZipPostal Code_oxd-input oxd-input--focus'))

CustomKeywords.'sample.Helper.deleteText'(findTestObject('Update_Contact_Detail/input_Home_oxd-input oxd-input--focus'))

CustomKeywords.'sample.Helper.deleteText'(findTestObject('Update_Contact_Detail/input_Work Email_oxd-input oxd-input--focus'))

WebUI.setText(findTestObject('Object Repository/Update_Contact_Detail/input_Street 1_oxd-input oxd-input--focus'), street)

WebUI.setText(findTestObject('Update_Contact_Detail/input_StateProvince_oxd-input oxd-input--focus'), state)

WebUI.setText(findTestObject('Update_Contact_Detail/input_ZipPostal Code_oxd-input oxd-input--focus'), zipCode)

WebUI.setText(findTestObject('Update_Contact_Detail/input_Home_oxd-input oxd-input--focus'), phone)

WebUI.click(findTestObject('Object Repository/Update_Contact_Detail/button_Save'))

WebUI.click(findTestObject('Object Repository/Update_Contact_Detail/p_Success'))

WebUI.closeBrowser()

