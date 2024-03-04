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

WebUI.callTestCase(findTestCase('CURA_Validation Of Test Cases/TC_CURA Healthcare Service_Login_002'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/i_CURA Healthcare_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'), 'Make Appointment')

WebUI.comment('CURA Appointment page is displayed')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Facility'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Apply for hospital readmission'), 
    'Apply for hospital readmission')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Healthcare Program'), 'Healthcare Program')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Medicaid'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Visit Date (Required)'), 'Visit Date (Required)')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/th_'))

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/td_21'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/label_Comment'), 'Comment')

WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/textarea_Comment_comment'), 'Testing')

WebUI.takeScreenshot()

WebUI.comment('Filling valid information in Appointment page to book Appointment')

WebUI.verifyElementText(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'), 'Book Appointment')

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/div_Appointment Confirmation               _7d61e7'), 
    0)

WebUI.takeScreenshot()

