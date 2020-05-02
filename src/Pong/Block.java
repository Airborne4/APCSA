package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable {
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block() {
		setX(1);
		setY(1);
		setWidth(5);
		setHeight(5);
		setColor(Color.CYAN);

	}

	// add other Block constructors - x , y , width, height, color

	public Block(int x, int y, int w, int h, Color c) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(c);

	}

	public Block(int x, int y, int w, int h) {
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
		setColor(Color.GREEN);

	}

	public Block(int x, int y, Color c) {
		setX(x);
		setY(y);
		setColor(c);
	}

	public Block(int x, int y) {
		setX(x);
		setY(y);
	}

	// add the other set methods
	@Override
	public void setX(int xPos) {
		this.xPos = xPos;
	}

	@Override
	public void setY(int yPos) {
		this.yPos = yPos;
	}

	@Override
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setColor(Color col) {
		this.color = col;

	}

	public void draw(Graphics window) {
		window.setColor(color);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col) {
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public boolean equals(Object obj) {
		Block b = (Block) obj;
		if (xPos == b.getX() && yPos == b.getY() && width == b.getWidth() && height == b.getHeight()
				&& color.equals(b.getColor()))
			return true;
		return false;
	}

	// add the other get methods
	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Color getColor() {
		return color;
	}

	// add a toString() method - x , y , width, height, color
	public String toString() {
		return xPos + " " + yPos + " " + width + " " + height + " " + color;
	}
}