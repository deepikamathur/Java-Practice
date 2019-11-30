package Exercise1;

public class Employee {

	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int id, String firstName, String lastName, int salary){
	 this.id = id;
	 this.firstName = firstName;
	 this.lastName = lastName;
	 this.salary = salary;
	}
	
	public int getID() {
		return this.id;	
	}
	
	public String getFirst() {
		return this.firstName;
	}
	
	public String lastName() {
		return this.lastName;
	}
	public String getName() {
		String fullName = firstName + " " + lastName; 
		return fullName;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int annualSalary() {
		int annualSal = this.salary * 12; 
		return annualSal;
	}
	
	public int raiseSalary(int percent) {
		this.salary = (percent * this.salary / 100) + this.salary;
		
		return this.salary;
	}
	
	public String toString() {
		String information = "id " + this.id + "\nName :" + getName() + ", Salary " + this.salary;
		return information;
	}
}
