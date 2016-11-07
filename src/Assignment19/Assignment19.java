package Assignment19;

import java.util.Scanner;


//Sean Kelker
//Per 2
//11/6/16

public class Assignment19 {

    public static void main(String[] args) {
	int nomCount = 0;
	Scanner input = new Scanner(System.in);
	boolean eat = true;
	while (eat) {
	    String food = input(input);
	    for (int i = 0; i < food.length(); i++) {
		if (nomCount == 4) {
		    burp();
		    nomCount = 0;
		} else {
		    nom();
		    nomCount++;
		}
	    }
	}
    }

    public static String input(Scanner input) {
	System.out.print("\nWhat food would you like to eat? (Type “I’m full” to quit):");
	String food = input.nextLine();
	return food;

    }

    public static void nom() {
	System.out.print("Nom ");

    }

    public static void burp() {
	System.out.print("Nom burp\n");

    }

}
