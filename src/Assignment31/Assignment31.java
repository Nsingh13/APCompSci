package Assignment31;

public class Assignment31 {
	public static void main(String[] args) {
		System.out.println(triangle(2));

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

}
