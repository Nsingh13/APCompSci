package Assignment11;

import java.util.Scanner;

public class BrickSolver {
	public static int bigNum = 1, smallNum = 3, goal = 8;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the number of small bricks");
		smallNum = scan.nextInt();
		System.out.println("What is the number of big bricks");
		bigNum = scan.nextInt();
		System.out.println("What is you goal length");
		goal = scan.nextInt();

		if (bigSolver()) {
			System.out.println("You can make the row");
		} else {
			System.out.println("You can not make the row. Fire your contractor cause he sucks");
		}

	}

	public static Boolean bigSolver() {

		int remainder = goal - (bigNum * 5);

		if (remainder == 0) {
			return true;

		} else if (remainder > smallNum) {
			return false;
		} else {
			if ((goal % 5) <= smallNum) {
				return true;
			} else {

				return false;
			}

		}

	}

}
