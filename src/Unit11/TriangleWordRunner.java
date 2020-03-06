//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit11;

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		String newWord = "";
		String input = "y";
		while (input.equals("y")) {
			System.out.print("Enter a word :: ");
			newWord = keyboard.next();
			TriangleWord.printTriangle(newWord);
			System.out.print("Do you want to enter more sample inputs? ");
			input = keyboard.next().toString();

		}
	}
}

/*
Output with Test Cases:

Enter a word :: a
a
Do you want to enter more sample input? y
Enter a word :: it
i
itit
Do you want to enter more sample input? y
Enter a word :: box
b
bobo
boxboxbox
Do you want to enter more sample input? y
Enter a word :: toad
t
toto
toatoatoa
toadtoadtoadtoad
Do you want to enter more sample input? y
Enter a word :: fishy
f
fifi
fisfisfis
fishfishfishfish
fishyfishyfishyfishyfishy
Do you want to enter more sample input? y
Enter a word :: dog
d
dodo
dogdogdog





*/