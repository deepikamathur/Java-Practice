package Abstraction;

public class Rectangle extends Shape {

	protected double width;
	protected double length;

	public Rectangle() {
	}

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.length + this.width);
	}

	@Override
	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("Rectangle Class is the child class of Shape Class");
		return s1.toString();
	}

}
