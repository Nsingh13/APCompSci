package Assignment09;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

    public static void main(String[] args) {
	int guess = 0;
	Random num = new Random();
	Scanner input = new Scanner(System.in);

	int roll = num.nextInt(6) + 1;

	System.out.println("What do you think the die roll will be");
	roll = num.nextInt(6) + 1;
	if (input.hasNextInt()) {

	    guess = num.nextInt(6) + 1;

	} else {
	    System.out.println("Invalid Input");
	    System.exit(0);
	}
	if (guess <= 0) {
	    System.out.println("Ha you dumb idiot I got your money and you ");
	}

	if (roll == guess) {
	    System.out.println("You got it wow you should ");
	} else {
	    System.out.println("you suck play again it was " + roll);
	}

    }

}
