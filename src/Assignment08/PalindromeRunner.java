package Assignment08;

import java.util.Scanner;
//
//	Sean Kelker
// 	9/26/16	
//	Per 2
//
//
//

public class PalindromeRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("what number woudl you like to check:");

		int number = input.nextInt();
		int numLength = Integer.toString(number).length();
		int digit = 0;
		Number num = new Number(number, numLength, digit);

		if (num.isPalindrome() > 0) {
			System.out.println(number + " is not a palidrome");
		} else {
			System.out.println(number + " is a palidrome");
		}
	}

}
