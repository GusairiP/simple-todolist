package UnitTest;

import Todolist.ShowTodolist;
import Todolist.TodolistModel;

public class ShowTodolistTest {

	public static void testShowTodoList() {
		TodolistModel.model[0] = "Belajar Java Dasar";
		TodolistModel.model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
		ShowTodolist.showTodoList();
	}

}
