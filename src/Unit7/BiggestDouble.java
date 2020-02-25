//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  
package Unit7;

import static java.lang.System.*;

public class BiggestDouble
{
	double num1;
	double num2;
	double num3;
	double num4;
	double biggest;
	
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		num1 = a;
		num2 = b;
		num3 = c;
		num4 = d;
	}

	public double getBiggest()
	{
		
		if(num1 > num2 && num1 > num3 && num1 > num4) {
			biggest = num1;
		}
		
		else if(num2 > num1 && num2 > num3 && num2 > num4) {
			biggest = num2;
		}
		
		else if(num3 > num1 && num3 > num2 && num3 > num4) {
			biggest = num3;
		}
		
		else{
			biggest = num4;
		}
		
		return biggest;
	}

	public String toString()
	{
		
	   return num1 + " " + num2 + " " + num3 + " " + num4;
	}
}