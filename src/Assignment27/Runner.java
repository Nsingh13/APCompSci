package Assignment27;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	int numOfBalls;
	int numOfRows;
	int numOfSlots;
	int finArr[];

	System.out.println("Enter the number of balls to drop:");
	numOfBalls = scan.nextInt();

	System.out.println("Enter the number of slots in the bean machine:");
	numOfSlots = scan.nextInt();
	numOfRows = numOfSlots - 1;
	Machine mach = new Machine(numOfRows, numOfBalls);

	mach.run();
	finArr = mach.getSlots();

	System.out.println("");
	int greatest = 0;

	for (int i = 0; i < finArr.length; i++) {
	    if (finArr[i] > greatest) {
		greatest = finArr[i];
	    }
	}
	for (int i = greatest; i >= 0; i--) {
	    String printString = "|";
	    for (int j = 0; j < numOfSlots; j++) {
		if (finArr[j] <= i) {
		    printString += " ";

		} else {
		    printString += "0";
		}
	    }

	    System.out.println(printString);

	}
	System.out.print(Arrays.toString(finArr));

    }

}
