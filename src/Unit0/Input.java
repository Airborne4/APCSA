//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit0;

import static java.lang.System.*;
import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;

		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();

		System.out.print("Enter an double :: ");
		doubleOne = keyboard.nextDouble();

		System.out.print("Enter an double :: ");
		doubleTwo = keyboard.nextDouble();

		System.out.print("Enter an float :: ");
		floatOne = keyboard.nextFloat();

		System.out.print("Enter an float :: ");
		floatTwo = keyboard.nextFloat();

		System.out.print("Enter an short :: ");
		shortOne = keyboard.nextShort();

		System.out.print("Enter an short :: ");
		shortTwo = keyboard.nextShort();

		// add in input for all variables

		System.out.println();
		System.out.println("integer one = " + intOne);
		System.out.println("integer two = " + intTwo);
		System.out.println("double one = " + doubleOne);
		System.out.println("double two = " + doubleTwo);
		System.out.println("float one = " + floatOne);
		System.out.println("float two = " + floatTwo);
		System.out.println("short one = " + shortOne);
		System.out.println("short two = " + shortTwo);

		// add in output for all variables
/*
Input:
Enter an integer :: 2
Enter an integer :: 3
Enter a double :: 4
Enter a double :: 5
Enter a float :: 6
Enter a float :: 7
Enter a short :: 8
Enter a short :: 9
Output:
Integer one = 2
Integer two = 3
double one = 4.0
double two = 5.0
float one = 6.0
float two = 7.0
short one = 8
short two = 9
*/

	}
}
