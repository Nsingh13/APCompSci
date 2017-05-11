package Assignment34;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<String> list = new ArrayList<String>();
	public static boolean first = true;

	public static void main(String[] args) {
		boolean run = true;

		// THis loop runs the entire game
		while (run) {

			// Creates the hangman object
			Hangman hang = new Hangman(generateWord());
			// This starts the game
			hang.play();

			// This occurs after the game
			System.out.println("Would you like to play again (yes/no)");
			String input = scan.next();

			// Brakes the loop if the user doesnt want to continue
			if (!input.equals("yes")) {
				run = false;
			} else {
				// Clears the array list for the new game
				list.clear();
			}

		}
		// Printed after the user ends the game
		System.out.println("Goodbye");

	}

	public static String generateWord() {
		try {
			String filename = "words_short.txt";

			// This is ran on the first play where the users determines if they
			// which list they would like to have
			if (first) {

				// Prompts the user and the requests input
				System.out.println("Welcome to Hangman! Do you want the 'short' or 'long' words list?");
				String input = scan.nextLine();

				// Sees if the users types short and if not defaults to long
				if (input.equals("short")) {
					filename = "words_short.txt";
				} else {
					filename = "words.txt";
				}

				// Sets this to false so this code wont be called again
				first = false;
			}

			// This creates the file and then reads from it
			File file = new File(filename);

			BufferedReader b = new BufferedReader(new FileReader(file));

			// Adds every line if the file to the array list
			String readLine = "";
			while ((readLine = b.readLine()) != null) {
				list.add(readLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		// ask the user for the minimum word length
		System.out.println("What should the minimum word length be?");
		int minLength = 0;
		boolean validInput = false;

		// loop until the user gives a valid response
		while (!validInput) {
			try {
				minLength = scan.nextInt();
				validInput = true;
			} catch (InputMismatchException e) {
				System.out.println("Invalid value!");
				scan.next(); // this consumes the invalid token
			}
		}
		boolean run = true;
		while (run) {

			if (minLength >= 36) {
				System.out.println("No Words Of Length");
				break;
			}

			int randIndex = (int) (Math.random() * list.size());
			if (list.get(randIndex).length() >= minLength) {
				return list.get(randIndex);

			}

		}
		return null;

	}

}
