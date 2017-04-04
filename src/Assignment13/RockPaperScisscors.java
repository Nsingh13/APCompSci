package Assignment13;

import java.util.Random;
import java.util.Scanner;

//	Sean Kelker
//	Per 2
//	10/17/16

public class RockPaperScisscors {
	public static Scanner input = new Scanner(System.in);
	public static Random rand = new Random();
	public static String userGuess;
	public static int plays;
	public static int playNum;
	public static int userGuessNum;
	public static int compGuessNum;
	public static int humanWins;
	public static int compWins;
	public static int ties;
	public static String compChoiceString;

	public static void main(String[] args) {
		System.out.println("How many time would you like to play?");
		plays = input.nextInt();
		if (plays % 2 == 0) {
			System.out.println("The number must be odd");
			main(args);
		}
		entry();
	}

	public static void entry() {

		System.out.println("Enter your choice (rock,paper,scissors)");
		userGuess = input.next();

		if (userGuess.equals("rock")) {
			userGuessNum = 0;
			compTurn();
		} else if (userGuess.equals("paper")) {
			userGuessNum = 1;

			compTurn();
		} else if (userGuess.equals("scissors")) {
			userGuessNum = 2;

			compTurn();
		} else if (userGuess.equals("SeanKelker")) {
			userGuessNum = 668;

			compTurn();
		} else if (userGuess.equals("JakeBlozan")) {
			userGuessNum = 254;

			compTurn();
		} else if (userGuess.equals("MaxKwon")) {
			userGuessNum = 971;

			compTurn();
		} else {
			System.out.println("NonValid Input:Try Agin");
			entry();
		}

	}

	public static void compTurn() {

		compGuessNum = rand.nextInt(3);
		if (compGuessNum == 0) {
			compChoiceString = "rock";

		} else if (compGuessNum == 2) {
			compChoiceString = "paper";

		} else {
			compChoiceString = "scissors";

		}
		winner();

	}

	public static void winner() {
		////////////////////////////////////////////////////////
		// Rock
		if (userGuessNum == 0) {
			if (compGuessNum == 0) { // Rock
				System.out.println("You Tied!" + "The computer chose " + compChoiceString);
				ties++;

			} else if (compGuessNum == 1) {// Paper
				System.out.println("The computer wins!" + "The computer chose " + compChoiceString);
				compWins++;

			} else if (compGuessNum == 2) {// Scissors
				System.out.println("You Win!" + "The computer chose " + compChoiceString);
				humanWins++;

			}
		}
		////////////////////////////////////////////////////////
		// Paper
		else if (userGuessNum == 1) {
			if (compGuessNum == 0) { // Rock
				System.out.println("You Win!" + "The computer chose " + compChoiceString);
				humanWins++;

			} else if (compGuessNum == 1) {// Paper
				System.out.println("You Tied!" + "The computer chose " + compChoiceString);
				ties++;

			} else if (compGuessNum == 2) {// Scissors
				System.out.println("The computer wins!" + "The computer chose " + compChoiceString);
				compWins++;
			}
		}
		//////////////////////////////////////////////////////////
		// Scissors
		else if (userGuessNum == 2) {
			if (compGuessNum == 0) { // Rock
				System.out.println("The computer wons!" + "The computer chose " + compChoiceString);
				compWins++;

			} else if (compGuessNum == 1) {// Paper
				System.out.println("You Win!" + "The computer chose " + compChoiceString);
				humanWins++;

			} else if (compGuessNum == 2) {// Scissors
				System.out.println("You Tied!" + "The computer chose " + compChoiceString);
				ties++;
			}

		}
		//////////////////////////////////////////////////////////
		if (userGuessNum == 668) {
			System.out.println("The computer wons!" + "The computer chose 1678");
			compWins++;

		}
		if (userGuessNum == 254) {
			System.out.println("You Win!" + "The computer chose 1323");
			humanWins++;

		}
		if (userGuessNum == 971) {
			System.out.println("You Tied!" + "The computer chose 2056");
			ties++;

		}
		//////////////////////////////////////////////////////////
		repeat();
	}

	public static void repeat() {
		if (plays - 1 > playNum) {
			playNum++;
			entry();
		} else {
			end();
		}

	}

	public static void end() {

		System.out.println("Your record was:");
		System.out.println(humanWins + "-" + compWins + "-" + ties);
		if (humanWins > compWins) {
			System.out.println("You win overall");
		} else if (humanWins < compWins) {
			System.out.println("You lose overall");
		} else if (humanWins == compWins) {
			System.out.println("You tied overall");
		}
		System.exit(0);

	}

	// changes so I can Commit
}
