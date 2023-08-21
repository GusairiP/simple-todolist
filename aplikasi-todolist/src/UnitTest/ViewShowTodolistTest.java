package UnitTest;

import Todolist.AddTodolist;
import Todolist.ViewShowTodolist;

public class ViewShowTodolistTest {
	public static void testViewShowTodoList() {
		AddTodolist.addTodoList("Satu");
		AddTodolist.addTodoList("Dua");
		AddTodolist.addTodoList("Tiga");
		AddTodolist.addTodoList("Empat");
		AddTodolist.addTodoList("Lima");
		ViewShowTodolist.viewShowTodoList();
	}
}
