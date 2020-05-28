package Starfighter;

import java.awt.Color;
import java.awt.Graphics;

public class Ammo extends MovingThing {
	private int speed;

	public Ammo() {
		this(0, 0, 0);
	}

	public Ammo(int x, int y) {
		super(x, y);
		speed = 0;
	}

	public Ammo(int x, int y, int s) {
		super(x, y);
		speed = s;
	}

	public void setSpeed(int s) {
		speed = s;
	}

	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.setColor(Color.RED);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
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

	public String toString() {
		return "";
	}
}