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

WebUI.navigateToUrl('https://www.amazon.in/')

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Online Shopping site in India Shop Onl_10c5f3/span_Hello, sign in'))

WebUI.setText(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Sign In/input_email'), '9014256112')

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Sign In/inputcontinue'))

WebUI.setEncryptedText(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Sign In/input_password'), '1Jx5G2o+w9Dv6alJbP1y5w==')

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Sign In/inputsignInSubmit'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Online Shopping site in India Shop Onl_10c5f3/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Online Shopping site in India Shop Onl_10c5f3/a_Best Sellers'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Bestsellers The most popular_e30680/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Bestsellers The most popular_e30680/a_New Releases'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Hot New Releases The bestsel_0a911b/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Hot New Releases The bestsel_0a911b/a_Movers and Shakers'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Echo  Alexa'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Fire TV'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Kindle E-Readers  eBooks'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Audible Audiobooks'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Amazon Prime Video'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_main menu'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Amazon Prime Music'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Mobiles, Computers'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_TV, Appliances, Electronics'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Mens Fashion'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Womens Fashion'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_main menu'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_Amazon Prime Music'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Mobiles, Computers'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_main menu'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/div_TV, Appliances, Electronics'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_main menu'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Mens Fashion'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Womens Fashion'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon.in Movers and Shakers The bigge_262905/a_Amazon Pay'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Pay/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Pay/div_Gift Cards  Mobile Recharges'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Pay/i_nav-sprite hmenu-arrow-prev'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Pay/a_Amazon Launchpad'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Launchpad Discover New Products_58a3dc/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Launchpad Discover New Products_58a3dc/a_Handloom and Handicrafts'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Karigar Shop for handlooms  han_382387/i_hm-icon nav-sprite'))

WebUI.click(findTestObject('Object Repository/Amazon_ALL_option001/Page_Amazon Karigar Shop for handlooms  han_382387/a_Sign Out'))

WebUI.closeBrowser()

