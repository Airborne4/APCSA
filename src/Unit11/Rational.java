//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit11;

class Rational implements Comparable<Rational> {
	int numerator;
	int denominator;

	public Rational() {
		numerator = 1;
		denominator = 1;
	}

	public Rational(int n, int d) {
		setRational(n, d);
	}

	public void setRational(int n, int d) {
		numerator = n;
		denominator = d;
	}

	public void add(Rational other) {
		numerator = numerator * other.denominator + other.numerator * denominator;
		denominator = denominator * other.denominator;

		reduce();
	}

	private void reduce() {

		int gcd = gcd(numerator, denominator);
		numerator = numerator / gcd;
		denominator = denominator / gcd;

	}

	private int gcd(int numOne, int numTwo) {
		int gcd = 1;
		for (int i = numOne + numTwo; i > 0; i--) {
			if ((double) numOne / i % 1 == 0 && (double) numTwo / i % 1 == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	public Object clone() {
		Rational clone = new Rational(numerator, denominator);
		return clone;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public boolean equals(Object obj) {
		if((double)((Rational) obj).getNumerator() / ((Rational) obj).getDenominator() == (double)numerator / denominator) {
			return true;
		}
		else{
			return false;
		}
	}

	public int compareTo(Rational other) {
		if (other.numerator == numerator && other.denominator == denominator) {
			return 1;
		}

		return -1;
	}

	public String toString() {
		return (numerator + "/" + denominator);
	}

}