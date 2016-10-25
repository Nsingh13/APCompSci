package Assignment14;

import java.util.Scanner;

//	Sean Kelker
//	Per 2
//	10/18/16


public class Assignment14 {

    public static void main(String[] args) { 

	Scanner input = new Scanner(System.in);

	System.out.println("What enter string");
	String text = input.next();

	System.out.println("How many of the final charectors do you want");
	int num = input.nextInt();

	String repeater = repeatEnd(num, text);

	for (int i = 0; i < num; i++) {
	    System.out.print(repeater);
	}

    }

    public static String repeatEnd(int num, String text) {

	int place = text.length() - num;
	String finalString = text.substring(place);

	return finalString;

    }

}
