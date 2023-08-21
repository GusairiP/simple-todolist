package Todolist;

/**
 * Menambahkan Todo ke List
 */
public class AddTodolist {

	public static void addTodoList(String todo) {
		// cek apakah model penuh?
		var isFull = true;
		for (int i = 0; i < TodolistModel.model.length; i++) {
			if (TodolistModel.model[i] == null) {
				// model masih ada yang kosong
				isFull = false;
				break;
			}
		}

		// jika penuh, resize ukuran array nya 2x lipat
		if (isFull) {
			var temp = TodolistModel.model;
			TodolistModel.model = new String[TodolistModel.model.length * 2];

			for (int i = 0; i < temp.length; i++) {
				TodolistModel.model[i] = temp[i];
			}
		}

		// tambahkan ke posisi yang data array nya NULL
		for (var i = 0; i < TodolistModel.model.length; i++) {
			if (TodolistModel.model[i] == null) {
				TodolistModel.model[i] = todo;
				break;
			}
		}
	}

}
