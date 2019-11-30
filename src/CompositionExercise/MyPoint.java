package CompositionExercise;

public class MyPoint {
	private int x = 0;
	private int y = 0;

	public MyPoint() {
	}

	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int[] getXY() {
		int[] array = new int[2];
		array[0] = 1;
		array[1] = 2;
		return array;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("(").append(this.x).append(" ,").append(this.y).append(")");
		return s.toString();
	}

	public double distance(MyPoint point) {
		double totalDistance = Math.sqrt(Math.pow(this.x - point.getX(), 2) + Math.pow(this.y - point.getY(), 2));
		return totalDistance;
	}

	public double distance(int x, int y) {
		int xdiff = this.x - x;
		int ydiff = this.y - y;

		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);

	}

	public double distance() {
		int xdiff = this.x - 0;
		int ydiff = this.y - 0;

		return Math.sqrt(xdiff * xdiff + ydiff * ydiff);

	}

}
