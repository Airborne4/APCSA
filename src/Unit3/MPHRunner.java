//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit3;
import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner scanner = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = scanner.nextInt();

		out.print("Enter the hours :: ");
		int hrs = scanner.nextInt();

		out.print("Enter the minutes :: ");
		int mins = scanner.nextInt();

		MilesPerHour test = new MilesPerHour(dist, hrs, mins);
		test.calcMPH();
		test.print();
		
		System.out.println("Enter the distance :: 45");
		System.out.println("Enter the hours :: 0");
		System.out.println("Enter the minutes :: 32");
		test = new MilesPerHour(45, 0, 32);
		test.calcMPH();
		test.print();
		
		System.out.println("Enter the distance :: 96");
		System.out.println("Enter the hours :: 1");
		System.out.println("Enter the minutes :: 43");
		test = new MilesPerHour(96, 1, 43);
		test.calcMPH();
		test.print();
		
		System.out.println("Enter the distance :: 100");
		System.out.println("Enter the hours :: 2");
		System.out.println("Enter the minutes :: 25");
		test = new MilesPerHour(100, 2, 25);
		test.calcMPH();
		test.print();
		
		System.out.println("Enter the distance :: 50");
		System.out.println("Enter the hours :: 2");
		System.out.println("Enter the minutes :: 25");
		test = new MilesPerHour(50, 2, 25);
		test.calcMPH();
		test.print();
		
	}
}
/*
Output with test cases:

Enter the distance :: 1
Enter the hours :: 2
Enter the minutes :: 3
1 miles in 2 hours and 3 minutes = 0 MPH
Enter the distance :: 45
Enter the hours :: 0
Enter the minutes :: 32
45 miles in 0 hours and 32 minutes = 84 MPH
Enter the distance :: 96
Enter the hours :: 1
Enter the minutes :: 43
96 miles in 1 hours and 43 minutes = 56 MPH
Enter the distance :: 100
Enter the hours :: 2
Enter the minutes :: 25
100 miles in 2 hours and 25 minutes = 41 MPH
Enter the distance :: 50
Enter the hours :: 2
Enter the minutes :: 25
50 miles in 2 hours and 25 minutes = 21 MPH
*/