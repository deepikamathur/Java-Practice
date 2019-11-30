package Inheritance;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		double area = 2 * Math.PI * this.radius;
		return area;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("Circle[radius = ").append(this.radius).append(", color = ").append(this.color).append(" ]");
		return s.toString();
	}
}
