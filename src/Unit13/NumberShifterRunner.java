//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit13;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner {
	public static void main(String args[]) throws IOException {
		for (int i = 0; i < 5; i++) {
			int[] arr = NumberShifter.makeLucky7Array(20);
			System.out.println("Pre Shifted Array: " + Arrays.toString(arr));
			NumberShifter.shiftEm(arr);
			System.out.println("Post Shifted Array: " + Arrays.toString(arr) + "\n");
		}
	}
}
