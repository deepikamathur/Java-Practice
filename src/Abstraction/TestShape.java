package Abstraction;

public class TestShape {

	public static void main(String[] args) {

		Circle c = new Circle(2.0);
		System.out.println(c.getArea());
		System.out.println(c.getPerimeter());
		System.out.println(c.getColor());
		System.out.println(c.isFilled());
		System.out.println(c.toString());

		Circle c1 = new Circle(2.0, "Green", false);
		System.out.println("\n" + c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.toString());

		Rectangle r = new Rectangle(2.0, 2.0, "Pink", true);
		System.out.println("\n" + r.getArea());
		System.out.println(r.getPerimeter());
		System.out.println(r.getColor());
		System.out.println(r.isFilled());
		System.out.println(r.toString());

		Rectangle r1 = new Rectangle(2.0, 2.0);
		System.out.println("\n" + r.getArea());
		System.out.println(r1.getPerimeter());
		System.out.println(r1.getColor());
		System.out.println(r1.isFilled());
		System.out.println(r1.toString());

		Square s1 = new Square(2.0);
		System.out.println("\n" + s1.getArea());
		System.out.println(s1.getPerimeter());
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		System.out.println(s1.toString());

		Square s2 = new Square(2.0, "Black", true);
		System.out.println("\n" + s2.getArea());
		System.out.println(s2.getPerimeter());
		System.out.println(s2.getColor());
		System.out.println(s2.isFilled());
		System.out.println(s2.toString());
	}
}