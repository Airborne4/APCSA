package Starfighter;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;

@SuppressWarnings("serial")
public class OuterSpace extends Canvas implements KeyListener, Runnable {
	private Ship ship;
	@SuppressWarnings("unused")
	private boolean shot;
	private AlienHorde horde;
	private Bullets shots;
	private boolean canShoot = true;
	private boolean doesCollide = false;
	private boolean[] keys;
	private BufferedImage back;
	private boolean hitsBottom = false;

	public OuterSpace() {
		setBackground(Color.black);
		shot = false;
		keys = new boolean[5];
		ship = new Ship(375, 500, 50, 50, 2);
		horde = new AlienHorde(32);
		shots = new Bullets();
		this.addKeyListener(this);
		new Thread(this).start();
		setVisible(true);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D twoDGraph = (Graphics2D) window;

		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		Graphics graphToBack = back.createGraphics();
		if (horde.size() <= 0) {
			graphToBack.setColor(Color.GREEN);
			graphToBack.setFont(new Font("Serif", Font.BOLD, 50));
			graphToBack.drawString("You Saved the Planet!", 180, 300);
			twoDGraph.drawImage(back, null, 0, 0);

			return;
		}
		if (doesCollide || hitsBottom) {
			graphToBack.setColor(Color.RED);
			graphToBack.setFont(new Font("Serif", Font.BOLD, 50));
			graphToBack.drawString("You Lose", 300, 300);
			twoDGraph.drawImage(back, null, 0, 0);

			return;
		}
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50);
		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0, 0, 800, 600);

		ship.draw(graphToBack);
		horde.removeDeadOnes(shots);
		horde.drawEmAll(graphToBack);
		shots.drawEmAll(graphToBack);
		shots.moveEmAll();
		shots.cleanEmUp();
		horde.moveEmAll();
		if (horde.collides(ship.getX(), ship.getY(), ship.getX() + ship.getWidth(), ship.getY() + ship.getHeight())) {
			doesCollide = true;
		}
		if (horde.hitsBottom(this.getHeight()))
			hitsBottom = true;
		if (ship.getX() <= 0)
			ship.setX(0);
		if (ship.getX() + ship.getWidth() >= this.getWidth())
			ship.setX(this.getWidth() - ship.getWidth());
		if (ship.getY() <= 0)
			ship.setY(0);
		if (ship.getY() + ship.getHeight() >= this.getHeight())
			ship.setY(this.getHeight() - ship.getHeight());
		if (keys[0] == true) {
			ship.move("LEFT");
		}
		if (keys[1] == true) {
			ship.move("RIGHT");
		}
		if (keys[2] == true) {
			ship.move("UP");
		}
		if (keys[3] == true) {
			ship.move("DOWN");
		}
		if (keys[4] == true) {

			if (canShoot) {
				canShoot = false;
				shots.add(new Ammo(ship.getX() + 20, ship.getY(), 3));
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					@Override
					public void run() {
						canShoot = true;
						timer.cancel();
					}
				}, 500);
			}
		}

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e) {
	}

	@SuppressWarnings("static-access")
	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}