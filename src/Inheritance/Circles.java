package Inheritance;

public class Circles extends Shape {

	private double radius = 1.0;

	public Circles() {
	}

	public Circles(double radius) {
		this.radius = radius;
	}

	public Circles(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("A circle with radius = ").append(this.radius).append(", which is a subclass of  ")
				.append(super.toString());

		return s.toString();
	}
}
