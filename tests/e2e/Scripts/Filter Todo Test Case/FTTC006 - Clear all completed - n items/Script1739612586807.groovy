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
import com.todo.keywords.VerifyTodo

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

def todos = ['PHP', 'Javascript', 'CPP', 'CSS', 'Java']

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC006 - Add Multiple Todo'), [('todos') : todos], FailureHandling.STOP_ON_FAILURE)

for (def index : (1..loopEnd)) {
    WebUI.callTestCase(findTestCase('Reusable Test Case/RTC011 - Set an Item to done'), [('sequence') : index], FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC012 - Check Items Left Text Count'), [('expectedCount') : todos.size() - 
        loopEnd], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_TodoMVC/filter--btn_clear-completed'))

VerifyTodo.countEqual(todos.size() - loopEnd)

WebUI.closeBrowser()

