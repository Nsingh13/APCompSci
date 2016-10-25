package Assignment15;

import java.util.Scanner;

public class Assignment15 {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int total = 0;
	System.out.println("Input string:");
	String input = scan.nextLine();

	for (int i = 0; i < input.length(); i++) {

	    if (Character.isDigit(input.charAt(i))) {
		total += Integer.valueOf(input.substring(i, i + 1));

	    }

	}
	System.out.println(total);

    }

}
