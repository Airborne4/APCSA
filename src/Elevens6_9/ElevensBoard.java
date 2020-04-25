package Elevens6_9;

import java.util.List;

public class ElevensBoard extends Board {

	private static final int BOARD_SIZE = 9;

	private static final String[] RANKS = { "ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen",
			"king" };

	private static final String[] SUITS = { "spades", "hearts", "diamonds", "clubs" };

	private static final int[] POINT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0 };

	@SuppressWarnings("unused")
	private static final boolean I_AM_DEBUGGING = false;

	public ElevensBoard() {
		super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
	}

	@Override
	public boolean isLegal(List<Integer> selectedCards) {
		return containsPairSum11(selectedCards) || containsJQK(selectedCards);
	}

	@Override
	public boolean anotherPlayIsPossible() {
		List<Integer> list = cardIndexes();
		for (int i = 0; i < list.size(); i++) {
			for (int n = i + 1; n < list.size(); n++) {
				if (containsPairSum11(list)) {
					return true;
				} else if (containsJQK(list)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean containsPairSum11(List<Integer> selectedCards) {
		for (int i = 0; i < selectedCards.size(); i++) {
			int out = selectedCards.get(i).intValue();
			for (int n = i + 1; n < selectedCards.size(); n++) {
				int close = selectedCards.get(n).intValue();
				if (cardAt(out).pointValue() + cardAt(close).pointValue() == 11) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean containsJQK(List<Integer> selectedCards) {
		boolean j = false;
		boolean q = false;
		boolean k = false;

		for (int i = 0; i < selectedCards.size(); i++) {
			if (cardAt(selectedCards.get(i)).rank().equals("jack")) {
				j = true;
			} else if (cardAt(selectedCards.get(i)).rank().equals("queen")) {
				q = true;
			} else if (cardAt(selectedCards.get(i)).rank().equals("king")) {
				k = true;
			}
		}
		if (q && j && k) {
			return true;
		}
		return false;
	}
}