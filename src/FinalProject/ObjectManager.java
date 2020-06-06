package FinalProject;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JApplet;

public class ObjectManager {
	Player player;
	ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
	ArrayList<Projectile> projectileList = new ArrayList<Projectile>();
	Integer liveCount = 10;
	Date startTime = new Date();
	String lives = "Lives: ";
	Font textFont = new Font("Arial", Font.BOLD, 30);
	AudioClip crashSound;
	AudioClip deathSound;

	public ObjectManager() {
		crashSound = JApplet.newAudioClip(getClass().getResource("scoreUp.wav"));
		deathSound = JApplet.newAudioClip(getClass().getResource("death.wav"));
		System.out.println(startTime.getTime());
	}

	public void addPlayer(Player player) {
		this.player = player;
	}

	public void addEnemy(Enemy enemy) {
		enemyList.add(enemy);

	}

	public void addProjectile(Projectile projectile) {
		projectileList.add(projectile);
	}

	public void draw(Graphics g) {

		for (Enemy enemy : enemyList) {
			enemy.draw(g);
		}
		for (Projectile projectile : projectileList) {
			projectile.draw(g);
		}
		g.setColor(Color.WHITE);
		g.setFont(textFont);
		g.drawString(lives + liveCount.toString(), 100, 100);
		Date endTime = new Date();
		String.valueOf((endTime.getTime() - startTime.getTime()));
		g.drawString("Time Survived:   " + (endTime.getTime() - startTime.getTime()) / 1000, 1550, 100);
		g.setColor(Color.RED);
		g.setFont(textFont);
		/*
		 * g.drawString("Wave  "+String.valueOf(liveCount),1000,110);
		 * 
		 * draws the wave number on the screen
		 * 
		 */
		player.draw(g);
	}

	void playSound() {

		crashSound.play();

	}

	void playDeathSound() {

		deathSound.play();
	}

	public void checkCollision() {

		for (int i = 0; i < enemyList.size(); i++) {
			for (int p = 0; p < projectileList.size(); p++) {

				if (projectileList.get(p).colBox.intersects(enemyList.get(i).colBox)) {

					enemyList.get(i).kill();
					playSound();
					projectileList.get(p).kill();

				}
			}
			if (enemyList.get(i).colBox.intersects(player.colBox)) {

				playDeathSound();
				liveCount -= 1;
				enemyList.removeAll(enemyList);

			}
		}

	}

	public void purge() {

		for (int p = 0; p < projectileList.size(); p++) {

			if (!projectileList.get(p).isAlive) {
				projectileList.remove(p);
			}

		}

		for (int i = 0; i < enemyList.size(); i++) {

			if (!enemyList.get(i).isAlive) {
				enemyList.remove(i);
			}

			if (startTime.getTime() > 10) {

			}

		}
		if (!player.isAlive) {

		}

	}

	public void update() {
		for (Enemy enemy : enemyList) {
			enemy.update(player.x, player.y);
		}

	}

}