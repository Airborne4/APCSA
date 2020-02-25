//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;

public class RayOddToEven {
	public static int go(int[] ray) {
		int count = 0;
		int fEven = 0;
		int fOdd = 0;

		boolean checkOdd = false;
		boolean checkEven = false;

		while (count > 1) {
			for (int i = 0; i < ray.length; i++) {
				if (ray[i] % 2 == 1) {
					fOdd = ray[i];
					checkOdd = true;
					++ count;
					System.out.println(fOdd);
				}
			}
		}

		if (checkOdd == false || checkEven == false) {
			return -1;
		} else {
			return fOdd - fEven;
		}
	}
}