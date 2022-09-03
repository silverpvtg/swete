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

WebUI.waitForElementVisible(findTestObject('Object Repository/OR02_Add to Cart/Page_Home Page - Magento eCommerce - websit_802ae6/img_Add to Compare_product-image-photo'), 
    0)

WebUI.click(findTestObject('Object Repository/OR02_Add to Cart/Page_Argus All-Weather Tank Magento Commerc_227e80/input_Qty_qty'))

WebUI.click(findTestObject('Object Repository/OR02_Add to Cart/Page_Argus All-Weather Tank Magento Commerc_227e80/div_M'))

WebUI.click(findTestObject('Object Repository/OR02_Add to Cart/Page_Argus All-Weather Tank Magento Commerc_227e80/div_Color_option-label-color-93-item-52'))

WebUI.setText(findTestObject('Object Repository/OR02_Add to Cart/Page_Argus All-Weather Tank Magento Commerc_227e80/input_Qty_qty'), 
    '99')

WebUI.click(findTestObject('Object Repository/OR02_Add to Cart/Page_Argus All-Weather Tank Magento Commerc_227e80/span_Add to Cart'))

WebUI.closeBrowser()

