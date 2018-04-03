import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/RegisterV/Register')

suiteProperties.put('name', 'Register')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Administrator\\Desktop\\Practice Test\\Reports\\RegisterV\\Register\\25610403_133852\\execution.properties")

TestCaseMain.beforeStart()

TestCaseMain.startTestSuite('Test Suites/RegisterV/Register', suiteProperties, [new TestCaseBinding('Test Cases/Register volunteer/Register01', 'Test Cases/Register volunteer/Register01',  null), new TestCaseBinding('Test Cases/Register volunteer/Register02', 'Test Cases/Register volunteer/Register02',  null), new TestCaseBinding('Test Cases/Register volunteer/Register03', 'Test Cases/Register volunteer/Register03',  null), new TestCaseBinding('Test Cases/Register volunteer/Register04', 'Test Cases/Register volunteer/Register04',  null), new TestCaseBinding('Test Cases/Register volunteer/Register05', 'Test Cases/Register volunteer/Register05',  null), new TestCaseBinding('Test Cases/Register volunteer/Register06', 'Test Cases/Register volunteer/Register06',  null), new TestCaseBinding('Test Cases/Register volunteer/Register07', 'Test Cases/Register volunteer/Register07',  null), new TestCaseBinding('Test Cases/Register volunteer/Register08', 'Test Cases/Register volunteer/Register08',  null), new TestCaseBinding('Test Cases/Register volunteer/Register09', 'Test Cases/Register volunteer/Register09',  null), new TestCaseBinding('Test Cases/Register volunteer/Register10', 'Test Cases/Register volunteer/Register10',  null), new TestCaseBinding('Test Cases/Register volunteer/Register11', 'Test Cases/Register volunteer/Register11',  null), new TestCaseBinding('Test Cases/Register volunteer/Register12', 'Test Cases/Register volunteer/Register12',  null), new TestCaseBinding('Test Cases/Register volunteer/Register13', 'Test Cases/Register volunteer/Register13',  null), new TestCaseBinding('Test Cases/Register volunteer/Register14', 'Test Cases/Register volunteer/Register14',  null), new TestCaseBinding('Test Cases/Register volunteer/Register15', 'Test Cases/Register volunteer/Register15',  null), new TestCaseBinding('Test Cases/Register volunteer/Register16', 'Test Cases/Register volunteer/Register16',  null), new TestCaseBinding('Test Cases/Register volunteer/Register17', 'Test Cases/Register volunteer/Register17',  null)])
