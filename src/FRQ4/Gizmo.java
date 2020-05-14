package FRQ4;

public class Gizmo {
	private String maker;
	private boolean isE;

	public Gizmo(String m, boolean e) {
		maker = m;
		isE = e;
	}

	public String getMaker() {
		return maker;
	}

	public boolean isElectronic() {
		return isE;
	}

	public boolean equals(Object other) {
		Gizmo g = (Gizmo) other;
		return getMaker().equals(g.getMaker()) && (g.isE == isE);
	}

	public String toString() {
		return "" + maker + " " + isE;
	}
}