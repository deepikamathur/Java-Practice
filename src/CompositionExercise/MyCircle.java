package CompositionExercise;

public class MyCircle {

	private MyPoint center = new MyPoint(0,0);	
	private int radius = 1;
	private int x;
	private int y;
	
	public MyCircle() {}
	
	public MyCircle(int x, int y, int radius) {
	this.x = x;
	this.y = y;
	this.radius = radius;
	}
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public MyPoint getCenter() {
		return center;
	}
	
	
	
	
}
