package Exercise1;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4, "Blue");
		
		System.out.println("Area : " + c.getArea());
		System.out.println("Radius : " + c.getRadius());
		System.out.println("Color : " + c.getColor());
		System.out.println("Output : " + c.toString());
		System.out.println("Circumference : " + c.getCircumference());
	}

}
