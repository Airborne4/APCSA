package WinterScene;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class SnowMan extends AbstractShape {
	public SnowMan(int x, int y, int w, int h) {
		super(x, y, w, h, Color.WHITE, 0, 0);
	}

	public void draw(Graphics window) {
		window.fillOval(this.getXPos(), this.getYPos(), this.getWidth(), this.getHeight());
		window.fillOval(this.getXPos() + 19, this.getYPos() - 50, this.getWidth() - 40, this.getHeight() - 40);
		window.fillOval(this.getXPos() + 32, this.getYPos() - 100, this.getWidth() - 65, this.getHeight() - 65);
	}

	public void moveAndDraw(Graphics window) {
		draw(window);
	}
}