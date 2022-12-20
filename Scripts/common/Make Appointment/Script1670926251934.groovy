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

WebUI.selectOptionByValue(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/select_healthcare_center'), 
    healthCare, true)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_hospital'))

WebUI.click(findTestObject('Make Appointment/Page_CURA Healthcare Service/input_programs', [('program') : programs]))

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'), 
    GlobalVariable.date)

WebUI.setText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/textarea_Comment_comment'), 
    GlobalVariable.comment)

WebUI.click(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/h2_Appointment Confirmation'))

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/p_Tokyo CURA Healthcare Center'), 
    healthCare)

WebUI.verifyElementText(findTestObject('Object Repository/Make Appointment/Page_CURA Healthcare Service/p_Medicare'), programs)

