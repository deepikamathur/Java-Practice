package Exercise1;

import java.util.Scanner;

public class TestEmployee {

		Scanner scanner = new Scanner(System.in) ;
		public static void main(String [] args) {
			Employee employee = new Employee(1, "Deepika", "Mathur", 2000);
			System.out.printf(employee.getName());
			
			System.out.printf("\nResult is %d" ,employee.raiseSalary(20));
			System.out.printf("\n%s", employee.toString());
		}
		
		
		
	}
