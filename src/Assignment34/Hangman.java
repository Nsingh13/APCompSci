package Assignment34;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Main logic for running the game of hangman.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hangman {
	private List<String> guesses = new ArrayList<String>(); // letters that have
															// been guessed
	private List<String> letters = new ArrayList<String>(); // letters that are
															// in the word
	private String word; // word that player has to guess
	private String[] board; // the letters on the board ("" if not guessed yet)

	private int maxGuesses; // number of guesses player gets before losing (7)
	private int wrongGuesses = 0;// Keeps track of the number of time a guess is
									// wrong

	/**
	 * Constructs a hangman game with <code>word</code> for player to guess.
	 */
	public Hangman(String word) {
		/* Initialize class variables */

		this.word = word;
		maxGuesses = 7;
		board = new String[word.length()];

		// This populates the board with the -- blank slot
		for (int i = 0; i < word.length(); i++) {
			board[i] = "__";
		}

		// Creates the key for the word
		for (int i = 0; i < word.length(); i++) {
			letters.add(word.substring(i, i + 1));
		}

	}

	/**
	 * Runs the gameplay of hangman.
	 * 
	 * Keeps asking for letters and printing board until player guesses
	 * incorrectly 7 times.
	 */
	public void play() {
		/*
		 * Let player keep guessing until all letters have been found Print
		 * board and hangman after each turn Tell user if the letter they choose
		 * has already been guessed (you choose penalty) Print result of the
		 * game to the screen when the game ends.
		 */
		Scanner scan = new Scanner(System.in);

		// Loop continues to run until a winner has been determined
		while (!hasWon()) {

			// This kills the loop if the guesses run out
			if (wrongGuesses == maxGuesses) {
				break;
			}

			// This prints the current board state
			printGame(wrongGuesses);

			// Gets the current guess
			String guessLetter = scan.nextLine();

			// This determiens if the guess is more than one letter and grabs
			// the first letter
			if (guessLetter.length() > 1) {
				guessLetter = String.valueOf(guessLetter.charAt(0));
			}

			// determine whether the guess has already been attempted
			if (guesses.contains(guesses)) {
				System.out.println(guessLetter + " has already been guesses");
				wrongGuesses++;

				// This determines whether the guess is in the word
			} else if (validateGuess(guessLetter)) {
				System.out.println(guessLetter + " is in the word");

				// This is if the guess is not in the word
			} else {
				System.out.println(guessLetter + " is not in the word");
				wrongGuesses++;
			}

		}

		// Once the loop is broken or ends this prints out the final result
		printResult();

	}

	/**
	 * Shows the correct and missing letters for mystery word. Makes a call to
	 * <code>printHangman()</code>.
	 * 
	 * @param wrong
	 *            the number of wrong guesses so far.
	 */
	public void printGame(int wrong) {
		// Prints the hangman askii thing
		printHangman(wrong);

		// This loop prints the board with the slots
		System.out.println("");
		for (int i = 0; i < word.length(); i++) {
			System.out.print("\t" + board[i]);
		}

		// Prints out the current guess state of the game
		System.out.println("\nGuess a letter (" + (maxGuesses - wrong) + " guesses left):");
	}

	/**
	 * This determines whether the guess is correct and in the word
	 * 
	 * @param guess
	 *            The letter that is guessed
	 *
	 *            Return true if the letter is in the word and false
	 */

	public boolean validateGuess(String guess) {
		guesses.add(guess);// Adds guess to the list of guessed words

		// enters if if the guess is in the word
		if (letters.contains(guess)) {

			// This parses the word array and replaces the blank spot with the
			// letters
			for (int i = 0; i < letters.size(); i++) {
				if (letters.get(i).equals(guess)) {
					board[i] = guess;
				}
			}

			return true;
		} else {
			// This is returned when the letter is not in the word
			return false;
		}
	}

	/**
	 * Tells user if they won or lost (with word shown).
	 */
	public void printResult() {
		// Prints the final stage of the game
		printGame(wrongGuesses);

		// determines whether the player won or not and prints the correct
		// statement
		if (hasWon()) {
			System.out.println("You won the word was " + word);
		} else {
			System.out.println("You lost the word was " + word);
		}
	}

	/**
	 * Gets state of game.
	 * 
	 * @return true if word has been guessed, false otherwise.
	 */
	public boolean hasWon() {
		String guessedWord = "";

		// guessed word is populated with the current state of the board
		for (int i = 0; i < board.length; i++) {
			guessedWord += board[i];
		}

		// It is then checked against the word and determines if the
		if (guessedWord.equals(word)) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * Draws hangman on screen based on the number of wrong guesses.
	 * 
	 * @param wrong
	 *            the number of wrong guesses so far.
	 */
	public void printHangman(int wrong) {
		System.out.println("   -----");
		System.out.println("  |    |");

		System.out.print("  |    ");
		if (wrong >= 1) {
			System.out.print("o");
		}
		System.out.println();

		System.out.print("  |   ");
		if (wrong == 2) {
			System.out.print("/");
		}

		if (wrong == 3) {
			System.out.print("/|");
		}

		if (wrong >= 4) {
			System.out.print("/|\\");
		}
		System.out.println();

		System.out.print("  |    ");
		if (wrong >= 5) {
			System.out.print("|");
		}
		System.out.println();

		System.out.print("  |   ");
		if (wrong == 6) {
			System.out.print("/");
		}

		if (wrong == 7) {
			System.out.print("/ \\");
		}
		System.out.println();

		System.out.println(" _|_");
		System.out.println("|   |____");
		System.out.println("|________|");
	}
}
