package Starfighter;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AlienHorde {
	private List<Alien> aliens;
	private boolean canMove = true;
	private int mleft = 10;
	private int mright = 0;
	private int mdown = 10;
	private int moveu = 10;

	public AlienHorde(int size) {
		aliens = new ArrayList<Alien>();
		int x = 5;
		int y = 10;
		for (int i = 0; i <= size; i++) {
			if (x > 760) {
				x = 5;
				y += 60;
			}
			aliens.add(new Alien(x, y, 40, 40, 4));
			x += 70;
		}
	}

	public void add(Alien al) {
		aliens.add(al);
	}

	public int size() {
		return aliens.size();
	}

	public void drawEmAll(Graphics window) {
		for (Alien alien : aliens) {
			alien.draw(window);
		}

	}

	public void moveEmAll() {

		if (canMove) {

			if (canMove) {
				canMove = false;
				Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					public void run() {
						canMove = true;
						timer.cancel();
					}
				}, 250);
			}

			if (mright < 10) {
				for (Alien a : aliens) {
					a.move("RIGHT");

				}
				mright++;
				return;
			}
			if (mright == 10) {
				mdown = 0;
				mright++;
			}
			if (mdown < 10) {
				for (Alien a : aliens) {
					a.move("DOWN");

				}
				mdown++;
				return;

			}
			if (mdown == 10) {
				mleft = 0;
				mdown++;
			}
			if (mleft < 10) {
				for (Alien a : aliens) {
					a.move("LEFT");
				}
				mleft++;
				return;
			} else if (mleft == 10) {
				moveu = 0;
				mleft++;
			}
			if (moveu < 10) {
				for (Alien a : aliens) {
					a.move("DOWN");
				}
				moveu++;
				return;
			}
			if (moveu == 10) {
				mright = 0;
				moveu++;
			}
		}
	}

	public boolean collides(int x, int y, int xW, int yH) {
		for (Alien a : aliens) {
			if (((x >= a.getX() && x <= a.getX() + a.getWidth()) && y + 10 <= a.getY() + a.getHeight()
					&& y + 10 >= a.getY())) {
				return true;
			}
		}
		return false;
	}

	public boolean hitsBottom(int height) {
		for (Alien a : aliens) {
			if (a.getY() + a.getHeight() >= height) {
				return true;
			}
		}
		return false;
	}

	public void removeDeadOnes(Bullets bullet) {
		List<Alien> dead = new ArrayList<Alien>();
		List<Ammo> toKill = new ArrayList<Ammo>();
		for (Alien a : aliens) {
			for (Ammo ammo : bullet.getList()) {
				if ((ammo.getX() >= a.getX() && ammo.getX() <= a.getX() + a.getWidth()
						&& ammo.getY() <= a.getY() + a.getHeight() - 10)) {
					dead.add(a);
					toKill.add(ammo);
				}
			}
		}
		bullet.removeAll(toKill);
		aliens.removeAll(dead);
	}

	public String toString() {
		return "";
	}
}