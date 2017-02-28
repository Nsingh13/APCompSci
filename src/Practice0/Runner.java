package Practice0;

public class Runner {

	public static void main(String[] args) {
		String[] wordArray = { "wheels", "on", "the", "bus" };
		RandomStringChooser sChooser = new RandomStringChooser(wordArray);
		for (int i = 0; i < 6; i++) {
			System.out.println(sChooser.getNext() + " ");
		}

	}

}
