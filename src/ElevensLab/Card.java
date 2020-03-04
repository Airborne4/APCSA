//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package ElevensLab;

public class Card {
	public static final String FACES[] = { "ZERO", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
			"NINE", "TEN", "JACK", "QUEEN", "KING" };

	// instance variables
	String suit = "";
	String rank = "";
	int face = 0;
	int pointValue = 0;

	// constructors
	public Card() {

	}

	public Card(String suit, int face) {
		this.suit = suit;
		this.face = face;
	}

	public Card(String cardRank, String cardSuit, int cardPointValue) {
		this.rank = cardRank;
		this.suit = cardSuit;
		this.pointValue = cardPointValue;
	}

	// modifiers
	// set methods

	// auto-generated (super cool)
	public void setFace(int face) {
		this.face = face;
	}

	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	// accessors
	// get methods
	public int getFace() {
		return face;
	}

	public String getSuit() {
		return suit;
	}

	public boolean matches(Card otherCard) {
		boolean isEqual = false;
		if (getFace() != 0) {
			if (this.getSuit().equals(otherCard.getSuit()) && this.getFace() == otherCard.getFace()) {
				isEqual = true;
			}
		} else {
			if (this.getSuit().equals(otherCard.getSuit()) && this.getRank().equals(otherCard.getRank())
					&& this.getPointValue() == otherCard.getPointValue()) {
				isEqual = true;
			}
		}

		return isEqual;
	}

	// toString
	public String toString() {
		if (pointValue == 0) {
			return "" + FACES[face] + " of " + getSuit() ;
		} else {
			return rank + " of " + suit + " (Point Value of " + pointValue + ")";
		}
	}

}