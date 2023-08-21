package Todolist;

/**
 * Menampilkan View TODOLIST
 */
public class ViewShowTodolist {

	public static void viewShowTodoList() {
		while (true) {
			ShowTodolist.showTodoList();

			System.out.println("## MENU : ");
			System.out.println("1. Tambah");
			System.out.println("2. Hapus");
			System.out.println("x. Keluar");

			var input = UserInput.input("Pilih");

			if (input.equals("1")) {
				ViewAddTodolist.viewAddTodoList();
			} else if (input.equals("2")) {
				ViewRemoveTodolist.viewRemoveTodoList();
			} else if (input.equals("x")) {
				break;
			} else {
				System.out.println("Input Tidak Valid!");
			}
		}
	}

}
