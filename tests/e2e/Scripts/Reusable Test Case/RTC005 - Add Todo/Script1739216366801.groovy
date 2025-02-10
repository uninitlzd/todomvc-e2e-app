import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.todo.keywords.AddTodo
import com.todo.keywords.InitializeTodoApp
import com.todo.keywords.TodoKeywords as Todo
import com.todo.keywords.VerifyTodo

Todo todo = new Todo()

InitializeTodoApp.execute()

AddTodo.execute("Buy groceries")
VerifyTodo.countEqual(1)
VerifyTodo.textEqual(0, "Buy groceries")

