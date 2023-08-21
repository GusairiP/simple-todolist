package Todolist;

/**
 * Menampilkan View Menghapus TODOLIST
 */
public class ViewRemoveTodolist {

	public static void viewRemoveTodoList() {
		System.out.println("MENAMBAH TODOLIST");
		
		var number = UserInput.input("Nomor yang ingin Dihapus (x Jika Batal)");
		
		if (number.equals("x")) {
			// batal
		} else {
			boolean success = RemoveTodolist.removeTodoList(Integer.valueOf(number));
			if (!success) {
				System.out.println("Gagal Menghapus TodoList : " + number);
			}
		}
	}

}
