package Inheritance;

public class Staff extends Person {

	private String school;
	private double pay;

	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return this.pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("Staff[ ").append(super.getName()).append(super.getAddress()).append(" school = ").append(this.school)
				.append(" pay= ").append(this.pay).append("]");

		return s1.toString();
	}
}
