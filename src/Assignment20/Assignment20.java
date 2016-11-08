package Assignment20;

import java.util.Scanner;

public class Assignment20 {
    public static double sum = 0;
    public static double currentValue;
    public static double aprox;

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.println("How many values would you like");
	int loopLength = input.nextInt();
	System.out.println("What do you want increment by");
	int increment = input.nextInt();
	System.out.println("i\tm(i)");
	for (int i = 1; i < loopLength * increment; i++) {
	    if (i % increment == 0) {
		System.out.println(i + "\t" + function(i));

	    } else {
		function(i);
	    }

	}
    }

    public static double function(int i) {
	double numerator = Math.pow(-1, i + 1);
	double denominator = (2 * i) - 1;

	currentValue = (numerator / denominator);
	sum += currentValue;
	aprox = sum * 4;
	return aprox;
    }
}
