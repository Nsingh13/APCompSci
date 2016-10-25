package Assignment17;

import java.util.Scanner;

public class Assignment17 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What number of rows");
	int num = input.nextInt();

	rightTriangle(num);
	clearLines();
	square(num);
	clearLines();
	iTriangle(num);

    }

    public static void rightTriangle(int num) {

	for (int i = 0; i < num; i++) {

	    for (int a = 0; a < i; a++) {
		print();
	    }
	    println();

	}

    }

    public static void square(int num) {
	for (int i = 0; i < num; i++) {
	    if (i == 0 || i == num - 1) {
		for (int a = 0; a < num; a++) {
		    if (a == num - 1) {
			println();
		    } else {
			print();
		    }

		}
	    } else {
		print();
		for (int b = 0; b < (num - 2); b++) {
		    System.out.print(" ");
		}
		println();

	    }

	}
    }

    public static void iTriangle(int num) {
	for (int i = 0; i < num; i++) {
	    for (int b = 0; b < ((num - i) - 1); b++) {
		System.out.print(" ");
	    }
	    for (int a = 0; a < (2 * i); a++) {
		print();
	    }
	    println();

	}

    }

    public static void print() {
	System.out.print("*");

    }

    public static void println() {
	System.out.println("*");

    }

    public static void spaces() {
	System.out.println(" ");

    }

    public static void clearLines() {
	for (int i = 0; i < 2; i++) {
	    System.out.println(" ");
	}

    }

}
