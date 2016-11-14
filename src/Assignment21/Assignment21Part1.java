package Assignment21;

import java.util.Scanner;

public class Assignment21Part1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("How many numbers do you want to print?");
		int digits = input.nextInt();
		loop(digits);
	}

	public static void loop(int digits) {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.print("The First 10: ");

		for (int i = 0; i < digits; i++) {
			System.out.print(c + ", ");
			c = a + b;
			a = b;
			b = c;
			
		}

	}
}
