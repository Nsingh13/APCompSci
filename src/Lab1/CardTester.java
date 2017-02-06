package Lab1;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

		Card card1 = new Card("Ace", "Hearts", 11);
		Card card2 = new Card("King", "Diamonds", 10);
		Card card3 = new Card("3", "Clubs", 3);

		System.out.println("Card1 Ranks:" + card1.rank());
		System.out.println("Card2 Suit:" + card2.suit());
		System.out.println("Card3 CardValue:" + card3.pointValue());
		System.out.println("Card1 Matches Card2:" + card1.matches(card2));
		System.out.println("Card3 Matches Card3:" + card3.matches(card3));
		System.out.println("Card1 Statement:" + card1.toString());

	}
}