package Lab1;

import java.util.List;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

	/**
	 * The size (number of cards) on the board.
	 */
	private static final int BOARD_SIZE = 9;

	/**
	 * The ranks of the cards for this game to be sent to the deck.
	 */
	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen",
			"king" };

	/**
	 * The suits of the cards for this game to be sent to the deck.
	 */
	private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

	/**
	 * The values of the cards for this game to be sent to the deck.
	 */
	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	/**
	 * Flag used to control debugging print statements.
	 */
	private static final boolean I_AM_DEBUGGING = false;

	/**
	 * Creates a new <code>ElevensBoard</code> instance.
	 */
	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	/**
	 * Determines if the selected cards form a valid group for removal. In
	 * Elevens, the legal groups are (1) a pair of non-face cards whose values
	 * add to 11, and (2) a group of three cards consisting of a jack, a queen,
	 * and a king in some order.
	 * 
	 * @param selectedCards
	 *            the list of the indices of the selected cards.
	 * @return true if the selected cards form a valid group for removal; false
	 *         otherwise.
	 */
	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		// System.out.println("Selected Size:" + selectedCards.size());
		// System.out.println("Contains11:" + containsPairSum11(selectedCards));
		if (selectedCards.size() == 2 && containsPairSum11(selectedCards)) {

			return true;
		} else if (selectedCards.size() == 3 && containsJQK(selectedCards)) {
			return true;

		} else {
			return false;
		}

	}

	/**
	 * Determine if there are any legal plays left on the board. In Elevens,
	 * there is a legal play if the board contains (1) a pair of non-face cards
	 * whose values add to 11, or (2) a group of three cards consisting of a
	 * jack, a queen, and a king in some order.
	 * 
	 * @return true if there is a legal play left on the board; false otherwise.
	 */
	@Override
	public boolean anotherPlayIsPossible() {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 ** **/
		System.out.println(cardAt(0).pointValue());
		Boolean J = false;
		Boolean Q = false;
		Boolean K = false;

		for (int i = 0; i < size(); i++) {
			for (int j = 0; j < size(); j++) {
				int sum = cardAt(i).pointValue() + cardAt(j).pointValue();
				if (sum == 11 && !(i == j)) {
					return true;
				}
			}
		}

		for (int i = 0; i < size(); i++) {

			System.out.println(cardAt(i).rank());
			if (cardAt(i).rank().equals("jack")) {
				J = true;
				System.out.println("Rec");
			}
			if (cardAt(i).rank().equals("queen")) {
				Q = true;
				System.out.println("Rec");
			}
			if (cardAt(i).rank().equals("king")) {
				K = true;
				System.out.println("Rec");
			}
			if (J && Q && K) {
				return true;
			}
		}

		return false;

	}

	/**
	 * Check for an 11-pair in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find an 11-pair.
	 * @return true if the board entries in selectedCards contain an 11-pair;
	 *         false otherwise.
	 */
	private boolean containsPairSum11(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		int sum = 0;
		for (int i = 0; i < selectedCards.size(); i++) {
			sum = cardAt(selectedCards.get(0)).pointValue() + cardAt(selectedCards.get(1)).pointValue();
			System.out.println(sum);

		}
		if (sum == 11) {
			return true;

		} else {
			return false;
		}

	}

	/**
	 * Check for a JQK in the selected cards.
	 * 
	 * @param selectedCards
	 *            selects a subset of this board. It is list of indexes into
	 *            this board that are searched to find a JQK group.
	 * @return true if the board entries in selectedCards include a jack, a
	 *         queen, and a king; false otherwise.
	 */
	private boolean containsJQK(List<Integer> selectedCards) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 9 *** */
		Boolean J = false;
		Boolean Q = false;
		Boolean K = false;
		for (int i = 0; i < selectedCards.size(); i++) {
			if (cardAt(selectedCards.get(i)).rank().equals("jack")) {
				J = true;
			}
			if (cardAt(selectedCards.get(i)).rank().equals("queen")) {
				Q = true;
			}
			if (cardAt(selectedCards.get(i)).rank().equals("king")) {
				K = true;
			}
			System.out.println("J:" + J);
			System.out.println("Q:" + Q);
			System.out.println("K:" + K);
			if (J && Q && K) {
				return true;
			}
		}
		return false;
	}
}