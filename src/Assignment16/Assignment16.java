package Assignment16;

import java.util.Scanner;

public class Assignment16 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("What number would you like to take the sqrt of");
	double num = input.nextDouble();
	System.out.println("The sqrt of "+num+" is " +sqrt(num));
    }

    public static double sqrt(double num) {
	double differnce = 1;
	double lastGuess = 1;
	double nextGuess = 0;

	while (differnce > .000000001) {
	    nextGuess = (lastGuess +( num / lastGuess)) / 2;
	    differnce = Math.abs(lastGuess - nextGuess);
	    lastGuess = nextGuess;
	}
	return nextGuess;

    }
}
