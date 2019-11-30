package Exercise1;

public class Circle {

	private double radius = 1.0;
	private String color = "red";

	public Circle() {
	}

	public Circle(double r) {
		this.radius = r;
	}
	public Circle(double r, String color) {
		this.radius = r;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public double getArea() {
		double area = this.radius * this.radius;
		return area;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public  double getCircumference() {
		return Math.PI * this.radius * 2;
	}
	
	public String toString() {
		return  "Circle radius : " + radius + "\nCircle color : " + color;
	}
}
