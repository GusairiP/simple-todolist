package UnitTest;

import Todolist.AddTodolist;
import Todolist.ShowTodolist;

public class AddTodolistTest {
	public static void testAddTodolist() {
		for (int i = 0; i < 25; i++) {
			AddTodolist.addTodoList("Contoh Todo ke. " + i);
		}
		
		ShowTodolist.showTodoList();
	}
}
