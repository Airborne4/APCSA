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

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance() {
	}

	public Distance(int x1, int y1, int x2, int y2) {

	}

	public void setCoordinates(int x1, int y1, int x2, int y2) {
		this.xOne = x1;
		this.xTwo = x2;
		this.yOne = y1;
		this.yTwo = y2;
	}

	public void calcDistance() {
		distance = Math.sqrt((xTwo - xOne) * (xTwo - xOne) + (yTwo - yOne) * (yTwo - yOne));
	}

	public double getDistance() {
		return distance;
	}

	public void print() {
		System.out.printf("%.3f\n", distance);
	}

	//toString

	public String toString() {
		return "";
	}
}