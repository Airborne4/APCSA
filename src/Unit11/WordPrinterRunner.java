//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit11;

import java.util.Scanner;
import static java.lang.System.*;

public class WordPrinterRunner
{
	public static void main( String args[] )
	{
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String word = keyboard.next();
	
			out.print("Enter the times to display :: ");
 			int times = keyboard.nextInt();			
			
			//call the printWord method
 			WordPrinter.printWord(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=keyboard.next();			
		}while(choice.equals("Y")||choice.equals("y"));		
	}
}

/*
Output with Testcases:

Enter the word to display :: hello
Enter the times to display :: 9
hello
hello
hello
hello
hello
hello
hello
hello
hello
Do you want to enter more sample input? y
Enter the word to display :: funny
Enter the times to display :: 6
funny
funny
funny
funny
funny
funny
Do you want to enter more sample input? y
Enter the word to display :: chicken
Enter the times to display :: 4
chicken
chicken
chicken
chicken
Do you want to enter more sample input? y
Enter the word to display :: dog
Enter the times to display :: 1
dog
Do you want to enter more sample input? n

*/