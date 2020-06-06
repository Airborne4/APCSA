package FinalProject;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements KeyListener, ActionListener {

	ObjectManager om = new ObjectManager();
	Player p = new Player(Space.gameWidth / 2, Space.gameHeight / 2, 75, 150);
	final int START_STATE = 1;
	final int GAME_STATE = 2;
	final int END_STATE = 3;
	public static BufferedImage StartImage;
	public static Image Grass;
	public static BufferedImage PlayerUp;
	public static BufferedImage PlayerDown;
	public static BufferedImage PlayerLeft;
	public static BufferedImage PlayerRight;
	public static BufferedImage Alien;
	public static BufferedImage Explosion;
	public static BufferedImage Title;
	public static BufferedImage GameOver;
	public static BufferedImage[] explosionList = new BufferedImage[8];
	int currentState = START_STATE;
	int fps = 60;
	Random ran = new Random();
	boolean rightpressed;
	boolean leftpressed;
	boolean uppressed;
	boolean downpressed;
	boolean spacepressed;
	int spawntimer;
	Projectile projectile;
	AudioClip projectileSound;
	int spawnreset;
	int spawnTime = 80;
	Timer t = new Timer(1000 / fps, this);
	String finalTime;

	public GamePanel() {
		projectileSound = JApplet.newAudioClip(getClass().getResource("playerProjectile1.wav"));
		for (int i = 0; i < 5; i++) {
			Enemy enemy = new Enemy(ran.nextInt(Space.gameWidth), ran.nextInt(Space.gameHeight), 100, 100);
			om.addEnemy(enemy);
			spawnreset = 0;
		}

		om.addPlayer(p);

		Grass = new ImageIcon(getClass().getResource("space.gif")).getImage();

		try {
			StartImage = ImageIO.read(this.getClass().getResourceAsStream("start.png"));
			Alien = ImageIO.read(this.getClass().getResourceAsStream("enemy2.png"));
			PlayerRight = ImageIO.read(this.getClass().getResourceAsStream("shipRight.png"));
			PlayerLeft = ImageIO.read(this.getClass().getResourceAsStream("shipLeft.png"));
			PlayerDown = ImageIO.read(this.getClass().getResourceAsStream("shipDown.png"));
			PlayerUp = ImageIO.read(this.getClass().getResourceAsStream("shipUp.png"));
			Title = ImageIO.read(this.getClass().getResourceAsStream("Space.png"));
			GameOver = ImageIO.read(this.getClass().getResourceAsStream("gameover.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		p.setGraphics(PlayerUp);

	}

	public void paintComponent(Graphics g) {
		if (currentState == GAME_STATE) {
			drawGameState(g);

			om.checkCollision();
			if (om.liveCount == 0) {
				currentState = END_STATE;
				Date endTime = new Date();
				finalTime = String.valueOf((endTime.getTime() - om.startTime.getTime()) / 1000);

			}
			om.purge();

		} else if (currentState == END_STATE) {
			g.setColor(Color.RED);
			g.drawImage(GamePanel.StartImage, 0, 0, 1920, 1080, null);
			Font f = new Font("Arial", java.awt.Font.BOLD, 75);
			g.setFont(f);
			g.drawImage(GamePanel.GameOver, 600, 100, 775, 200, null);
			g.drawString("You survived for " + finalTime + " seconds", 470, 500);
			g.setColor(Color.WHITE);
			Font f2 = new Font("Arial", java.awt.Font.ITALIC, 50);
			g.setFont(f2);
			g.drawString("Press <ENTER> to Try Again", 625, 700);
			g.drawString("Press <SPACE> to save your score", 625, 800);
			g.drawString("Press <CTRL> to view saved score", 625, 900);
			om.liveCount = 10;
			spawnreset = 0;
			spawnTime = 80;

		} else if (currentState == START_STATE) {
			g.setColor(Color.BLUE);
			g.drawImage(GamePanel.StartImage, 0, 0, 1920, 1080, null);
			g.drawImage(GamePanel.Title, 500, 100, 775, 200, null);
			g.setColor(Color.WHITE);
			Font f3 = new Font("Arial", java.awt.Font.PLAIN, 50);
			g.setFont(f3);
			g.drawString("Try to survive for the longest amount of time by eliminating the opposing aliens", 75, 400);
			g.drawString("Your ship's rapid blaster system can be activated using [SPACE]", 175, 500);
			g.drawString("The ship can be maneuvered with the arrow keys", 350, 600);
			Font f2 = new Font("Arial", java.awt.Font.ITALIC, 50);
			g.setFont(f2);
			g.drawString("Press [ENTER] to Start", 625, 800);

		}
		repaint();
	}

	void playSound() {

		projectileSound.play();
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (currentState == START_STATE) {

			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				currentState = GAME_STATE;
				repaint();
				om.startTime = new Date();
				spawntimer = 0;
				om.enemyList.clear();
				om.projectileList.clear();

				p.x = 850;
				p.y = 540;

				t.start();

			}
		}
		if (currentState == GAME_STATE) {
			if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftpressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightpressed = true;

			}
			if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				downpressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_UP) {
				uppressed = true;
			}
			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				spacepressed = true;
			}
		}
		if (currentState == END_STATE) {
			// Website used for info on text files:
			// https://www.caveofprogramming.com/java/java-file-reading-and-writing-files-in-java.html#:~:text=If%20you%20want%20to%20read,by%20line%20on%20the%20console.
			String leaderText = "C:/Users/nrcor/Documents/GitHub/APCSA/src/FinalProject/Leaderboard.txt";

			if (e.getKeyCode() == KeyEvent.VK_SPACE) {
				int select = JOptionPane.showOptionDialog(null, "Do you want to save your score?", "Save?",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (select == JOptionPane.YES_OPTION) {
					String name = JOptionPane.showInputDialog("Please enter your name below:");
					try {
						PrintWriter writer = new PrintWriter(leaderText);
						writer.write(name + ": " + finalTime + " seconds");
						writer.println();
						writer.close();

					} catch (IOException ex) {
						System.out.println("Error writing to file" + leaderText + "");
					}
				}
			}
			if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
				try (BufferedReader br = new BufferedReader(new FileReader(leaderText))) {
					   String line;
					   while ((line = br.readLine()) != null) {
					       JOptionPane.showMessageDialog(null, line);
						   System.out.println(line);
					   }
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
			}
			if (e.getKeyCode() == KeyEvent.VK_ENTER) {
				currentState = START_STATE;
				repaint();
			}
		}
	}

	void spawnReset() {
		spawnreset++;
	}

	void drawGameState(Graphics g) {
		g.drawImage(GamePanel.Grass, 0, 0, 1920, 1080, null);

		om.draw(g);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			leftpressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rightpressed = false;

		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			downpressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			uppressed = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			spacepressed = false;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		spawntimer++;
		if (spawntimer > spawnTime) {
			Enemy enemy = new Enemy(ran.nextInt(Space.gameWidth), ran.nextInt(Space.gameHeight), 100, 100);
			om.addEnemy(enemy);
			spawntimer = 0;
			spawnReset();
		}
		if (spawnreset > 10 & spawnreset < 20) {
			spawnTime = 70;
		}

		if (spawnreset > 20 & spawnreset < 30) {
			spawnTime = 60;

		}
		if (spawnreset > 30 & spawnreset < 40) {
			spawnTime = 50;

		}
		if (spawnreset > 40 & spawnreset < 50) {
			spawnTime = 40;

		}
		if (spawnreset > 50) {
			spawnTime = 30;

		}
		om.update();
		if (leftpressed) {
			p.x -= 20;
			p.setGraphics(PlayerLeft);
			p.setColor(Color.BLACK);
			if (p.x < 0) {
				p.x = 1920;
			}
			repaint();

		}
		if (rightpressed) {
			p.x += 20;
			p.setGraphics(PlayerRight);
			p.setColor(Color.BLUE);
			if (p.x > 1920) {
				p.x = 0;
			}
			repaint();
		}
		if (downpressed) {
			p.y += 20;
			p.setGraphics(PlayerDown);
			p.setColor(Color.RED);
			if (p.y > 1080) {
				p.y = 0;
			}
			repaint();
		}
		if (uppressed) {
			p.y -= 20;
			p.setGraphics(PlayerUp);
			p.setColor(Color.GREEN);
			if (p.y < 0) {
				p.y = 1080;
			}
			repaint();
		}
		if (spacepressed) {

			projectile = new Projectile(p.x, p.y, 50, 50, p.color);

			om.addProjectile(projectile);

			playSound();
		}

	}

}