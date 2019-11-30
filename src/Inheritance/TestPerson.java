package Inheritance;

public class TestPerson {

	public static void main(String[] args) {

		Staff s = new Staff("Deepika", "754 the alameda", "MPS", 200.0);
		System.out.println(s.toString());

		Student s1 = new Student("Priyank", "Zaffar Hall", "CS", 2016, 20192.0);
		System.out.println(s1.toString());
	}

}
