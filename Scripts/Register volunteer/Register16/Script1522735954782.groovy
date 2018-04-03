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

WebUI.setText(findTestObject('Register_Page/input_EMAIL (1)'), '')

WebUI.setText(findTestObject('Register_Page/input_PASSWORD'), '')

WebUI.setText(findTestObject('Register_Page/input_password_confirmation'), '')

WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_TH'), '')

WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_TH'), '')

WebUI.setText(findTestObject('Register_Page/input_FIRST_NAME_EN'), '')

WebUI.setText(findTestObject('Register_Page/input_LAST_NAME_EN'), '')

WebUI.setText(findTestObject('Register_Page/input_BIRTH_DATE'), '')

WebUI.selectOptionByValue(findTestObject('Register_Page/select_'), '', true)

WebUI.selectOptionByValue(findTestObject('Register_Page/select__1'), '', true)

WebUI.selectOptionByValue(findTestObject('Register_Page/select__2'), '', true)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_NO'), '')

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_MOO'), '')

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ROAD'), '')

WebUI.selectOptionByValue(findTestObject('Register_Page/ADDRESS_PROVINCE'), '', false)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_POSTCODE'), '')

WebUI.selectOptionByValue(findTestObject('Register_Page/select__3'), '', true)

WebUI.setText(findTestObject('Register_Page/input_ADDRESS_ALL'), '')

WebUI.setText(findTestObject('Register_Page/input_PHONE'), '')

WebUI.setText(findTestObject('Register_Page/input_CELL_PHONE'), '')

WebUI.setText(findTestObject('Register_Page/input_FAX'), '')

WebUI.click(findTestObject('Register_Page/input_submit (1)'))

WebUI.verifyTextPresent('กรุณากรอกรหัสสมาชิก', false)

WebUI.verifyTextPresent('กรุณากรอกรหัสผ่าน', false)

WebUI.verifyTextPresent('กรุณายืนยันรหัสผ่านของท่าน', false)

WebUI.verifyTextPresent('กรุณากรอกชื่อ', false)

WebUI.verifyTextPresent('กรุณากรอกนามสกุล', false)

WebUI.verifyTextPresent('กรุณากรอกชื่อภาษาอังกฤษ', false)

WebUI.verifyTextPresent('กรุณากรอกนามสกุลภาษาอังกฤษ', false)

WebUI.verifyTextPresent('กรุณาเลือกศาสนา', false)

WebUI.verifyTextPresent('กรุณาเลือกระดับการศึกษา', false)

WebUI.verifyTextPresent('กรุณาเลือกอาชีพ', false)

WebUI.verifyTextPresent('กรุณาเลือกจังหวัด', false)

WebUI.verifyTextPresent('กรุณาเลือกอำเภอ', false)

WebUI.verifyTextPresent('กรุณาเลือกตำบล', false)

WebUI.verifyTextPresent('กรุณากรอกรหัสไปรษณีย์', false)

WebUI.verifyTextPresent('กรุณาเลือกสถานะ การศึกษา,ทำงาน', false)

WebUI.verifyTextPresent('กรุณากรอกเบอร์มือถือ', false)

WebUI.closeBrowser()

