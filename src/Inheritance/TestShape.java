package Inheritance;

public class TestShape {

	public static void main(String args[]) {
		Square s = new Square("Pink", false, 2.0);

		System.out.println(s.toString());

		Circles c = new Circles("yellow", true, 3.0);
		System.out.println("\n" + c.toString());
	}
}
