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
import com.todo.keywords.TodoKeywords as Todo

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC006 - Add Multiple Todo'), [('todos') : ['PHP', 'Javascript', 'CPP'
            , 'CSS', 'Java']], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC010 - Delete an Item'), [('index') : 0, ('todosCountAfterDelete') : 4], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC010 - Delete an Item'), [('index') : 0, ('todosCountAfterDelete') : 4], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC010 - Delete an Item'), [('index') : 0, ('todosCountAfterDelete') : 4], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC009 - Verify todos count'), [('todosCount') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

