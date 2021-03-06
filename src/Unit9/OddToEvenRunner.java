//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit9;

import java.util.ArrayList;
import java.util.Arrays;

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> numArray = new ArrayList<Integer>( Arrays.asList(7,1,5,3,11,5,6,7,8,9,10,12345,11) );
		System.out.println(ListOddToEven.go(numArray));
		
		ArrayList<Integer> numArray2 = new ArrayList<Integer>( Arrays.asList(11,9,8,7,6,5,4,3,2,1,-99,7) );
		System.out.println(ListOddToEven.go(numArray2));
		
		ArrayList<Integer> numArray3 = new ArrayList<Integer>( Arrays.asList(10,20,30,40,5,41,31,20,11,7) );
		System.out.println(ListOddToEven.go(numArray3));
		
		ArrayList<Integer> numArray4 = new ArrayList<Integer>( Arrays.asList(32767,70,4,5,6,7) );
		System.out.println(ListOddToEven.go(numArray4));
		
		ArrayList<Integer> numArray5 = new ArrayList<Integer>( Arrays.asList(2,7,11,21,5,7) );
		System.out.println(ListOddToEven.go(numArray5));
		
		ArrayList<Integer> numArray6 = new ArrayList<Integer>( Arrays.asList(7,255,11,255,100,3,2) );
		System.out.println(ListOddToEven.go(numArray6));
		
		ArrayList<Integer> numArray7 = new ArrayList<Integer>( Arrays.asList(9,11,11,11,7,1000,3) );
		System.out.println(ListOddToEven.go(numArray7));
		
		ArrayList<Integer> numArray8 = new ArrayList<Integer>( Arrays.asList(7,7,7,11,2,7,7,11,11,2) );
		System.out.println(ListOddToEven.go(numArray8));
		
		ArrayList<Integer> numArray9 = new ArrayList<Integer>( Arrays.asList(2,4,6,8,8) );
		System.out.println(ListOddToEven.go(numArray9));
	}
}