/**
 * This is a class that tests the Deck class.
 */
package ElevensLab;

public class DeckTesterAct4 {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 * 
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = { "jack", "queen", "king" };
		String[] suits = { "blue", "red" };
		int[] pointValues = { 11, 12, 13 };
		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		/* *** TO BE COMPLETED IN ACTIVITY 4 *** */
		String[] ranks2 = { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "jack",
				"queen", "king" };
		String[] suits2 = { "clubs", "hearts", "spades", "diamonds" };
		int[] pointValues2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
		Deck d2 = new Deck(ranks2, suits2, pointValues2);

		int VALUE_COUNT = 52;

		int[] values1 = new int[VALUE_COUNT];
		for (int i = 0; i < values1.length; i++) {
			values1[i] = i;
		}
		System.out.println("  toString:\n" + d2.toString());
		int[] shuffledArray = Shuffler.selectionShuffle(values1);

		d2.shuffle(shuffledArray);
		System.out.println("  toString:\n" + d2.toString());

	}
}
