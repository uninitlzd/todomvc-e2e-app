package com.todo.keywords
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.Keys as Keys


import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class TodoKeywords {

	TestObject input = findTestObject('Object Repository/Page_TodoMVC/input_todos_new-todo')


	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}


	@Keyword
	def initializeTodoApp(String url = 'https://todomvc-e2e-app.vercel.app/#/') {
		WebUI.openBrowser('')
		WebUI.navigateToUrl(url)
	}

	def static getItems(def index = 10) {
		return WebUI.findWebElements(findTestObject('Object Repository/Page_TodoMVC/li_todo_item'), index)
	}

	def static getItemLabels(def index = 10) {
		return WebUI.findWebElements(findTestObject('Object Repository/Page_TodoMVC/todo_item--label'), index)
	}

	@Keyword
	def markTodoAsComplete(int index = 0) {
		def toggles = findTestObject('Object Repository/Page_TodoMVC/input_toggle')
		WebUI.click(toggles[index])
	}

	@Keyword
	def editTodo(int index, String newText) {
		WebDriver webDriver = DriverFactory.getWebDriver()
		List<WebElement> todoItems = getItems(index)
		TestObject editInput = findTestObject('Object Repository/Page_TodoMVC/todo_item--edit')

		WebElement el = todoItems[index]
		Actions actions = new Actions(webDriver)
		actions.doubleClick(el)
		actions.keyDown(Keys.SHIFT)    // Hold SHIFT
				.sendKeys(Keys.ARROW_UP) // Press UP while SHIFT is held
				.keyUp(Keys.SHIFT)       // Release SHIFT
				.sendKeys(Keys.BACK_SPACE) // Press BACKSPACE
				.perform()

		actions.sendKeys(newText)
				.sendKeys(Keys.ENTER)
				.perform()
	}

	@Keyword
	def deleteTodo(int index = 0) {
		def todoItems = getItems(index)
		WebUI.mouseOver(todoItems[index])
		WebUI.click(findTestObject('Object Repository/Page_TodoMVC/todo_item--btn_destroy'))
	}

	@Keyword
	def filterTodos(String filter) {
		WebUI.click(findTestObject("Object Repository/Page_TodoMVC/filter--${filter}"))
	}

	@Keyword
	def clearCompleted() {
		WebUI.click(findTestObject('Object Repository/Page_TodoMVC/filter-btn_clear-completed'))
	}


	@Keyword
	def static getText(int index) {
		List<WebElement> todoItemLabels = getItemLabels(index)


		try {
			return todoItemLabels.get(index).getText()
		} catch (Exception ex) {
			return ''
		}
	}
}