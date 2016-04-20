package week9hw;

import java.util.Scanner;

public class Week9Hw {

	public static void main(String[] args) {
		String choice;
		Scanner input = new Scanner(System.in);

		OtherClass object1 = new OtherClass(0);
		System.out.println("Please enter a number: ");
		int theNum = input.nextInt();
		object1.setNum(theNum);
		object1.displayMessage();
	}

}
// Please consider doing I/O from the main program, not the class.
