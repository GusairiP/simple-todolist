package UnitTest;

import Todolist.AddTodolist;
import Todolist.RemoveTodolist;
import Todolist.ShowTodolist;

public class RemoveTodolistTest {
	public static void testRemoveTodoList() {
		AddTodolist.addTodoList("Satu");
		AddTodolist.addTodoList("Dua");
		AddTodolist.addTodoList("Tiga");
		AddTodolist.addTodoList("Empat");
		AddTodolist.addTodoList("Lima");

		var result = RemoveTodolist.removeTodoList(20);
		System.out.println(result);

		result = RemoveTodolist.removeTodoList(7);
		System.out.println(result);

		result = RemoveTodolist.removeTodoList(2);
		System.out.println(result);

		ShowTodolist.showTodoList();
	}
}
