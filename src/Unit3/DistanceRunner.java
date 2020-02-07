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

public class DistanceRunner {
	public static void main(String[] args) {
		int x1, x2, y1, y2;
		// add test cases
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter X1 :: ");
		x1 = scanner.nextInt();
		System.out.print("Enter Y1 :: ");
		y1 = scanner.nextInt();
		System.out.print("Enter X2 :: ");
		x2 = scanner.nextInt();
		System.out.print("Enter Y2 :: ");
		y2 = scanner.nextInt();
		Distance distance = new Distance();
		distance.setCoordinates(x1, y1, x2, y2);
		distance.calcDistance();
		distance.print();
		
		System.out.println("Enter X1 :: "+1);
		System.out.println("Enter Y1 :: "+1);
		System.out.println("Enter X2 :: "+2);
		System.out.println("Enter Y2 :: "+1);
		distance.setCoordinates(1, 1, 2, 1);
		distance.calcDistance();
		distance.print();

		System.out.println("Enter X1 :: "+1);
		System.out.println("Enter Y1 :: "+1);
		System.out.println("Enter X2 :: "+-2);
		System.out.println("Enter Y2 :: "+2);
		distance.setCoordinates(1, 1, -2, 2);
		distance.calcDistance();
		distance.print();

		System.out.println("Enter X1 :: "+1);
		System.out.println("Enter Y1 :: "+1);
		System.out.println("Enter X2 :: "+0);
		System.out.println("Enter Y2 :: "+0);
		distance.setCoordinates(1, 1, 0, 0);
		distance.calcDistance();
		distance.print();


	}
}
/*
Output when entering the test cases:

Enter X1 :: 1
Enter Y1 :: 2
Enter X2 :: 3
Enter Y2 :: 4
2.828
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 2
Enter Y2 :: 1
1.000
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: -2
Enter Y2 :: 2
3.162
Enter X1 :: 1
Enter Y1 :: 1
Enter X2 :: 0
Enter Y2 :: 0
1.414


*/