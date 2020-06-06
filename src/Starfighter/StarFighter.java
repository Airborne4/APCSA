package Starfighter;

import javax.swing.JFrame;
import java.awt.Component;

@SuppressWarnings("serial")
public class StarFighter extends JFrame {
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public StarFighter() {
		super("Fighter Squadron");
		setSize(WIDTH, HEIGHT);

		OuterSpace theGame = new OuterSpace();
		((Component) theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		StarFighter run = new StarFighter();
	}
}