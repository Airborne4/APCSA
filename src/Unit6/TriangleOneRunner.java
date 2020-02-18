//(c) A+ Computer Science
//www.apluscompsci.com
//Name
package Unit6;

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		TriangleOne tr1 = new TriangleOne("hippo");
		tr1.print();
		System.out.println("\n");
		
		TriangleOne tr2 = new TriangleOne("abcd");
		tr2.print();
		System.out.println("\n");
		
		TriangleOne tr3 = new TriangleOne("it");
		tr3.print();
		System.out.println("\n");
		
		TriangleOne tr4 = new TriangleOne("a");
		tr4.print();
		System.out.println("\n");
		
		TriangleOne tr5 = new TriangleOne("chicken");
		tr5.print();
	}
}