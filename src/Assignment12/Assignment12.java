package Assignment12;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment12 {
    public static Scanner input = new Scanner(System.in);

    public static double greatest;
    public static double least;
    public static double num;
    public static double average;
    public static String inputs;
    public static double total = 0;
    public static double amount = 0;

    public static void main(String[] args) {

	loop();
    }

    public static void loop() {
	boolean run = true;
	while (run) {
	    System.out.println("Type a number or stop");
	    try {
		num = input.nextDouble();
		analyze();
		System.out.println(num);

	    } catch (InputMismatchException e) {
		inputs = input.nextLine();
		if (inputs.equals("stop")) {
		    endPrint();
		} else {
		    System.out.println("non number input");
		}

	    }

	}

    }

    public static void analyze() {
	total += num;
	amount++;
	if (amount == 1) {
	    greatest = num;
	    least = num;
	}
	if (num > greatest) {
	    greatest = num;

	} else if (num < least) {
	    least = num;
	}

    }

    public static void endPrint() {

	average = total / amount;

	System.out.println("The greatest number is " + greatest);
	System.out.println("The least number is " + least);
	System.out.println("The average is " + average);

	System.exit(0);

    }

}
