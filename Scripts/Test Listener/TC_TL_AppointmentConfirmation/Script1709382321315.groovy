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

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_CURA Healthcare Service/h2_Make Appointment'))

WebUI.selectOptionByValue(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
    'Hongkong CURA Healthcare Center', true)

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_Apply for hospital readmission_hospit_63901f'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/input_programs'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/span_Visit Date (Required)_glyphicon glyphi_cada34'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/td_21'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'Testing')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/h2Appointment Confirmation'), 'Appointment Confirmation')

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_History'))

WebUI.takeScreenshot()

WebUI.verifyCheckpoint(findCheckpoint('Checkpoints/Checkpoint_TestData/Cura_AppointmentConfirmation_TestData_Checkpoint'), 
    true)

