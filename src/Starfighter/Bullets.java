package Starfighter;

import java.awt.Graphics;

import java.util.ArrayList;
import java.util.List;

public class Bullets {
	private List<Ammo> AmmoList;

	public Bullets() {
		AmmoList = new ArrayList<Ammo>();
	}

	public void add(Ammo al) {
		AmmoList.add(al);
	}

	public void drawEmAll(Graphics window) {
		for (Ammo a : AmmoList) {
			a.draw(window);
		}
	}

	public void moveEmAll() {
		for (Ammo a : AmmoList) {
			a.move("UP");
		}
	}

	public void cleanEmUp() {

		List<Ammo> newAmmo = new ArrayList<Ammo>();
		for (Ammo am : AmmoList) {
			if (am.getY() + am.getHeight() <= 0) {
				newAmmo.add(am);
			}
		}
		AmmoList.removeAll(newAmmo);
	}

	public List<Ammo> getList() {
		return AmmoList;
	}

	public void removeAll(List<Ammo> bullets) {
		AmmoList.removeAll(bullets);
	}

	public String toString() {
		return "";
	}
}
