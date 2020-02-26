//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit8;

public class RayOddToEven {
	public static int go(int[] ray) {
		int firstOdd = -1;
		int firstEven = -1;
		for (int i = 0; i < ray.length; i++) {
			if (firstOdd == -1) {
				if (ray[i] % 2 == 1) {
					firstOdd = i;
				}
			}
			if (firstOdd != -1) {
				if (ray[i] % 2 == 0) {
					firstEven = i;
					return firstEven - firstOdd;
				}
			}
		}

		return -1;
	}
}