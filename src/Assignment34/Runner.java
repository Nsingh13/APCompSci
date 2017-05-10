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

	public static void main(String[] args) {

		Hangman hang = new Hangman(generateWord());
		hang.play();

	}

	public static String generateWord() {
		try {
			String filename;

			System.out.println("Welcome to Hangman! Do you want the 'short' or 'long' words list?");
			String input = scan.nextLine();
			if (input.equals("short")) {
				filename = "words_short.txt";
			} else {
				filename = "words.txt";
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
