package Inheritance;

public class Rectangle extends Shape {
	private double width1 = 1.0;
	private double length = 1.0;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width1 = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width1 = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width1;
	}

	public void setWidth(double width) {
		this.width1 = width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return this.length * this.width1;
	}

	public double getPerimter() {
		return 2 * (this.length + this.width1);
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("A Rectangle with width = ").append(this.width1).append(" and length = ").append(this.length)
				.append(" which is a subclass of ").append(super.toString());
		return s.toString();
	}
}
