package Assignment08;

public class Number {
	private int number;
	private int digit;
	private int length;

	public Number(int n, int l, int d) {
		number = n;
		length = l;
		digit = d;

	}

	public int getNthDigit() {
		int specDigit = (int) (number % Math.pow(10, digit) / Math.pow(10, digit - 1));
		return specDigit;

	}

	public void getNumDigits() {
		for (int i = 1; i < length + 1; i++) {
			int a = (int) (number % Math.pow(10, i) / Math.pow(10, i - 1));
			System.out.println(a);
		}

	}

	public int isPalindrome() {
		int difference = 0;
		for (int i = 1; i < length + 1; i++) {
			int a = (int) (number % Math.pow(10, length + 1 - i) / Math.pow(10, length - i));
			int b = (int) (number % Math.pow(10, i) / Math.pow(10, i - 1));
			if (a != b) {
				difference++;
			}
		}
		return difference;

	}
}
