//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;

import java.util.ArrayList;
import java.util.Arrays;

public class DownRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> numArray = new ArrayList<Integer>( Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345) );
		System.out.println(ListDown.go(numArray));
		
		ArrayList<Integer> numArray2 = new ArrayList<Integer>( Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99) );
		System.out.println(ListDown.go(numArray2));
		
		ArrayList<Integer> numArray3 = new ArrayList<Integer>( Arrays.asList(10,20,30,40,50,-11818,40,30,20,10) );
		System.out.println(ListDown.go(numArray3));
		
		ArrayList<Integer> numArray4 = new ArrayList<Integer>( Arrays.asList(32767) );
		System.out.println(ListDown.go(numArray4));
		
		ArrayList<Integer> numArray5 = new ArrayList<Integer>( Arrays.asList(255,255) );
		System.out.println(ListDown.go(numArray5));
		
		ArrayList<Integer> numArray6 = new ArrayList<Integer>( Arrays.asList(9,10,-88,100,-555,1000) );
		System.out.println(ListDown.go(numArray6));
		
		ArrayList<Integer> numArray7 = new ArrayList<Integer>( Arrays.asList(10,10,10,11,456) );
		System.out.println(ListDown.go(numArray7));
		
		ArrayList<Integer> numArray8 = new ArrayList<Integer>( Arrays.asList(-111,1,2,3,9,11,20,30) );
		System.out.println(ListDown.go(numArray8));
		
		ArrayList<Integer> numArray9 = new ArrayList<Integer>( Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989) );
		System.out.println(ListDown.go(numArray9));
		
		ArrayList<Integer> numArray10 = new ArrayList<Integer>( Arrays.asList(12,15,18,21,23,1000) );
		System.out.println(ListDown.go(numArray10));
		
		ArrayList<Integer> numArray11 = new ArrayList<Integer>( Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455) );
		System.out.println(ListDown.go(numArray11));
		
		ArrayList<Integer> numArray12 = new ArrayList<Integer>( Arrays.asList(9,10,-8,10000,-5000,1000) );
		System.out.println(ListDown.go(numArray12));
	}
}
