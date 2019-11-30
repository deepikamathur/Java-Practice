package Exercise1;

public class TestRectangle {
	
	public static void main(String[]args) {
		
		Rectangle rectangle  = new Rectangle(4,5);
		
		System.out.println(rectangle.toString());
		System.out.println("Perimeter : " + rectangle.getPerimeter());
	}

}
