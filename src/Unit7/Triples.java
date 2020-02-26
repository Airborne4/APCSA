//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;

import static java.lang.System.*;

public class Triples {
	private int number;

	public Triples() {
		this(0);
	}

	public Triples(int num) {
		setNum(num);

	}

	public void setNum(int num) {
		this.number = num;

	}

	private int greatestCommonFactor(int a, int b, int c) {
		int max = 0;

		for (int i = 2; i < (a + b + c); i++) {
			if (i % a == 0 && i % b == 0 && i % c == 0) {
				max = i;
				return max;
			}
		}

		return 1;
	}

	public int getGreatestCommonFactor(int a, int b, int c) {
		return greatestCommonFactor(a, b, c);
	}

	public String toString(int a, int b, int c) {
		String output = "";
		output = "" + a + " " + b + " " + c;

		return output + "\n";
	}
}