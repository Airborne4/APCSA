//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;

import static java.lang.System.*;

public class LetterRemover {
	private String sentence;
	private char lookFor;

	public LetterRemover() {

	}

	public LetterRemover(String s, char rem) {
		setRemover(s, rem);
	}

	public void setRemover(String s, char rem) {
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters() {
		int x = 0;
		int length = sentence.length();
		String store = "";
		while (x < length) {
			if (sentence.charAt(x) != lookFor) {
				store = store + sentence.substring(x, x + 1);
			}
			x++;
		}
		sentence = store;
		String cleaned = sentence;
		return cleaned;
	}

	public String toString() {
		return sentence + " - letter to remove " + lookFor;
	}
}