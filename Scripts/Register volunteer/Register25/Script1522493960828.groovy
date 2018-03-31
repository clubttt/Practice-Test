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

WebUI.navigateToUrl('http://vivblind.play2pay.me/')

WebUI.click(findTestObject('Register_Page/a_'))

WebUI.setText(findTestObject('Register_Page/input_EMAIL (1)'), 'suphisit1@gmail.com')

WebUI.setText(findTestObject('Register_Page/input_PASSWORD'), '0857098359')

WebUI.setText(findTestObject('Register_Page/input_password_confirmation'), '0857098359')

WebUI.uploadFile(findTestObject('Register_Page/Upload File'), 'C:\\Users\\Administrator\\Desktop\\Test.jpg')

WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_TH'), 'ศุภิสิทธิ์ ')

WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_TH'), 'ไข่กา')

WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_EN'), 'Suphisit')

WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_EN'), 'Khaika')

WebUI.setText(findTestObject('Register_Page/input_BIRTH_DATE'), '13/10/1994')

WebUI.selectOptionByValue(findTestObject('Register_Page/select_'), 'อื่นๆ', true)

WebUI.selectOptionByValue(findTestObject('Register_Page/select__1'), 'สูงกว่าปริญญาตรี', true)

WebUI.selectOptionByValue(findTestObject('Register_Page/select__2'), 'เกษตรกร', true)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_NO'), '3')

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_MOO'), '10')

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ROAD'), 'พหลโยธิน')

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Register_Page/ADDRESS_PROVINCE'), '45', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Register_Page/ADDRESS_DISTRICT'), '665', false)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Register_Page/ADDRESS_SUBDISTRICT'), '14726', false)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_POSTCODE'), '57130')

WebUI.selectOptionByValue(findTestObject('Register_Page/select__3'), 'กำลังทำงาน', true)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ALL'), '3 หมู่ที่ 10 ต.โป่งผา อ.แม่สาย จ.เชียงราย')

WebUI.setText(findTestObject('Register_Page/input_PHONE'), '053646789')

WebUI.setText(findTestObject('Register_Page/input_CELL_PHONE'), '0827975510')

WebUI.setText(findTestObject('Register_Page/input_FAX'), '025445687')

WebUI.click(findTestObject('Register_Page/input_submit (1)'))

WebUI.closeBrowser()

