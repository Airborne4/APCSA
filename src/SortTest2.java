
public class SortTest2 {
	
	public static void sortMethod(int[] stuff) {
		for (int i = 1; i < stuff.length; ++i) {
			int val = stuff[i];
			int j = i;
			while (j > 0 && val < stuff[j - 1]) {
				stuff[j] = stuff[j - 1];
				j--;

			}
			stuff[j] = val;
			for (int b = 0; b < stuff.length; b++) {
				System.out.println(stuff[b]);
			}
			System.out.println("\n");
		}
		
	}


public static void main(String[] args) {
	int[] array = {3, 61, 15, 11, 7, 9, 2};
	sortMethod(array);
	/*for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}*/
}

}
