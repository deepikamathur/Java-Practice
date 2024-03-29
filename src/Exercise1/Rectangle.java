package Exercise1;

public class Rectangle {

	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {}
	
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;	
	}
	
	public float getLength() {
		return this.length;
	}
	
	public void setLength(float length) {
		this.length = length;
	}
	
	public float getWidth() {
		return this.width;
	}
	
	public void setWidth(float width) {
		this.width = width;
	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return (this.length + this.width) * 2;
	}
	
	public String toString() {
		return "Length : " + this.length + "\nWidth : " + this.width;
	}
}
