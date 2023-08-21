package Todolist;

/**
 * Menangani Input dari User 
 */
public class UserInput {

	public static String input(String info) {
		System.out.println(info + " : ");
		String data = Todolist.scanner.nextLine();
		return data;
	}

}
