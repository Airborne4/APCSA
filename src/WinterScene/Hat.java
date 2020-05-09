package WinterScene;

import java.awt.Color;
import java.awt.Graphics;

public class Hat extends AbstractShape {

	public Hat(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.setColor(Color.black);
		window.drawLine(this.getXPos() - 40, this.getYPos() + 5, this.getXPos() + 40, this.getYPos() + 5);
		window.fillRect(this.getXPos() - 25, this.getYPos() - 35, 50, 41);
	}

	@Override
	public void moveAndDraw(Graphics window) {
		// TODO Auto-generated method stub
		draw(window);
	}

}