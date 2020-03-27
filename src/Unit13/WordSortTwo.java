//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo {
	private String[] wordRay;

	public WordSortTwo(String sentence) {
		wordRay = sentence.split(" ");
	}

	public void sort() {

		String[] sortedArray = new String[wordRay.length];
		String nextWord = wordRay[0];
		int wordSpot = 0;
		int openSpot = 0;
		for (int i = 0; i < wordRay.length; i++) {
			for (int j = 0; j < wordRay.length; j++) {
				if (compareWords(nextWord, wordRay[j]) > 0) {
					nextWord = wordRay[j];
					wordSpot = j;
				}

			}

			wordRay[wordSpot] = "}";
			sortedArray[openSpot] = nextWord;
			openSpot++;
			nextWord = "}";
			wordSpot = 0;
		}
		wordRay = sortedArray;

	}

	public int compareWords(String one, String two) {
		int returnInt = 0;
		int length = one.length() < two.length() ? one.length() : two.length();
		for (int i = 0; i < length; i++) {
			if (one.charAt(i) != two.charAt(i)) {
				returnInt = one.charAt(i) < two.charAt(i) ? -1 : 1;
				return returnInt;
			}
		}

		return returnInt;
	}

	public String toString() {
		String output = "";
		for (String word : wordRay) {
			output += word + " \n";
		}
		return output + "\n";
	}
}