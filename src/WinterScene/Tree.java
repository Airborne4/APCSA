package WinterScene;

import java.awt.Color;
import java.awt.Graphics;

public class Tree extends AbstractShape {

	public Tree(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.orange);
		window.fillRect(super.getXPos(), super.getYPos(), super.getWidth(), super.getHeight());
		window.setColor(Color.green);
		int[] xPoints1 = { super.getXPos() - super.getWidth(), super.getXPos() + 2 * super.getWidth(),
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints1 = { super.getYPos(), super.getYPos(), super.getYPos() - super.getHeight() };
		int[] xPoints2 = { super.getXPos() - super.getWidth() * 3 / 5, super.getXPos() + super.getWidth() * 8 / 5,
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints2 = { super.getYPos() - 4 * super.getHeight() / 5, super.getYPos() - super.getHeight() * 4 / 5,
				super.getYPos() - 2 * super.getHeight() };
		int[] xPoints3 = { super.getXPos() - super.getWidth() * 2 / 5, super.getXPos() + super.getWidth() * 7 / 5,
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints3 = { super.getYPos() - super.getHeight() * 7 / 5, super.getYPos() - super.getHeight() * 7 / 5,
				super.getYPos() - 3 * super.getHeight() };
		int[] xPoints4 = { super.getXPos() - super.getWidth() * 1 / 10, super.getXPos() + super.getWidth() * 11 / 10,
				super.getXPos() + super.getWidth() / 2 };
		int[] yPoints4 = { super.getYPos() - super.getHeight() * 25 / 10, super.getYPos() - super.getHeight() * 25 / 10,
				super.getYPos() - 5 * super.getHeight() };
		window.fillPolygon(xPoints1, yPoints1, 3);
		window.fillPolygon(xPoints2, yPoints2, 3);
		window.fillPolygon(xPoints3, yPoints3, 3);
		window.fillPolygon(xPoints4, yPoints4, 3);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		draw(window);
	}

}