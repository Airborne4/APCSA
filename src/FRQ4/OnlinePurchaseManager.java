package FRQ4;

import java.util.ArrayList;

public class OnlinePurchaseManager {

	private ArrayList<Gizmo> purchases;

	public OnlinePurchaseManager() {
		purchases = new ArrayList<Gizmo>();
	}

	public void add(String m, boolean e) {
		purchases.add(new Gizmo(m, e));
	}

// Part A

	public int countElectronicsByMaker(String maker) {
		int count = 0;
		for (Gizmo g : purchases)
			if (g.getMaker().equals(maker) && g.isElectronic())
				++count;

		return count;
	}

// Part B
	public boolean hasAdjacentEqualPair() {
		for (int i = 0; i < purchases.size() - 1; ++i)
			if (purchases.get(i).equals(purchases.get(i ++)))
				return true;
		return false;
	}

	public String toString() {
		return "" + purchases;
	}

}

/*
 * Part C OPEN-ENDED SECTION A programmer would like to add a method
 * getCheapestGizmoByMaker, which returns the least expensive Gizmo purchased by
 * an individual from a given maker. Write a description of how you would change
 * the Gizmo and OnlinePurchaseManager classes in order to support this
 * modification.
 * 
 * Make sure to include the following in your response. � Write the method
 * header for the getCheapestGizmoByMaker method. DO write code for this part. �
 * Identify any new or modified variables, constants, constructors, or methods
 * aside from the getCheapestGizmoByMaker method. DO NOT write code for this
 * part.
 * 
 */
/*
 * public Gizmo getCheapestGizmoByMaker(String maker) { Gizmo cheapest = null;
 * for (Gizmo g : purchases) if (g.getMaker().equals(maker) && (cheapest == null
 * || g.getPrice() < cheapest.getPrice()) cheapest = g; return cheapest; }
 */

/*
 * To do this, the programmer would need to make a price variable (pref a
 * double) and then make a new method for getPrice, which, as the name suggests,
 * gets and returns the price variable. Then, it would return the cheapest
 * variable, along with the price.
 */