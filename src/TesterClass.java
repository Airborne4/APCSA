public class TesterClass


{
   public static void main(String[] args)
   {
      Fraction f1 = new Fraction();
      Fraction f2 = new Fraction(1,2);
      System.out.println(f1);
      System.out.println(f2.getNumerator() / f2.getDenominator());
   }
 }

/** Class Fraction */
class Fraction
{
	int d = 1;
   //  instance variables
   private int numerator;
   private int denominator;

   // constructor: set instance variables to default values
   public Fraction()
   {
      setNumerator(d);
      setDenominator(d);
   }

   // constructor: set instance variables to init parameters
   public Fraction(int initNumerator, int initDenominator)
   {
      setNumerator(initNumerator);
      setDenominator(initDenominator);
   }

   public String toString()
   {
     int newNumerator;
	   // if the denominator is 1, then just return the numerator
     if (getDenominator() == d) {
        newNumerator = 1;
     }
     return newNumerator + "/" + getDenominator();
   }

public int getNumerator() {
	return numerator;
}

public void setNumerator(int numerator) {
	this.numerator = numerator;
}

public int getDenominator() {
	return denominator;
}

public void setDenominator(int denominator) {
	this.denominator = denominator;
}
}
