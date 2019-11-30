package Abstraction;

public class Circle extends Shape {

	protected double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub

		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radius;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer();
		s1.append("Circle Class is the child class of Shape Class");
		return s1.toString();
	}

}
