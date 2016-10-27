package Assignment18;

import java.util.Scanner;

public class EuclideanAlgorithm {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Put in the first integer:");
	int num1 = input.nextInt();
	System.out.print("Put in the second integer:");
	int num2 = input.nextInt();

	if (num2 > num1) {
	    int placeholder = num2;
	    num2 = num1;
	    num1 = placeholder;
	}

	int remainder = 1;

	while (remainder > 0) {
	    remainder = num1 % num2;

	    if (remainder == 0) {
		System.out.println("the least common denominator " + num2);
		break;

	    } else {
		num2 = num1;
		num1 = remainder;
	    }

	}

    }

}
