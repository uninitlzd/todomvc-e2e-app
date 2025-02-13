
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.util.List

import java.lang.String

import com.kms.katalon.core.testobject.TestObject



def static "com.todo.keywords.AddTodoMultiple.execute"(
    	List todoTextArr	) {
    (new com.todo.keywords.AddTodoMultiple()).execute(
        	todoTextArr)
}


def static "com.todo.keywords.InitializeTodoApp.execute"(
    	String url	) {
    (new com.todo.keywords.InitializeTodoApp()).execute(
        	url)
}


def static "com.todo.keywords.InitializeTodoApp.execute"() {
    (new com.todo.keywords.InitializeTodoApp()).execute()
}

 /**
	 * Refresh browser
	 */ 
def static "com.todo.keywords.TodoKeywords.refreshBrowser"() {
    (new com.todo.keywords.TodoKeywords()).refreshBrowser()
}

 /**
	 * Click element
	 * @param to Katalon test object
	 */ 
def static "com.todo.keywords.TodoKeywords.clickElement"(
    	TestObject to	) {
    (new com.todo.keywords.TodoKeywords()).clickElement(
        	to)
}


def static "com.todo.keywords.TodoKeywords.initializeTodoApp"(
    	String url	) {
    (new com.todo.keywords.TodoKeywords()).initializeTodoApp(
        	url)
}


def static "com.todo.keywords.TodoKeywords.markTodoAsComplete"(
    	int index	) {
    (new com.todo.keywords.TodoKeywords()).markTodoAsComplete(
        	index)
}


def static "com.todo.keywords.TodoKeywords.editTodo"(
    	int index	
     , 	String newText	) {
    (new com.todo.keywords.TodoKeywords()).editTodo(
        	index
         , 	newText)
}


def static "com.todo.keywords.TodoKeywords.deleteTodo"(
    	int index	) {
    (new com.todo.keywords.TodoKeywords()).deleteTodo(
        	index)
}


def static "com.todo.keywords.TodoKeywords.filterTodos"(
    	String filter	) {
    (new com.todo.keywords.TodoKeywords()).filterTodos(
        	filter)
}


def static "com.todo.keywords.TodoKeywords.clearCompleted"() {
    (new com.todo.keywords.TodoKeywords()).clearCompleted()
}


def static "com.todo.keywords.TodoKeywords.getText"(
    	int index	) {
    (new com.todo.keywords.TodoKeywords()).getText(
        	index)
}


def static "com.todo.keywords.TodoKeywords.initializeTodoApp"() {
    (new com.todo.keywords.TodoKeywords()).initializeTodoApp()
}


def static "com.todo.keywords.TodoKeywords.markTodoAsComplete"() {
    (new com.todo.keywords.TodoKeywords()).markTodoAsComplete()
}


def static "com.todo.keywords.TodoKeywords.deleteTodo"() {
    (new com.todo.keywords.TodoKeywords()).deleteTodo()
}


def static "com.todo.keywords.ClearCompleted.clearCompleted"() {
    (new com.todo.keywords.ClearCompleted()).clearCompleted()
}


def static "com.todo.keywords.VerifyTodo.countEqual"(
    	int expectedCount	) {
    (new com.todo.keywords.VerifyTodo()).countEqual(
        	expectedCount)
}


def static "com.todo.keywords.VerifyTodo.textEqual"(
    	int index	
     , 	String expectedText	) {
    (new com.todo.keywords.VerifyTodo()).textEqual(
        	index
         , 	expectedText)
}


def static "com.todo.keywords.VerifyTodo.statusEqual"(
    	int index	
     , 	boolean completed	) {
    (new com.todo.keywords.VerifyTodo()).statusEqual(
        	index
         , 	completed)
}


def static "com.todo.keywords.AddTodo.execute"(
    	String todoText	) {
    (new com.todo.keywords.AddTodo()).execute(
        	todoText)
}


def static "com.todo.keywords.SetToComplete.index"(
    	int index	) {
    (new com.todo.keywords.SetToComplete()).index(
        	index)
}


def static "com.todo.keywords.SetToComplete.index"() {
    (new com.todo.keywords.SetToComplete()).index()
}


def static "com.todo.keywords.SetFilter.by"(
    	String filter	) {
    (new com.todo.keywords.SetFilter()).by(
        	filter)
}
