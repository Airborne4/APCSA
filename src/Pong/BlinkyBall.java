package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class BlinkyBall extends Ball {

	// constructors
	public BlinkyBall() {
		super();
	}

	public BlinkyBall(int x, int y) {
		super(x, y);
	}

	public BlinkyBall(int x, int y, int w, int h) {
		super(x, y, w, h);
	}

	public BlinkyBall(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}

	public BlinkyBall(int x, int y, int w, int h, int xS, int ySpd) {
		super(x, y, w, h, xS, ySpd);
	}

	public BlinkyBall(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c, xS, yS);
	}

	public void setcor(Color c) {
		super.setColor(c);
	}

	public Color randomcor() {
		int r = (int) (Math.random() * 256); // use Math.random()
		int g = (int) (Math.random() * 256);
		int b = (int) (Math.random() * 256);
		return new Color(r, g, b);
	}

	public void moveAndDraw(Graphics window) {
		setcor(randomcor());
		super.moveAndDraw(window);
	}
}