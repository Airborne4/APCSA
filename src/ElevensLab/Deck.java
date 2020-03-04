package ElevensLab;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	private List<Card> cards;
	private int top;
	private int size = 52;

	// make a Deck constructor
	// refer cards to new ArrayList
	// set top to the top of the deck 51
	public Deck() {
		size = 52;
		cards = new ArrayList<Card>();
		top = 51;
		for (String suit : SUITS) {
			for (int face = 1; face < 14; face++) {
				// cards.add(new BlackJackCard(suit,face));
				cards.add(new Card(suit, face));
			}
		}
	}

	public Deck(String[] rank, String[] suit, int[] values) {
		size = suit.length * values.length;
		cards = new ArrayList<Card>();
		top = size - 1;
		for (String suitType : suit) {
			for (int i = 0; i < rank.length; i++) {

				cards.add(new Card(rank[i], suitType, values[i]));

			}
		}
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public int size() {
		return size;
	}

	public Card dealCard() {

		// System.out.println(!isEmpty());
		if (!isEmpty()) {
			size--;
			top--;
			return cards.get(top + 1);

		} else {
			return new Card();
		}

	}

	public Card deal() {

		// System.out.println(!isEmpty());
		if (!isEmpty()) {
			size--;
			top--;
			Card returnCard = cards.get(top + 1);
			cards.remove(returnCard);
			return returnCard;

		} else {
			return new Card();
		}

	}

	public void shuffle(int[] shuffledArray) {
		/*
		 * Collections.shuffle(cards); top=51; size=52;
		 */
		ArrayList<Card> shuffledDeck = new ArrayList<Card>();
		for (int i = 0; i < cards.size(); i++) {

			shuffledDeck.add(cards.get(shuffledArray[i]));

		}
		cards = shuffledDeck;

	}

	public void reset() {
		size = 52;
		top = 51;
	}

	public String toString() {
		String returnString = "";
		for (Card card : cards) {
			returnString += " " + card.toString();
		}
		return returnString;
	}
	// loop through all suits
	// loop through all faces 1 to 13
	// add a new TwentyOneCard to the deck

	// make a dealCard() method that returns the top card

	// write a shuffle() method
	// use Colletions.shuffle
	// reset the top card
}