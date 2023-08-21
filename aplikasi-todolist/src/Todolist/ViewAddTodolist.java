package Todolist;

/**
 * Menampilkan View Menambah TODOLIST
 */
public class ViewAddTodolist {

	public static void viewAddTodoList() {
		System.out.println("MENAMBAH TODOLIST");

		var todo = UserInput.input("Todo (x Jika Batal)");

		if (todo.equals("x")) {
			// batal
		} else {
			AddTodolist.addTodoList(todo);
		}
	}

}
