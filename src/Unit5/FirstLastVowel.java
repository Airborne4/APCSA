//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
package Unit5;

public class FirstLastVowel {
	public static String go(String a) {

		// array of all vowels
		char[] vowelList = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		for (int i = 0; i < vowelList.length; i++) {
			if (a.charAt(0) == vowelList[i] || a.charAt(a.length() - 1) == vowelList[i]) {
				return "yes";
			}
		}

		return "no";
	}
}