package Q3Lab;

import java.util.ArrayList;

public class Shelf {
	private ArrayList<Book> books;
	private int size;

	public Shelf() {
		size = 0;
		books = new ArrayList<Book>();
	}

	public Shelf(int size) {
		this.size = size;
		books = new ArrayList<Book>();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void newBook(int size) {
		books.add(new Book(size));
	}

	public int getBookCount() {
		return books.size();
	}

	public double averageBookSize() {
		double count = 0;
		for (int i = 0; i < books.size(); i++) {
			count += books.get(i).getSize();
		}
		return count / getBookCount();
	}

	public int getPageCount() {
		int pageCount = 0;
		for (int i = 0; i < books.size(); i++) {
			pageCount += books.get(i).getPageCount();
		}
		return pageCount;
	}

	public double averageLinesPerPage() {
		double count = 0;
		for (int i = 0; i < books.size(); i++) {
			for (int j = 0; j < books.get(i).getPageCount(); j++) {
				count += books.get(i).getPage(j).getLines();
			}
		}
		return count / getPageCount();
	}

	public double averagePageCount() {
		double count = 0;
		for (int i = 0; i < books.size(); i++) {
			count += books.get(i).getPageCount();
		}
		return count / books.size();
	}

	/*
	public int[] selectionSort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			if (min != i) {
				int temp = array[min];
				array[min] = array[i];
				array[i] = temp;
			}
		}
		return array;
	}

	// Binary Search!
	public double highestPageCount() {
		
		selectionSort();
		
		
		for (int spot = 0; spot < nums.length; spot++) {
			System.out.println(nums[spot]);
			
		}
		System.out.println(Arrays.binarySearch(nums, 34));
		System.out.println(Arrays.binarySearch(nums, 9));

		return 1;
	}
*/
	public String toString() {
		return "-------------------------------------------------------" + "\n" + "Shelf Size (inches): " + size + "\n"
				+ "Number of Pamphlets on the shelf: " + getBookCount() + "\n"
				+ "Average Pamphlet Size (inches) on the shelf: " + averageBookSize() + "\n"
				+ "Average Page Count on Shelf: " + averagePageCount() + "\n" + "Average Lines per Page on the shelf: "
				+ averageLinesPerPage();
	}

	public Book getBook(int index) {
		return books.get(index);
	}
}