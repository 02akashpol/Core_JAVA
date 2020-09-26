package pkg1;

import java.util.Scanner;

class Employee1{
	
	private int empId;
	private String empName;
	
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		
		return empId+" "+empName;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee1) {
			
			Employee1 obj1 = (Employee1)obj;
			return empId == obj1.empId;
		}
		
		return false;
	}
}

public class Equals {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Employee1 obj2 = new Employee1(1, "Akash");
		Employee1 obj3 = obj2;
		Employee1 obj4 = new Employee1(1, "Akash");
		Employee1 obj5 = new Employee1(0, null);
		
		System.out.println("obj2.equals(obj3) : "+obj2.equals(null));
		System.out.println("obj2.equals(obj4) : "+obj2.equals(obj4));
		System.out.println("obj2.equals(obj5) : "+obj2.equals(obj5));
		
		/*
		System.out.println("-------------------------------------------------");
		
		Employee1 obj6 = new Employee1(1, "Akash");
		Employee1 obj7 = obj2;
		Employee1 obj8 = new Employee1(1, "Akash");
		Employee1 obj9 = new Employee1(2, "Demo");
		
		System.out.println("obj6.equals(obj7) : "+(obj6==obj7));
		System.out.println("obj6.equals(obj8) : "+(obj6==obj8));
		System.out.println("obj6.equals(obj9) : "+(obj6==obj9));
		*/
	}

}
