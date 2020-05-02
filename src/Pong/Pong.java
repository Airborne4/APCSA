package Pong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

public class Pong extends Canvas implements KeyListener, Runnable {

	private InvisibleBall ball;
	private BlinkyBall ball2;
	private Paddle leftPaddle, rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private int player1Score = 0, player2Score = 0, width, height;
	private Wall topWall, rightWall, leftWall, bottomWall;

	public Pong() {
		ball = new InvisibleBall(300, 300, 10, 10, Color.black);
		ball2 = new BlinkyBall(300, 300, 10, 10, Color.black);
		leftPaddle = new Paddle(20, 300, 20, 100, Color.blue, 2);
		rightPaddle = new Paddle(740, 300, 20, 100, Color.red, 2);
		topWall = new Wall(0, 0, width, 0);
		rightWall = new Wall(width, 0, 0, height);
		leftWall = new Wall(0, 0, 0, height);
		bottomWall = new Wall(0, height, width, 0);

		keys = new boolean[4];

		setBackground(Color.white);
		setVisible(true);

		new Thread(this).start();
		addKeyListener(this);
	}

	public void update(Graphics window) {
		paint(window);
	}

	public void paint(Graphics window) {
		Graphics2D twoDGraph = (Graphics2D) window;

		if (back == null)
			back = (BufferedImage) (createImage(getWidth(), getHeight()));

		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		ball2.moveAndDraw(graphToBack);
		leftPaddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		width = getWidth();
		height = getHeight();
		bottomWall = new Wall(0, height - 10, width, 0);
		topWall = new Wall(0, 0, width, 0);
		rightWall = new Wall(width, 0, 0, height);
		leftWall = new Wall(0, 0, 0, height);

		graphToBack.setColor(Color.blue);
		graphToBack.drawString("" + player1Score, 350, 550);
		graphToBack.setColor(Color.red);
		graphToBack.drawString("" + player2Score, 380, 550);

		// see if ball hits left wall or right wall
		if (ball.didCollideRight(rightWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("" + player1Score, 350, 550);
			player1Score++;
			ball.resetBall(graphToBack);
		}
		if (ball2.didCollideRight(rightWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("" + player1Score, 350, 550);
			player1Score++;
			ball2.resetBall(graphToBack);
		}
		if (ball.didCollideLeft(leftWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("" + player2Score, 380, 550);
			player2Score++;
			ball.resetBall(graphToBack);
		}
		if (ball2.didCollideLeft(leftWall)) {
			graphToBack.setColor(Color.white);
			graphToBack.drawString("" + player2Score, 380, 550);
			player2Score++;
			ball2.resetBall(graphToBack);
		}

		// see if the ball hits the top or bottom wall
		if (ball.didCollideBottom(bottomWall) || ball.didCollideTop(topWall)) {
			if (ball.getXSpeed() > 0) {
				ball.setXSpeed(ball.getXSpeed() + 1);

			}
			if (ball.getXSpeed() < 0) {
				ball.setXSpeed(ball.getXSpeed() - 1);
			}
			ball.setYSpeed(-ball.getYSpeed());
		}
		if (ball2.didCollideBottom(bottomWall) || ball2.didCollideTop(topWall)) {
			if (ball2.getXSpeed() > 0) {
				ball2.setXSpeed(ball2.getXSpeed() + 1);

			}
			if (ball2.getXSpeed() < 0) {
				ball2.setXSpeed(ball2.getXSpeed() - 1);
			}
			ball2.setYSpeed(-ball2.getYSpeed());
		}

		// see if the ball hits the left paddle
		if (ball.didCollideLeft(leftPaddle) && !(ball.didCollideBottom(leftPaddle))
				&& !(ball.didCollideTop(leftPaddle))) {
			ball.setXSpeed(-ball.getXSpeed() + 1);
		}
		if (ball2.didCollideLeft(leftPaddle) && !(ball2.didCollideBottom(leftPaddle))
				&& !(ball2.didCollideTop(leftPaddle))) {
			ball2.setXSpeed(-ball2.getXSpeed() + 1);
		}

		// see if the ball hits the right paddle
		if (ball.didCollideRight(rightPaddle) && !(ball.didCollideBottom(rightPaddle))
				&& !(ball.didCollideTop(rightPaddle))) {
			ball.setXSpeed(-ball.getXSpeed() - 1);
		}
		if (ball2.didCollideRight(rightPaddle) && !(ball2.didCollideBottom(rightPaddle))
				&& !(ball2.didCollideTop(rightPaddle))) {
			ball2.setXSpeed(-ball2.getXSpeed() - 1);
		}

		// see if the paddles need to be moved
		if (keys[0] == true) {
			if (leftPaddle.getY() >= 1) {
				leftPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if (keys[1] == true) {
			if (leftPaddle.getY() <= (getHeight() - leftPaddle.getHeight())) {
				leftPaddle.moveDownAndDraw(graphToBack);
			}
		}
		if (keys[2] == true) {
			if (rightPaddle.getY() >= 1) {
				rightPaddle.moveUpAndDraw(graphToBack);
			}
		}
		if (keys[3] == true) {
			if (rightPaddle.getY() <= (getHeight() - rightPaddle.getHeight())) {
				rightPaddle.moveDownAndDraw(graphToBack);
			}
		}
		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = true;
			break;
		case 'Z':
			keys[1] = true;
			break;
		case 'I':
			keys[2] = true;
			break;
		case 'M':
			keys[3] = true;
			break;
		}
	}

	public void keyReleased(KeyEvent e) {
		switch (toUpperCase(e.getKeyChar())) {
		case 'W':
			keys[0] = false;
			break;
		case 'Z':
			keys[1] = false;
			break;
		case 'I':
			keys[2] = false;
			break;
		case 'M':
			keys[3] = false;
			break;
		}
	}

	public void keyTyped(KeyEvent e) {
	}

	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(8);
				repaint();
			}
		} catch (Exception e) {
		}
	}
}