package Assignment34;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assignment34 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();

		try {

			File file = new File("words.txt");

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
				System.out.println(list.get(randIndex));
				run = false;

			}
		}

	}

}
