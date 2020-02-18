//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit5;


import static java.lang.System.*;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   	WordsCompare wc1 = new WordsCompare("abe", "ape");
	   	System.out.println(wc1);
	   	
	   	WordsCompare wc2 = new WordsCompare("giraffe", "gorilla");
	   	System.out.println(wc2);
	   	
	   	WordsCompare wc3 = new WordsCompare("one", "two");
	   	System.out.println(wc3);
	   	
	   	WordsCompare wc4 = new WordsCompare("fun", "funny");
	   	System.out.println(wc4);
	   	
	   	WordsCompare wc5 = new WordsCompare("123", "19");
	   	System.out.println(wc5);
	   	
	   	WordsCompare wc6 = new WordsCompare("193", "1910");
	   	System.out.println(wc6);
	   	
	   	WordsCompare wc7 = new WordsCompare("goofy", "godfather");
	   	System.out.println(wc7);
	   	
	   	WordsCompare wc8 = new WordsCompare("funnel", "fun");
	   	System.out.println(wc8);

	}
}

//abe ape
//giraffe gorilla
//one two
//fun funny
//123 19
//193 1910
//goofy godfather
//funnel fun