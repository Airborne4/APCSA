package Q3Lab;

import java.util.ArrayList;

public class Book {
	private ArrayList<Page> pages;
	private int size;

	public Book() {
		size = 0;
		pages = new ArrayList<Page>();
	}

	public Book(int size) {
		this.size = size;
		pages = new ArrayList<Page>();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void newPage(int size) {
		pages.add(new Page(size));
	}

	public Page getPage(int index) {
		return pages.get(index);
	}

	public int getPageCount() {
		return pages.size();
	}

	public double averageLinesPerPage() {
		double count = 0;
		for (int i = 0; i < pages.size(); i++) {
			count += pages.get(i).getLines();
		}
		return count / getPageCount();
	}
	

	public String toString() {
		return "Pamphlet (inches): " + size + "\n" + "Number of pages in the Pamphlet: " + getPageCount()
				+ "\n" + "Average lines per page in the Pamphlet: " + averageLinesPerPage();
	}
}