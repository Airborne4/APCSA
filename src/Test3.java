
public class Test3 {

	public static String withoutX(String str) {
		  return (str.length() < 1) ? str : (str == "x") ? "" : ((str.charAt(0) == 'x') && (str.charAt(str.length()-1) == 'x')) ? str.substring(1, str.length() -1) : str.charAt(0) == 'x' ? str.substring(1, str.length()) : (str.charAt(str.length()-1) == 'x') ? str.substring(0, str.length()-1) : str;
		}

public static void main(String[] args) {
	System.out.println(withoutX("hx"));
}
}
