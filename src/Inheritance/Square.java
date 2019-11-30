package Inheritance;

public class Square extends Rectangle {

	public Square() {
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}

	public double getSide() {
		return this.getWidth();
	}

	public void setSide(double side) {
		side = this.getSide();
	}

	public void setWidth(double side) {
		side = this.getWidth();
	}

	public void setLength(double side) {
		side = this.getLength();
	}

	public String toString() {
		StringBuffer s = new StringBuffer();

		s.append("A square with side = ").append(this.getSide()).append(", which is a subclass of ")
				.append(super.toString());
		return s.toString();
	}
}
