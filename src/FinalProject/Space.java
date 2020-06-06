package FinalProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Space {
	JFrame j = new JFrame("Space!");
	public static final int gameWidth = 1920, gameHeight = 1080;
	GamePanel jp = new GamePanel();

	Space() {
		j.setSize(1920, 1080);

		j.setVisible(true);
		j.add(jp);

		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jp.setSize(new Dimension(gameWidth, gameHeight));
		jp.setBackground(Color.blue);
		jp.setOpaque(true);
		j.addKeyListener(jp);

	}

	public static void main(String[] args) {
		new Space();
	}
}