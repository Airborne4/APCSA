package Q3Lab;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner file = new Scanner(new File("src/Q3Lab/data.dat"));
		Shelf shelf = new Shelf(file.nextInt());
		Scanner keyboard = new Scanner(System.in);
		int num = file.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.println("-------------------------");
			shelf.newBook(file.nextInt());
			int temp = file.nextInt();
			for (int j = 0; j < temp; j++) {
				shelf.getBook(i).newPage(file.nextInt());
				System.out.println(shelf.getBook(i).getPage(j));
			}
			// System.out.println();
			System.out.println(shelf.getBook(i));
		}

		System.out.print(shelf);
		int input;
		System.out.print("Enter a page number for a book to find its location on the shelf :: ");
		input = keyboard.nextInt();
		System.out.println("The book is at position " + (shelf.binarySearch(input) + 1));
	}



}