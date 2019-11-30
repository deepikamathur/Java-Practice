package Inheritance;

public class Shape {

	private String color = "red";
	private boolean filled = true;

	public Shape() {
	}

	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return this.filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("A shape with color of  ").append(this.color).append(" and ").append(filled);
		return s.toString();
	}

}
