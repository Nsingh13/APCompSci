package Assignment34;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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
	private int wrongGuesses = 0;//Keeps track of the number of time a guess is wrong
	/**
	 * Constructs a hangman game with <code>word</code> for player to guess.
	 */
	public Hangman(String word) {
		/* Initialize class variables */
		System.out.println(word);
		this.word = word;
		maxGuesses = 7;
		board = new String[word.length()];

		for (int i = 0; i < word.length(); i++) {
			board[i] = "__";
		}

		// for (int i = word.length() - 1; i >= 0; i--) {
		for (int i = 0; i < word.length(); i++) {
			letters.add(word.substring(i, i + 1));

		}
		for (int i = 0; i < letters.size(); i++) {

			System.out.print(letters.get(i));

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
		

		while (!hasWon()) {

			if (wrongGuesses == maxGuesses) {
				break;
			}

			printGame(wrongGuesses);
			String guessLetter = scan.nextLine();

			if (guesses.contains(guesses)) {
				System.out.println(guessLetter + " has already been guesses");
				wrongGuesses++;
			} else if (validateGuess(guessLetter)) {
				System.out.println(guessLetter + " is in the word");
			} else {
				System.out.println(guessLetter + " is not in the word");
				wrongGuesses++;
			}

		}

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
		
		printHangman(wrong);
		System.out.println("");
		for (int i = 0; i < word.length(); i++) {

			System.out.print("\t" + board[i]);
		}
		System.out.println("");
		System.out.println("Guess a letter (" + (maxGuesses - wrong) + " guesses left):");
	}

	public boolean validateGuess(String guess) {
		guesses.add(guess);
		if (letters.contains(guess)) {
			int numOfLetters = 1;
			for (int i = 0; i < letters.size(); i++) {
				if (letters.get(i).equals(guess)) {
					numOfLetters++;
					board[i] = guess;
				}
			}

			return true;
		} else {
			return false;
		}
	}

	/**
	 * Tells user if they won or lost (with word shown).
	 */
	public void printResult() {
		printGame(wrongGuesses);
		if (hasWon()) {
			System.out.println("You won the word was " + word);
		} else {
			System.out.println("You lost the word was " + word);
		}
	}
	public void resetGame() {
		
		
	}
	/**
	 * Gets state of game.
	 * 
	 * @return true if word has been guessed, false otherwise.
	 */
	public boolean hasWon() {
		String guessedWord = "";
		for (int i = 0; i < board.length; i++) {
			guessedWord += board[i];

		}
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
