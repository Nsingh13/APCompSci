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

	long numOfSquares = 0;
	long num = 2;
	long total = 1;
	
	System.out.print("Print the first n magic squares: ");
	Scanner input = new Scanner(System.in);
	long squares = input.nextInt();
	
        while(squares < 1)
        {
            System.out.print("Invalid. Enter an integer greater than 0: ");
            squares = input.nextInt();
        }

	loop(squares, numOfSquares, num, total);

    }

    public static void loop(long squares, long numOfSquares, long num, long total) {
	while (!(numOfSquares == squares)) {
	    total += num;
	    double sqrt = (double) Math.sqrt(total);
	    if (sqrt == (long) sqrt) {
		numOfSquares++;
		printTotal(total,sqrt,num);
	    }
	    else{
		
	    }
	    num++;

	}

    }

    public static void printTotal(long total,double sqrt, long num) {
	System.out.println(total + " (1-"+num+") sqrt("+sqrt+")");

    }
  
}
