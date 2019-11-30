package Abstraction;

public class Square  extends Rectangle{

	public Square() {}
	
	public Square(double side) {
		  super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	public double getSide() {
		return this.getWidth();
	}
	
	public void setSide(double side) {
		side = this.getWidth();
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getSide() * this.getSide();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (this.getSide() + this.getSide());
	}

	@Override
	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("Square Class is the child class of Rectangle Class and Rectangle Class is a child class of Shape Class");
		return s1.toString();
	}
	
}
