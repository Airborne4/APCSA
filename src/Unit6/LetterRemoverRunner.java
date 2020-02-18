//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit6;

import static java.lang.System.*;


public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
	   	LetterRemover lr1 = new LetterRemover("I am Sam I am", 'a');
	   	System.out.println(lr1);
	   	System.out.println(lr1.removeLetters());
	   	
	   	LetterRemover lr2 = new LetterRemover("ssssssssxssssesssssesss", 's');
	   	System.out.println(lr2);
	   	System.out.println(lr2.removeLetters());
	   	
	   	LetterRemover lr3 = new LetterRemover("qwertyqwertyqwerty", 'a');
	   	System.out.println(lr3);
	   	System.out.println(lr3.removeLetters());
	   	
	   	LetterRemover lr4 = new LetterRemover("abababababa", 'b');
	   	System.out.println(lr4);
	   	System.out.println(lr4.removeLetters());
	   	
	   	LetterRemover lr5 = new LetterRemover("abaababababa", 'x');
	   	System.out.println(lr5);
	   	System.out.println(lr5.removeLetters());
	}
}

//I am Sam I am a
//ssssssssxssssesssssesss s
//qwertyqwertyqwerty a
//abababababa b
//abaababababa x