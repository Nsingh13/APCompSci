package Lab1;

import java.util.ArrayList;
import java.util.Random;

/**
 * This class provides a convenient way to test shuffling methods.
 */
public class Shuffler {

	/**
	 * The number of consecutive shuffle steps to be performed in each call to
	 * each sorting procedure.
	 */
	private static final int SHUFFLE_COUNT = 8;

	/**
	 * Tests shuffling methods.
	 * 
	 * @param args
	 *            is not used.
	 */
	public static void main(String[] args) {
		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive perfect shuffles:");
		int[] values1 = { 0, 1, 2, 3 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			perfectShuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("Results of " + SHUFFLE_COUNT + " consecutive efficient selection shuffles:");
		int[] values2 = { 0, 1, 2, 3 };
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			selectionShuffle(values2);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values2.length; k++) {
				System.out.print(" " + values2[k]);
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 * Apply a "perfect shuffle" to the argument. The perfect shuffle algorithm
	 * splits the deck in half, then interleaves the cards in one half with the
	 * cards in the other.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void perfectShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */

		boolean isStack1 = true;

		int a = 0;
		int b = 0;
		int middleOfStack = (values.length / 2);

		int[] stack1 = new int[(values.length / 2) + 1];
		int[] stack2 = new int[(values.length / 2) + 1];

		for (int i = 0; i < values.length / 2; i++) {
			stack1[i] = values[i];
			stack2[i] = values[i + middleOfStack];

		}

		for (int i = 0; i < values.length; i++) {

			if (isStack1) {
				values[i] = stack1[a];

				a++;
			} else {
				values[i] = stack2[b];

				b++;
			}
			isStack1 = !isStack1;
		}

	}

	/**
	 * Apply an "efficient selection shuffle" to the argument. The selection
	 * shuffle algorithm conceptually maintains two sequences of cards: the
	 * selected cards (initially empty) and the not-yet-selected cards
	 * (initially the entire deck). It repeatedly does the following until all
	 * cards have been selected: randomly remove a card from those not yet
	 * selected and add it to the selected cards. An efficient version of this
	 * algorithm makes use of arrays to avoid searching for an as-yet-unselected
	 * card.
	 * 
	 * @param values
	 *            is an array of integers simulating cards to be shuffled.
	 */
	public static void selectionShuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 3 *** */
		Random random = new Random();
		ArrayList<Integer> deck = new ArrayList<Integer>();
		for (int i = 0; i < values.length; i++) {
			deck.add(values[i]);
		}
		for (int i = 0; i < values.length; i++) {
			int rand = random.nextInt(deck.size());
			values[i] = deck.get(rand);
			deck.remove(rand);
		}

	}
}/**
	 * This class provides a convenient way to test shuffling methods.
	 */
