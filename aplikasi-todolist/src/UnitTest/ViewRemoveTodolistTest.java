package UnitTest;

import Todolist.AddTodolist;
import Todolist.ShowTodolist;
import Todolist.ViewRemoveTodolist;

public class ViewRemoveTodolistTest {
	public static void testViewRemoveTodoList() {
		AddTodolist.addTodoList("Satu");
		AddTodolist.addTodoList("Dua");
		AddTodolist.addTodoList("Tiga");

		ShowTodolist.showTodoList();

		ViewRemoveTodolist.viewRemoveTodoList();

		ShowTodolist.showTodoList();
	}
}
