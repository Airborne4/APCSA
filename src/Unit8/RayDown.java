//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		boolean goingDown = false;
		
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] < numArray[++i]) {
				goingDown = true;
			}
			else {
				goingDown = false;
			}
		}
		return goingDown;
	}	
}