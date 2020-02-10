//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -  
//Class -
//Lab  -
package Unit4;

import static java.lang.System.*;

public class NumberVerify
{
	public static boolean isOdd( int num )
	{
		if (Math.abs(num)%2 == 0) {
			return false;
		}

		return true;
	}
	
	public static boolean isEven( int num )
	{
		if (Math.abs(num)%2 == 1) {
			return false;
		}
		
		return true;
	}	
}