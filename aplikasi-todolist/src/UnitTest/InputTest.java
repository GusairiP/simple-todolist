package UnitTest;

import Todolist.UserInput;

public class InputTest {
	public static void testInput() {
		var name = UserInput.input("Nama");
		System.out.println("Hi " + name);

		var channel = UserInput.input("Channel");
		System.out.println(channel);
	}
}
