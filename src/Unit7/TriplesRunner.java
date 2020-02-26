//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;

import java.util.Scanner;

public class TriplesRunner {
	public static void main(String args[]) {
		String output = "";
		int input = 110;
		Triples triple = new Triples(input);

		int a = 0;
		int b = 0;
		int c = 0;
		for (a = 1; a < input; a++) {
			for (b = a; b < input; b++) {
				for (c = b; c < input; c++) {
					if (a * a + b * b == c * c && a % 2 != b % 2 && c % 2 != 0
							&& triple.getGreatestCommonFactor(a, b, c) < 2) {
						output = output + triple.toString(a, b, c);
					}
				}
			}
		}
		System.out.println(output);
	}
}