package FRQ4;

public class CheckDigit {

	public static int getCheck(int num) {

		int sum = 0;
		while (num > 0) {
			int digit = num % 10;
			if (digit % 2 != 0)
				sum += digit;
			num /= 10;
		}
		sum *= 3;
		return sum % 10;
	}

//Part A

	public static boolean isValid(int numWithCheckDigit) {
		return getCheck(numWithCheckDigit / 10) == numWithCheckDigit % 10;
	}
}

//PART B
/*
 * OPEN-ENDED SECTION A programmer wants to modify the CheckDigit class to keep
 * track of how many times a call to isValid is made with an incorrect check
 * digit. Any time a call to isValid is made with an incorrect check digit, the
 * count should be increased by one. The programmer would like to implement this
 * change without making any changes to the signature of the isValid method or
 * overloading isValid.
 * 
 * Write a description of how you would change the CheckDigit class in order to
 * support this modification. DO NOT write the program code for this part.
 */

/*
 * The programmer should create a new variable and call it invalidCount, and set
 * up the method so that if valid equals false (from previous method), the
 * variable increases by one. Then, simply return the count for both count
 * variables.
 * 
 */