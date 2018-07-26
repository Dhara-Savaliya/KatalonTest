import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://www.seleniumeasy.com/test/')

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/i_tree-indicator glyphicon gly'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/a_Table Filter'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Table Data Fil/label'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Table Data Fil/button_All'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Table Data Fil/a_Date pickers'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Table Data Fil/a_Bootstrap Date Picker'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/span_input-group-addon'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/td_18'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/span_To'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/td_5'))

WebUI.click(findTestObject('Object Repository/Test 23/Page_Selenium Easy - Best Demo webs/td_20'))

WebUI.closeBrowser()

