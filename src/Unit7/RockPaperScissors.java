//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;

import java.util.Scanner;

public class RockPaperScissors {
	private String playChoice;
	private String compChoice;

	public RockPaperScissors() {
		playChoice = "";
	}

	public RockPaperScissors(String player) {
		setPlayers(player);
	}

	public void setPlayers(String player) {
		playChoice = player;
		playChoice = playChoice.substring(0, 1);
	}

	public String determineWinner() {

		String winner = "";
		int random = (int) (Math.random() * 3);
		if (random == 0)
			compChoice = "R";
		else if (random == 1)
			compChoice = "P";
		else if (random == 2)
			compChoice = "S";
		System.out.println(playChoice);
		System.out.println(compChoice);
		if (compChoice.equals(playChoice)) {
			winner = "Draw Game";
			// System.out.println(winner);
		}
		if (compChoice.equals("R")) {
			if (playChoice.equals("S")) {
				winner = "Computer Wins";
			} else if (playChoice.equals("P")) {
				winner = "Player Wins";
			}
		}
		if (compChoice.equals("P")) {
			if (playChoice.equals("R")) {
				winner = "Computer Wins";
			} else if (playChoice.equals("S")) {
				winner = "Player Wins";
			}
		}
		if (compChoice.equals("S")) {
			if (playChoice.equals("P")) {
				winner = "Computer Wins";
			} else if (playChoice.equals("R")) {
				winner = "Player Wins";
			}
		}

		// System.out.println(winner);
		return winner;
	}

	public String toString() {
		String output = "";
		return output;
	}
}