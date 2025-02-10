import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.todo.keywords.AddTodo
import com.todo.keywords.AddTodoMultiple
import com.todo.keywords.InitializeTodoApp
import com.todo.keywords.TodoKeywords as Todo
import com.todo.keywords.VerifyTodo

InitializeTodoApp.execute()

AddTodoMultiple.execute(todos)

VerifyTodo.countEqual(todos.collect().size())

VerifyTodo.textEqual(1, todos[1])

