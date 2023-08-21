package UnitTest;

import Todolist.AddTodolist;
import Todolist.ShowTodolist;
import Todolist.ViewAddTodolist;

public class ViewAddTodolistTest {
	public static void testViewAddTodoList() {
		AddTodolist.addTodoList("Satu");
		AddTodolist.addTodoList("Dua");

		ViewAddTodolist.viewAddTodoList();

		ShowTodolist.showTodoList();
	}
}
