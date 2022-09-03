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

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/OR01_Login/Page_Home Page - Magento eCommerce - websit_802ae6/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/input_Email_loginusername'), 
    'roni_cost@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/input_Password_loginpassword'), 
    'C5AHXkW0b5qPvzP9ADqdDdqcjNuzfIiq')

WebUI.click(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/span_Sign In'))

WebUI.setText(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/input_Email_loginusername'), 
    'roni_cost@example.com')

WebUI.setEncryptedText(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/input_Password_loginpassword'), 
    'C5AHXkW0b5qPvzP9ADqdDdqcjNuzfIiq')

WebUI.setText(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/input_Please type the letters and numbers b_5877e6'), 
    'n93M2')

WebUI.click(findTestObject('Object Repository/OR01_Login/Page_Customer Login Magento Commerce - webs_3d8219/span_Sign In'))

WebUI.closeBrowser()

