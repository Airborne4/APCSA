//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;

import static java.lang.System.*;

public class Perfect {
	private int number;

	// add constructors
	public Perfect() {

	}

	public Perfect(int input) {
		setNumber(input);
	}

	public void setNumber(int num) {
		number = num;
	}

	// add a set method

	public boolean isPerfect() {
		int sum = 0;
		for (int i = 1; i < (number); i++) {
			if (number % i == 0)
				sum = sum + i;
		}
		if (sum == number)
			return true;

		return false;
	}

	// add a toString

	public String toString() {
		
		if(isPerfect() == true) {
			return number + " is perfect";
		}
		else {
			return number + " is not perfect";
		}
	}

}