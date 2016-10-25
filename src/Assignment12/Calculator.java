package Assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static Scanner input1 = new Scanner(System.in);
    public static Scanner input2 = new Scanner(System.in);
    public static Scanner input3 = new Scanner(System.in);

    public static double num1;
    public static double num2;
    public static double awnser;
    public static String operator = "";
    public static String repeat = "";

    public static void main(String[] args) {
	input();
    }

    public static void input() {
	System.out.println("What Operation would you (+,-,*,/,^,Jake Blozan)");
	operator = input3.nextLine();

	try {
	    System.out.println("Enter number 1");
	    num1 = input1.nextDouble();
	} catch (InputMismatchException e) {
	    System.out.println("Non Valid Input Try again");
	    input();
	}
	try {
	    System.out.println("Enter number 2");
	    num2 = input1.nextDouble();
	} catch (InputMismatchException e) {
	    System.out.println("Non Valid Input Try again");
	    input();
	}
	operatorType();

    }

    public static void operatorType() {

	if (operator.equals("+")) {
	    awnser = num1 + num2;
	} else if (operator.equals("-")) {
	    awnser = num1 - num2;
	} else if (operator.equals("*")) {
	    awnser = num1 * num2;
	} else if (operator.equals("/")) {
	    awnser = num1 / num2;
	} else if (operator.equals("^")) {
	    awnser = Math.pow(num1, num2);
	} else if (operator.equals("Jake Blozan")) {
	    awnser = 1010101001;
	} else {
	    System.out.println("Non Valid Input Try Again");
	    input();
	}
	System.out.println(num1 + " " + operator + " " + num2 + " =  " + awnser);
	loop();
    }

    public static void loop() {

	System.out.println("Would you like to go again (Yes/No) ");
	repeat = input2.nextLine();

	if (repeat.equals("Yes")) {
	    input();
	} else if (repeat.equals("No")) {
	    System.out.println("Goodbye");
	    System.exit(0);
	} else {
	    System.out.println("Non-Valid Input try again");
	    loop();
	}

    }
}
