package WinterScene;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class WinterScenePanel extends JPanel implements Runnable {
	private List<AbstractShape> shapes;
	private AbstractShape snowMan;
	private AbstractShape tree;
	private AbstractShape tree2;
	private AbstractShape tree3;
	private AbstractShape hat;

	public WinterScenePanel() {
		setVisible(true);
		Math.random();
		shapes = new ArrayList<AbstractShape>();

		for (int i = 0; i < 100; i++) {
			shapes.add(new FancySnowFlake(((int) (Math.random() * 700) + 50), (int) (Math.random() * 60) + 10,
					(int) (Math.random() * 3) + 15, (int) (Math.random() * 5) + 15, Color.white, 0,
					(int) (Math.random() * 5) + 5));
		}
		snowMan = new SnowMan(550, 395, 150, 150);
		
		tree = new Tree(75, 506, 50, 35);
		tree2 = new Tree(200, 506, 50, 35);
		tree3 = new Tree(400, 506, 50, 35);
		hat = new Hat(625, 300, 50, 35);
		
		new Thread(this).start();
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		window.setColor(Color.BLUE);
		window.fillRect(0, 0, getWidth(), getHeight());
		window.setColor(Color.WHITE);
		window.drawRect(20, 20, getWidth() - 40, getHeight() - 40);
		window.setFont(new Font("TAHOMA", Font.BOLD, 18));
		window.drawString("Nicholas Cornick - WINTER SCENE", 40, 40);
		snowMan.draw(window);
		for (AbstractShape s : shapes) {
			s.moveAndDraw(window);
			if (s.getYPos() > 570) {
				s.setYPos((int) (Math.random() * 30) + 10);
			}
		}
		tree.draw(window);
		tree2.draw(window);
		tree3.draw(window);
		hat.draw(window);
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(35);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}