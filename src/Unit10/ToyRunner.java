//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit10;

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy t1 = new Toy("sorry");
		t1.setCount(1);
		System.out.println(t1.toString());
		
		Toy t2 = new Toy("gi joe");
		t2.setCount(5);
		System.out.println(t2.toString());
	}
}