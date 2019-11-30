package Inheritance;

public class TestCylinder {

	public static void main(String[] args) {
		Cylinder c1 = new Cylinder();
		System.out.println("Cylinder: " + "\nradius =" + c1.getRadius() + "\nheight=" + c1.getHeight() + "\nbase area="
				+ c1.getArea() + "\nvolume=" + c1.getVolume());

		Cylinder c2 = new Cylinder(10.0);
		System.out.println("\n\nCylinder: " + "\nradius =" + c2.getRadius() + "\nheight=" + c2.getHeight()
				+ "\nbase area=" + c2.getArea() + "\nvolume=" + c2.getVolume());

		Cylinder c3 = new Cylinder(10.0, 2.0);
		System.out.println("\n\nCylinder: " + "\nradius =" + c3.getRadius() + "\nheight=" + c3.getHeight()
				+ "\nbase area=" + c3.getArea() + "\nvolume=" + c3.getVolume());

		System.out.println("\n" + c3.toString());

	}

}
