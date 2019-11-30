package Inheritance;

public class Ball {
	private float x;
	private float y;
	private float z;

	public Ball() {
	}

	public Ball(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public float getX() {
		return this.x;
	}

	public float getY() {
		return this.y;
	}

	public float getZ() {
		return this.z;
	}

	public void setXYZ(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public String toString() {
		StringBuffer s = new StringBuffer();
		s.append("(").append(this.x).append(",").append(this.y).append(",").append(this.z).append(")");

		return s.toString();
	}
}
