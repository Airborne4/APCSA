//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter {
	
	private static int getNumDigits(int number) {
		int count = 0;
		while (number > 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

	public static int[] getSortedDigitArray(int number) {

		int digits = getNumDigits(number);
		int tempNumber = number;
		int freeSpot = 0;
		int[] sorted = new int[digits];
		int[] tempArray = new int[digits];
		for (int i = digits - 1; i >= 0; i--) {
			tempArray[i] = tempNumber % 10;
			tempNumber = tempNumber / 10;
		}
		for (int i = 0; i < digits; i++) {
			int min = tempArray[0];
			int minSpot = 0;
			for (int j = 0; j < digits; j++) {
				if (tempArray[j] < min) {
					min = tempArray[j];
					minSpot = j;
				}
			}
			tempArray[minSpot] = 10;
			sorted[freeSpot] = min;
			freeSpot++;
		}

		return sorted;
	}
}