package Lab1;

/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		int[] point = new int[13];
		for (int i = 0; i < 13; i++) {
			point[i] = i + 1;

		}

		Deck d1 = new Deck(rank, suit, point);
		for (int i = 0; i < 52; i++) {
			System.out.println(d1.deal().toString());
			System.out.println("Size: " + d1.size());
		}
		System.out.println("Empty: " + d1.isEmpty());

	}
}
