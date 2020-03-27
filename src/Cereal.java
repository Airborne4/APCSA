public class Cereal
{
	private String name;
	private int totalCarbs;
	private int totalProtein;
	private double cost;

	public Cereal()
	{
	}

	public Cereal( String nm, int totC, int totP, double cst)
	{
		name = nm;
		totalCarbs = totC;
		totalProtein = totP;
		cost = cst;
	}
	

	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public int getTotalCarbs() {
		return totalCarbs;
	}

	public void setTotalCarbs(int totalCarbs) {
		this.totalCarbs = totalCarbs;
	}

	public int getTotalProtein() {
		return totalProtein;
	}

	public void setTotalProtein(int totalProtein) {
		this.totalProtein = totalProtein;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String toString()
	{
	   return "Name: " + name + "\n" + "--------------------- \n" + "Total Carbs (g): " + totalCarbs + "\nTotal Protein (g): " + totalProtein
			   + "\nCost ($): " + cost +"\n";
	}
	
	public static void main(String[] args) {
		Cereal c1 = new Cereal("Cheerios", 22, 2, 3.99);
		System.out.println(c1.toString());
		
		Cereal c2 = new Cereal("Rice Krispies", 28, 2, 4.89);
		System.out.println(c2.toString());
		
		Cereal c3 = new Cereal("Frosted Flakes", 30, 1, 6.99);
		System.out.println(c3.toString());
	}
}