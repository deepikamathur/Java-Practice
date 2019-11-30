package CompositionExercise;

public class TestMyPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyPoint p1 = new MyPoint();
		System.out.println(p1);
		p1.setX(3);
		p1.setY(3);

		System.out.println("x is: " + p1.getX());
		System.out.println("y is: " + p1.getY());

		p1.setXY(3, 0);

		System.out.println(p1.getXY()[0]);
		System.out.println(p1.getXY()[0]);
		System.out.println(p1);

		MyPoint p2 = new MyPoint(0, 0);
		System.out.println(p2);

		System.out.println(p1.distance(p2));
		System.out.println(p2.distance(p1));
		System.out.println(p1.distance(2, 6));
		System.out.println(p1.distance());
	}

}
