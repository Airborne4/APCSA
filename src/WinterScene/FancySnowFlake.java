package WinterScene;

import java.awt.Color;
import java.awt.Graphics;

public class FancySnowFlake extends AbstractShape {

	public FancySnowFlake(int x, int y, int wid, int ht) {
		super(x, y, wid, ht);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color color) {
		super(x, y, wid, ht, color);
	}

	public FancySnowFlake(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd) {
		super(x, y, wid, ht, col, xSpd, ySpd);
	}

	@Override
	public void draw(Graphics window) {
		window.drawOval(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		super.setXPos(super.getXPos() + (int) (Math.random() * 10) - (int) (Math.random() * 10));
		super.setYPos(super.getYPos() + super.getYSpeed());

		if (super.getXPos() > 790) {
			super.setXPos((int) (Math.random() * 700) + 50);
		}

		int[] xPoints1 = { super.getXPos(), super.getXPos() + super.getWidth(),
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints1 = { super.getYPos(), super.getYPos(), super.getYPos() + super.getHeight() };
		int[] xPoints2 = { super.getXPos(), super.getXPos() + super.getWidth(),
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints2 = { super.getYPos() + super.getHeight() / 2, super.getYPos() + super.getHeight() / 2,
				super.getYPos() - super.getHeight() / 2 };
		window.drawPolygon(xPoints1, yPoints1, 3);
		window.drawPolygon(xPoints2, yPoints2, 3);
	}

}
