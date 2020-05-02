package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends Ball {

	public SpeedUpBall() {
		super();
	}

	public SpeedUpBall(int x, int y) {
		super(x, y);
	}

	public SpeedUpBall(int x, int y, int xS, int yS) {
		super(x, y, xS, yS);
	}

	public SpeedUpBall(int x, int y, int w, int h, int xS, int yS) {
		super(x, y, w, h, xS, yS);
	}

	public SpeedUpBall(int x, int y, int w, int h, Color c, int xS, int yS) {
		super(x, y, w, h, c, xS, yS);
	}

	public void setXSpeed() {
		super.setXSpeed(super.getXSpeed() + 1);
	}

	public void setYSpeed() {
		super.setYSpeed(super.getYSpeed() + 1);
	}
}