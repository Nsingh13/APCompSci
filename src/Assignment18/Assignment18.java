package Assignment18;

import java.util.Scanner;

/**
 * Magic Squares are perfect squares and are equal to a sum of consecutive
 * integers starting at 1 Ex: 36 (1+2+3+4+5+6+7+8)
 * 
 * @Sean_Kelker @10/25/16
 */

public class Assignment18 {

    public static void main(String[] args) {

	int numOfSquares = 0;
	int num = 2;
	int total = 1;
	
	System.out.print("Print the first n magic squares: ");
	Scanner input = new Scanner(System.in);
	int squares = input.nextInt();
	
        while(squares < 1)
        {
            System.out.print("Invalid. Enter an integer greater than 0: ");
            squares = input.nextInt();
        }

	loop(squares, numOfSquares, num, total);

    }

    public static void loop(int squares, int numOfSquares, int num, int total) {
	while (!(numOfSquares == squares)) {
	    total += num;
	    double sqrt = (double) Math.sqrt(total);
	    if (sqrt == (int) sqrt && total<=1631432881) {
		numOfSquares++;
		printTotal(total);
	    }
	    else{
		
	    }
	    num++;

	}

    }

    public static void printTotal(int total) {
	System.out.println(total);

    }
  
}
