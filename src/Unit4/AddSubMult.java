//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package Unit4;

public class AddSubMult {
	public static double check(double a, double b) {
		double math = 0;
		double scale = Math.pow(10, 1);
		
		if (a > b) {
			math =  Math.round((a - b) * scale)/scale;
		}
		if (b > a) {
			math =  Math.round((b - a) * scale)/scale;
		}
		if (a == b) {
			math = Math.round((a * b) * scale)/scale;
		}
		return math;
	}
}