package Assignmnet25;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment25Part2 {
    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("How many numbers do you have?");
	int quantNum = input.nextInt();
	int[] numIn = new int[quantNum];
	System.out.println("Enter your numbers: ");
	for (int i = 0; i < quantNum; i++) {
	    numIn[i] = input.nextInt();
	}

	System.out.println(orgArray(quantNum, numIn));
	System.out.println(finArray(quantNum, numIn));

    }

    public static String orgArray(int quantNum, int numIn[]) {
	return "Original Array: " + Arrays.toString(numIn);

    }

    public static String finArray(int quantNum, int numIn[]) {
	int ihatejake = 0;
	Arrays.sort(numIn);
	String line = "No repeats: [";
	int value = 0;
	for (int i = 0; i < numIn.length; i++) {
	    if (numIn[i] == value) {

	    } else {
		if (ihatejake == 0) {
		    value = numIn[i];
		    line += numIn[i];
		    ihatejake++;
		} else {
		    value = numIn[i];
		    line +=","+ numIn[i] ;
		}
	    }

	}
	line += "]";
	return line;

    }
}
