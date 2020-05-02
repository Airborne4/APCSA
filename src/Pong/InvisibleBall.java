package Pong;

import java.awt.Color;
import java.awt.Graphics;

class InvisibleBall extends Ball {

	private int first = (int) (Math.random() * 1000);
	private int count = -5;

	// constructors
	public InvisibleBall() {
		super();
	}

	public InvisibleBall(int x, int y) {
		super(x, y);
	}

	public InvisibleBall(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	public InvisibleBall(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}

	public InvisibleBall(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h, xS, yS);
	}

	public InvisibleBall(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c, xS, yS);
	}

	public void setcor(Color c) {
		super.setColor(c);
	}

	public Color randomcor() {
		if (count > first + 100) {
			count = 0;
			first = (int) (Math.random() * 2000);
		}
		count += 1;
		if (count > first) {
			return new Color(255, 255, 255);
		} else {
			return Color.black;
		}
	}

	public void moveAndDraw(Graphics window) {
		setcor(randomcor());
		super.moveAndDraw(window);
	}
}