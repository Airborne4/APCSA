//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -
package Unit0;

public class AsciiBox {

	public static void boxer(int n) {
		String box = "+++++++++++++++++++++++++\r\n" + "+++++++++++++++++++++++++\r\n" + "+++++++++++++++++++++++++\r\n"
				+ "AAAAAAAAAAAAAAAAAAAAAAAAA\r\n" + "AAAAAAAAAAAAAAAAAAAAAAAAA";

		for (int i = 0; i < n; i++) {
			System.out.println(box);
		}

	}

	public static void main(String[] args) {
		System.out.println("name \t  date \n\n");
		boxer(5);

	}
}