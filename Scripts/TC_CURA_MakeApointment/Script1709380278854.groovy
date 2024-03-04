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

CustomKeywords.'example.MyKeywords.AppLogin'()

for (def n : (0..2)) {
    WebUI.selectOptionByIndex(findTestObject('Page_CURA Healthcare Service/select_Tokyo CURA Healthcare Center        _5b4107'), 
        1)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Apply for hospital readmission'))

    if (n == 0) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Medicaid'))

        WebUI.delay(1)
    } else if (n == 1) {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Medicaid'))
    } else {
        WebUI.click(findTestObject('Page_CURA Healthcare Service/label_Medicaid'))

        WebUI.delay(1)
    }
    
    WebUI.setText(findTestObject('Page_CURA Healthcare Service/txtVisitDate'), '02/09/2022')

    WebUI.setText(findTestObject('Page_CURA Healthcare Service/textarea_Comment_comment'), 'Test Katalon')

    WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Book Appointment'))

    WebUI.verifyElementPresent(findTestObject('Page_CURA Healthcare Service/h2Appointment Confirmation'), 3)

    WebUI.click(findTestObject('Page_CURA Healthcare Service/btnGotoHomepage'))

    CustomKeywords.'example.MyKeywords.Congrats'('You')
}

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Page_CURA Healthcare Service/a_History'))

WebUI.takeScreenshot()

WebUI.verifyElementText(findTestObject('Page_CURA Healthcare Service/div_History'), 'History')

WebUI.closeBrowser()

