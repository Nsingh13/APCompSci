package Assignment34;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<String> list = new ArrayList<String>();
	public static boolean first = true;

	public static void main(String[] args) {

		while (true) {
			Hangman hang = new Hangman(generateWord());
			hang.play();
			System.out.println("Would you like to play again (yes/no)");
			String input = scan.next();
			if (!input.equals("yes")) {
				break;
			}

		}
		System.out.println("Goodbye");

	}

	public static String generateWord() {
		try {
			String filename = "words_short.txt";
			if (first) {
				System.out.println("Welcome to Hangman! Do you want the 'short' or 'long' words list?");
				String input = scan.nextLine();
				first = false;
				if (input.equals("short")) {
					filename = "words_short.txt";
				} else {
					filename = "words.txt";
				}
			}
			File file = new File(filename);

			BufferedReader b = new BufferedReader(new FileReader(file));

			String readLine = "";

			while ((readLine = b.readLine()) != null) {
				list.add(readLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("What should the minimum word length be?");
		int minLength = scan.nextInt();
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
