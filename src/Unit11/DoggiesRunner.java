//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit11;

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for(int i=0; i<size;i++)
		{
			System.out.print("Enter the age :: ");
			int age = keyboard.nextInt();
			System.out.print("Enter the name :: ");
			String name  = keyboard.next();
			pack.set(i, age, name);
		}		
		System.out.println("pack :: "+pack);
		System.out.println("NAME OF OLDEST :: "+pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+pack.getNameOfYoungest());		
	}		
}

/*
Output with Test Cases:

How many Dogs are in the pack? :: 5
Enter the age :: 20
Enter the name :: Sammy
Enter the age :: 10
Enter the name :: Benny
Enter the age :: 5
Enter the name :: Wilee
Enter the age :: 30
Enter the name :: Kelley
Enter the age :: 2
Enter the name :: Baby
pack :: [20 Sammy, 10 Benny, 5 Wilee, 30 Kelley, 2 Baby]
NAME OF OLDEST :: Kelley
NAME OF YOUNGEST :: Baby
*/