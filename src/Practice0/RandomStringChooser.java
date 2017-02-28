package Practice0;

import java.util.ArrayList;
import java.util.Random;

public class RandomStringChooser {

	private String[] wordArray;
	private ArrayList<String> words = new ArrayList<String>();
	private Random rand = new Random();

	public RandomStringChooser(String[] wa) {
		wordArray = wa;

		for (int i = 0; i < wordArray.length; i++) {
			words.add(wordArray[i]);

		}

	}

	public String getNext() {

		String randWord = "NONE";
		int size = words.size();

		if (size > 0) {
			int r = rand.nextInt(size);
			randWord = words.get(r);
			words.remove(r);
		}

		return randWord;
	}

}
