package Todolist;

/**
 * Menampilkan TODOLIST
 */
public class ShowTodolist {

	public static void showTodoList() {
		System.out.println("TODOLIST");
		for (int i = 0; i < TodolistModel.model.length; i++) {
			var todo = TodolistModel.model[i];
			var no = i + 1;

			if (todo != null) {
				System.out.println(no + ". " + todo);
			}
		}
	}

}
