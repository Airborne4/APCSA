package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.ImageIcon;

public class Enemy {
	int x;
	int y;
	int width;
	int height;
	Random rando = new Random();
	Color color;
	int speed;
	Rectangle colBox;
	Boolean isAlive = true;

	public Enemy(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		colBox = new Rectangle(x, y, width, height);
		speed = rando.nextInt(10);
		speed += 3;

	}

	int exploCount = 0;

	public void draw(Graphics g) {
		g.drawImage(GamePanel.Alien, x, y, width, height, null);
		// g.drawRect(x, y, width, height);
		colBox.setBounds(x, y, width, height);
		// System.out.println(x + " " + y + " " + width + " " + height);

	}

	public void kill() {
		isAlive = false;
	}

	public void update(int px, int py) {
		if (px < x) {
			x -= speed;
		}
		if (px > x) {
			x += speed;
		}
		if (py < y) {
			y -= speed;
		}
		if (py > y) {
			y += speed;
		}

		if (px > 1920) {

		}
	}

}