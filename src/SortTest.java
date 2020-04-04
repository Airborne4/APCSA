
public class SortTest {

	public static int linearSearch(int[] list, int toFind) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == toFind)
				return i;			
			}
			return -1;
		}
	
public static void main(String[] args) {
	System.out.println(linearSearch(new int[]{2,3,4,5,6,7,8,9},8));
}
	
}

