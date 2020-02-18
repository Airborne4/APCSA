//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 
package Unit5;

import static java.lang.System.*;

public class StringEqualityRunner {
	public static void main(String args[]) {
		// add test cases
		StringEquality test1 = new StringEquality("hello", "goodbye");
		System.out.println(test1);

		StringEquality test2 = new StringEquality("one" , "two");
		System.out.println(test2);

		StringEquality test3 = new StringEquality("three", "four");
		System.out.println(test3);

		StringEquality test4 = new StringEquality("TCEA", "UIL");
		System.out.println(test4);

		StringEquality test5 = new StringEquality("State", "Champions");
		System.out.println(test5);

		StringEquality test6 = new StringEquality("ABC", "ABC");
		System.out.println(test6);

		StringEquality test7 = new StringEquality("ABC", "CBA");
		System.out.println(test7);

		StringEquality test8 = new StringEquality("Same", "Same");
		System.out.println(test8);

	}
}