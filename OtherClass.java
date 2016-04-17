package week9hw;

public class OtherClass {

	private int number;

	public OtherClass(int num) {
		number = num;
	}

	public void setNum(int num) {
		number = num;
	}

	public int getNum() {
		return number;
	}

	public void displayMessage() {
		if (number % 2 == 0)
			System.out.println("Your number was even");
		else
			System.out.println("Your number was odd");
	}
}
