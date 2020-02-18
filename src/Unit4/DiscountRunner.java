//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -
package Unit4;

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		amt = Discount.getDiscountedBill(amt);
		System.out.print("Bill after discount :: ");
		System.out.printf("%.2f\n", amt);

	}
}

/* Test case outputs:

Enter the original bill amount :: 500
Bill after discount :: 500.00
Enter the original bill amount :: 2500
Bill after discount :: 2125.00
Enter the original bill amount :: 4000
Bill after discount :: 3400.00
Enter the original bill amount :: 333.333
Bill after discount :: 333.33
Enter the original bill amount :: 95874.2154
Bill after discount :: 81493.08 
*/