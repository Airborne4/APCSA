package Q3Lab;

public class Page {
	private int lines;

	public Page() {
		lines = 0;
	}

	public Page(int lines) {
		this.lines = lines;
	}

	public int getLines() {
		return lines;
	}

	public void setLines(int lines) {
		this.lines = lines;
	}
	
	public String toString() {
		return "Lines on page: " + lines;
	}
}