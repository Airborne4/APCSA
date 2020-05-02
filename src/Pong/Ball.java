package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable {
	private int xSpeed;
	private int ySpeed;

	public Ball() {
		super(200, 200);
		xSpeed = 3;
		ySpeed = 1;
	}

	public Ball(Color c) {
		super(200, 200, c);
		setXSpeed(2);
		setYSpeed(2);
	}

	public Ball(int x, int y) {
		super(x, y);
		setXSpeed(2);
		setYSpeed(2);
	}

	public Ball(int x, int y, int w, int h) {
		super(x, y, w, h);
		setXSpeed(2);
		setYSpeed((int) (Math.random() + 4) - 2);
	}

	public Ball(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
		setXSpeed(2);
		ySpeed = (int) (Math.random() + 4) - 2;
		System.out.println("" + ySpeed);
	}

	public Ball(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h);
		setXSpeed(xS);
		setYSpeed(yS);
	}

	public Ball(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c);
		setXSpeed(xS);
		setYSpeed(yS);
	}
	
	public void setXSpeed(int xS) {
		xSpeed = xS;
	}

	public void setYSpeed(int yS) {
		ySpeed = yS;
	}

	public void moveAndDraw(Graphics window) {
		draw(window, Color.white);
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
		draw(window, super.getColor());
	}

	public boolean equals(Object obj) {
		Ball hi = (Ball) obj;

		if (xSpeed == hi.getXSpeed() && ySpeed == hi.getYSpeed())
			return true;

		return false;
	}

	public void resetBall(Graphics window) {
		draw(window, Color.white);
		setX(300);
		setY(300);
		double a = Math.random();
		if (a > .5) {
			setXSpeed(2);
		} else {
			setXSpeed(-2);
		}
		setYSpeed((int) (Math.random() * 4) - 2);
	}

	public int getXSpeed() {
		return xSpeed;
	}

	public int getYSpeed() {
		return ySpeed;
	}

	public String toString() {
		return super.toString() + " " + xSpeed + " " + ySpeed;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block) obj;
		if (getX() <= b.getX() + b.getWidth())
			return true;
		return false;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block) obj;
		if (getX() + getWidth() >= b.getX())
			return true;
		return false;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block) obj;
		if (getY() <= b.getY())
			return true;
		return false;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		// TODO Auto-generated method stub
		Block b = (Block) obj;
		if (getY() >= b.getY() + b.getHeight())
			return true;
		return false;
	}
}