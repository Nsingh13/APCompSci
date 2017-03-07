package Assignment31;

public class Assignment31 {
	public static void main(String[] args) {
		System.out.println(fibonacci(6));

	}

	// Part 1
	public static int sumDigits(int n) {

		int num = n % 10;
		n /= 10;

		if (n == 0) {
			return num;
		}

		return num + sumDigits(n);

	}

	// Part 2
	public static int triangle(int rows) {

		if (rows == 0) {
			return rows;
		}

		return rows + triangle(--rows);

	}

	// Challenge #1
	public static String pi(String str) {
		System.out.println(str);

		if (str.length() == 1) {
			return str;
		}

		if (str.substring(0, 2).equals("pi")) {
			if (str.length() > 2) {

				return "3.14" + pi(str.substring(2));
			} else {
				return "3.14";
			}

		} else {
			return str.charAt(0) + pi(str.substring(1));
		}
	}

	public static int fibonacci(int n) {

		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
