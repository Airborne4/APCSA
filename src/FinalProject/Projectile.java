package FinalProject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Projectile {
	int x;
	int y;
	int width;
	int height;
	Random rando = new Random();
	Color color;
	int speed;
	Rectangle colBox;
	Boolean isAlive;

	public Projectile(int x, int y, int width, int height, Color playercolor) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = playercolor;
		colBox = new Rectangle(x, y, width, height);
		speed = rando.nextInt(14);
		speed += 3;
		isAlive = true;
	}

	public void draw(Graphics g) {
		colBox.setBounds(x, y, width, height);
		if (color == Color.BLACK) {
			x -= 20;
		}
		if (color == Color.BLUE) {
			x += 20;
		}
		if (color == Color.RED) {
			y += 20;
		}
		if (color == Color.GREEN) {
			y -= 20;
		}
		g.setColor(Color.RED);
		g.fillRect(x, y, width, height);

	}

	public void kill() {
		isAlive = false;
	}

}