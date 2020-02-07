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

public class MilesPerHour {
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour() {
		setNums(0, 0, 0);
		mph = 0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins) {
		setNums(dist, hrs, mins);
		mph = 0.0;
	}

	public void setNums(int dist, int hrs, int mins) {
		this.distance = dist;
		this.hours = hrs;
		this.minutes = mins;
	}

	public void calcMPH()

	{
		mph = (double) distance / ((double) hours + (double) minutes / 60);
	}

	public void print() {

		System.out.println(
				distance + " miles in " + hours + " hours and " + minutes + " minutes = " + Math.round(mph) + " MPH");
	}

	public String toString() {
		return "";
	}
}
