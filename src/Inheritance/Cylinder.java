package Inheritance;

public class Cylinder extends Circle {

	private double height = 1.0;

	public Cylinder() {
	}

	public Cylinder(double radius) {
		super(radius);
	}

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;

	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {
		double volume = 2 * Math.PI * getRadius() * this.height;
		return volume;
	}

	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("Cylinder: subclass of ").append(super.toString()).append(" height = ").append(height)
				.append(" volume = ").append(getVolume());
		return s1.toString();

	}
}
