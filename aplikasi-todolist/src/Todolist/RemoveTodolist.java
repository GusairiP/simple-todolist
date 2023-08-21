package Todolist;

/**
 * Menghapus Todo dari List
 */
public class RemoveTodolist {

	public static boolean removeTodoList(Integer number) {
		if ((number - 1) >= TodolistModel.model.length) {
			return false;
		} else if (TodolistModel.model[number - 1] == null) {
			return false;
		} else {
			for (int i = (number - 1); i < TodolistModel.model.length; i++) {
				if (i == (TodolistModel.model.length - 1)) {
					TodolistModel.model[i] = null;
				} else {
					TodolistModel.model[i] = TodolistModel.model[i + 1];
				}
			}
			return true;
		}
	}

}
