package Assignment21;

import java.util.Scanner;

public class Assignment21 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Number:");
	int romanNum = input.nextInt();
	//String[] charArray = new String[romanNum.length() + 1];
	//int[] numArray = new int[romanNum.length() + 1];
	
	 num/1000;
	
	
	
    }

    public static void roToNum() {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter Roman Numeral:");
	String romanNum = input.nextLine();
	String[] charArray = new String[romanNum.length() + 1];
	int[] numArray = new int[romanNum.length() + 1];
	int num = 0;
	for (int i = 0; i < romanNum.length(); i++) {

	    charArray[i] = romanNum.substring(i, i + 1);
	}
	for (int i = 0; i < romanNum.length(); i++) {
	    if (charArray[i].equals("I")) {
		numArray[i] = 1;
	    } else if (charArray[i].equals("V")) {
		numArray[i] = 5;
	    } else if (charArray[i].equals("X")) {
		numArray[i] = 10;
	    } else if (charArray[i].equals("L")) {
		numArray[i] = 50;
	    } else if (charArray[i].equals("C")) {
		numArray[i] = 100;
	    } else if (charArray[i].equals("D")) {
		numArray[i] = 500;
	    } else if (charArray[i].equals("M")) {
		numArray[i] = 1000;
	    } else {
		System.out.println("Invalid Input");
		System.exit(0);
	    }
	}
	for (int i = 0; i < romanNum.length(); i++) {
	    if (numArray[i] < numArray[i + 1]) {
		num -= numArray[i];

	    } else {
		num += numArray[i];

	    }

	}
	System.out.println(num);
    }

}
