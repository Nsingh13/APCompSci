package Assignment21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment21 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
	System.out.println("Would you a Numeral (num) or a Digit (dig)");
	String type = input.next();
	if (type.equals("num")) {
	    romToNum();
	} else if (type.equals("dig")) {
	    numToRom();
	} else {
	    System.out.println("Invalid Input");
	    System.exit(0);
	}
    }

    public static void romToNum() {
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

    public static void numToRom() {

	System.out.print("Enter Number:");
	int romanNum = 0;
	try {

	    romanNum = input.nextInt();
	} catch (InputMismatchException e) {

	    System.out.println("Invalid Input");
	    System.exit(0);
	}
	if (romanNum == 0) {
	    System.out.println(
		    "The number zero does not have its own Roman numeral,\n but the word nulla (the Latin word meaning none) was used by medieval scholars in lieu of 0.\n  Dionysius Exiguus was known to use nulla alongside Roman numerals in 525.[30][31] About 725, \n Bede or one of his colleagues used the letter N, the initial of nulla or of nihil (the Latin word for nothing), in a table of epacts,\n all written in Roman numerals");

	} else if (romanNum < 0) {
	    System.out.println("Invalid Input"); 
	    System.exit(0);
	}
	int runningnum = romanNum;
	int thousands = romanNum / 1000;
	for (int i = 0; i < thousands; i++) {
	    System.out.print("M");
	}

	runningnum = runningnum - (thousands * 1000);
	if (runningnum >= 900 && runningnum <= 999) {
	    System.out.print("CM");
	    runningnum -= 900;
	}
	int fivehundereds = runningnum / 500;
	for (int i = 0; i < fivehundereds; i++) {
	    System.out.print("D");
	}

	runningnum = runningnum - (fivehundereds * 500);
	int hundereds = runningnum / 100;
	if (hundereds == 4) {
	    System.out.print("CD");
	} else {
	    for (int i = 0; i < hundereds; i++) {
		System.out.print("C");
	    }
	}

	runningnum = runningnum - (hundereds * 100);
	if (runningnum >= 90 && runningnum <= 99) {
	    System.out.print("XC");
	    runningnum -= 90;
	}
	int fivetens = runningnum / 50;
	for (int i = 0; i < fivetens; i++) {
	    System.out.print("L");
	}

	runningnum = runningnum - (fivetens * 50);
	int tens = runningnum / 10;
	if (tens == 4) {
	    System.out.print("XL");
	} else {
	    for (int i = 0; i < tens; i++) {
		System.out.print("X");
	    }
	}

	runningnum = runningnum - (tens * 10);
	if (runningnum == 9) {
	    System.out.print("IX");
	    runningnum -= 9;
	}
	int fives = runningnum / 5;
	for (int i = 0; i < fives; i++) {
	    System.out.print("V");

	}

	runningnum = runningnum - (fives * 5);
	int ones = runningnum;
	if (ones == 4) {
	    System.out.print("IV");
	} else {
	    for (int i = 0; i < ones; i++) {
		System.out.print("I");
	    }
	}
    }

}