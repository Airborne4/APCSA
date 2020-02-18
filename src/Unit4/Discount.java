//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

package Unit4;

import static java.lang.System.*;
import java.util.Scanner;

public class Discount {
	public static double getDiscountedBill(double bill) {
		if (bill > 2000)
			bill = 0.85 * bill;
		return bill;
	}
}