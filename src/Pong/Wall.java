package Pong;

import java.awt.Color;
import java.awt.Graphics;

public class Wall extends Block{
	public Wall(){
		super();
	}
	public Wall(int x, int y) {
		super(x, y);
	}
	public Wall(int x, int y, int w, int h) {
		super(x, y,w ,h);
	}
	public Wall(int x, int y, int w, int h, Color c) {
		super(x, y, w, h, c);
	}
	public void draw(Graphics window) {
		super.draw(window);
	}
}