package Inheritance;

public class Person {

	private String name;
	private String address;

	public Person() {
	}

	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("Person [name= ").append(this.name).append(" , address = ").append(this.address).append("]");
		return s1.toString();
	}

}
