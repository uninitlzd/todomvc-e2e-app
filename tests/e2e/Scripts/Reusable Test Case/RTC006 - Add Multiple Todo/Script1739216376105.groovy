import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.todo.keywords.AddTodo as AddTodo
import com.todo.keywords.AddTodoMultiple as AddTodoMultiple
import com.todo.keywords.InitializeTodoApp as InitializeTodoApp
import com.todo.keywords.TodoKeywords as Todo
import com.todo.keywords.VerifyTodo as VerifyTodo
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

InitializeTodoApp.execute()

AddTodoMultiple.execute(todos)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC009 - Verify todos count'), [('todosCount') : todos.collect().size()], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Reusable Test Case/RTC008 - Verify text at certain index'), [('index') : 1, ('expectedValue') : todos[1]], 
    FailureHandling.STOP_ON_FAILURE)

