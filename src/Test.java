import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	System.out.println("What up");
	String input = JOptionPane.showInputDialog("Are you cool?");
	if (input == "yes") {
		JOptionPane.showMessageDialog(null, "No you aint");
	}
	else {
		JOptionPane.showMessageDialog(null, "Dat rite");
	}
}
}
