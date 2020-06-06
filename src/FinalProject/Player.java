package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.Random;

public class Player {

	int x;
	int y;
	int width;
	int height;
	Color color;
	Rectangle colBox;
	Random r = new Random();
	boolean isAlive;
	public BufferedImage PlayerImage = GamePanel.PlayerUp;

	public Player(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		colBox = new Rectangle(x, y, width, height);
	}

	void setGraphics(BufferedImage PlayerImage) {
		this.PlayerImage = PlayerImage;
	}

	public void setColor(Color c) {
		this.color = c;
	}

	public void draw(Graphics g) {
		g.setColor(color);
		width = 100;
		g.drawImage(PlayerImage, x, y, width, height, null);
		colBox.setBounds(x, y, width, height);
		// System.out.println(x + " " + y + " " + width + " " + height);
	}

	public void kill() {
		isAlive = false;

	}

	public void tunnel() {

	}
}