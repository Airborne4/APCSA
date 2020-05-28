package Starfighter;

import java.net.URL;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing {
	private int speed;
	private Image image;

	public Alien() {
		this(0, 0, 30, 30, 0);
	}

	public Alien(int x, int y) {
		super(x, y);
		speed = 0;

	}

	public Alien(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public Alien(int x, int y, int w, int h, int s) {
		super(x, y, w, h);
		speed = s;
		try {
			URL url = getClass().getResource("alien.jpg");
			image = ImageIO.read(url);
		} catch (Exception e) {
		}
	}

	public void setSpeed(int s) {
		speed = s;
		// add code
	}

	public int getSpeed() {
		return speed;
	}

	public void move(String direction) {
		if (direction.equals("LEFT")) {
			this.setX(getX() - speed);
		} else if (direction.equals("RIGHT")) {
			this.setX(getX() + speed);
		} else if (direction.equals("UP")) {
			this.setY(getY() - speed);
		} else if (direction.equals("DOWN")) {
			this.setY(getY() + speed);
		}

	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), getWidth(), getHeight(), null);
	}

	public String toString() {
		return "";
	}
}