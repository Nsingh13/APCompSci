package Assignment21;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment21 {
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Would you a Numeral (num) or a Digit (dig)");
		String type = input.next();

		if (type.equals("num")) {

			// This gets the input for the numeral
			System.out.print("Enter Roman Numeral:");
			Scanner input = new Scanner(System.in);
			String romanNum = input.nextLine();

			// Runs the function to print the numeral that is returned by the
			// function
			System.out.println(romToNum(romanNum));

		} else if (type.equals("dig")) {
			// This runs the input for the digit
			System.out.print("Enter Digit:");
			Scanner input = new Scanner(System.in);
			String romanNum = input.nextLine();

			// This converts the string to a digit
			int digit = Integer.valueOf(romanNum);

			// Runs the function to print the numeral that is returned by the
			// function
			System.out.println(numToRom(digit));

		} else {
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}

	public static int romToNum(String romanNum) {

		String[] charArray = new String[romanNum.length() + 1];
		int[] numArray = new int[romanNum.length() + 1];
		int num = 0;

		// This populates the string into a array
		for (int i = 0; i < romanNum.length(); i++) {
			charArray[i] = romanNum.substring(i, i + 1);
		}

		// This goes through and assigns every value in the array and give is a
		// corresponding Arabic value
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

		// This runs through every value in the array and sums the numerals
		for (int i = 0; i < romanNum.length(); i++) {
			// if the value is less than the value to the right it subtracts the
			// value
			if (numArray[i] < numArray[i + 1]) {
				num -= numArray[i];
			} else { // else it adds the value to the sum
				num += numArray[i];

			}

		}
		return num;

	}

	public static String numToRom(int digit) {

		int runningNum = digit; // This sets the value of the running num that
								// keeps track of the total

		String romanNumeral = ""; // This creates the variable that will be
									// returned

		if (digit == 0) { // This educates the user in how the Romans had to
							// numeral for 0
			System.out.println(
					"The number zero does not have its own Roman numeral,\n but the word nulla (the Latin word meaning none) was used by medieval scholars in lieu of 0."
							+ "\n  Dionysius Exiguus was known to use nulla alongside Roman numerals in 525.[30][31] About 725, \n Bede or one of his colleagues used the letter N,"
							+ " the initial of nulla or of nihil (the Latin word for nothing), in a table of epacts,\n all written in Roman numerals");

		} else if (digit < 0) { // This checks that the number given is not less
								// than 0
			System.out.println("Invalid Input");
			System.exit(0);
		} else {

			// This checks the amount of the thousands place so you can print an
			// accurate amount of M
			int thousands = digit / 1000;
			for (int i = 0; i < thousands; i++) {
				romanNumeral += "M";
			}

			runningNum = runningNum - (thousands * 1000); // Updates the running
															// value

			// This checks for the numerals that come before so it looks at the
			// range of values and determine if that is valid
			if (runningNum >= 900 && runningNum <= 999) {
				romanNumeral += "CM";
				runningNum -= 900;
			}
			//This determines the amount of 500 in the running total
			int fivehundereds = runningNum / 500;
			for (int i = 0; i < fivehundereds; i++) {
				romanNumeral += "D";
			}

			//This determines the number of hundereds
			runningNum = runningNum - (fivehundereds * 500);
			int hundereds = runningNum / 100;
			if (hundereds == 4) {
				romanNumeral += "CD";
			} else {
				for (int i = 0; i < hundereds; i++) {
					romanNumeral += "C";
				}
			}
			
			runningNum = runningNum - (hundereds * 100);
			
			//This looks if the number is valid for a XC
			if (runningNum >= 90 && runningNum <= 99) {
				romanNumeral += "XC";
				runningNum -= 90;
			}
			int fivetens = runningNum / 50;
			for (int i = 0; i < fivetens; i++) {
				romanNumeral += "L";
			}

			// This determines the ten digit
			runningNum = runningNum - (fivetens * 50);
			int tens = runningNum / 10;
			if (tens == 4) {
				romanNumeral += "XL";
			} else {
				for (int i = 0; i < tens; i++) {
					romanNumeral += "X";
				}
			}

			
			// This looks if the function has a valid 9 value
			runningNum = runningNum - (tens * 10);
			if (runningNum == 9) {
				romanNumeral += "IX";
				runningNum -= 9;
			}
			int fives = runningNum / 5;
			for (int i = 0; i < fives; i++) {
				romanNumeral += "V";

			}
			// This looks determines the single digits
			runningNum = runningNum - (fives * 5);
			int ones = runningNum;
			if (ones == 4) {
				romanNumeral += "IV";
			} else {
				for (int i = 0; i < ones; i++) {
					romanNumeral += "I";
				}
			}
		}
		return romanNumeral; //Returns the numeral value
	}

}