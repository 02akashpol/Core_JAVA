package collection;

import java.util.Comparator;
import java.util.TreeSet;

class Employee1 {
	
	int empId;
	String empName;
	
	public Employee1(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
	
		return empId+" "+empName;
	}
}

class EmployeeComparator1 implements Comparator<Employee1> {
	
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	
		return o1.empId - o2.empId;
	}
} 

class EmployeeComparator2 implements Comparator<Employee1> {
	
	@Override
	public int compare(Employee1 o1, Employee1 o2) {
	
		return o1.empName.compareTo(o2.empName);
	}
}

public class CollectionTreeDemo1 {

	public static void main(String[] args) {
		
		TreeSet<Employee1> tcol1 = new TreeSet<Employee1>(new EmployeeComparator1());

		tcol1.add(new Employee1(1, "Akash Pol"));
		tcol1.add(new Employee1(2, "Pol"));
		tcol1.add(new Employee1(5, "AP"));
		tcol1.add(new Employee1(3, "PA"));
		
		for(Employee1 trav : tcol1) {
			
			System.out.println(trav);
		}
		
		System.out.println("----------------------------------------");
		
		TreeSet<Employee1> tcol2 = new TreeSet<Employee1>(new EmployeeComparator2());
		
		tcol2.add(new Employee1(1, "Akash Pol"));
		tcol2.add(new Employee1(2, "Pol"));
		tcol2.add(new Employee1(5, "AP"));
		tcol2.add(new Employee1(3, "PA"));
		
		for(Employee1 trav : tcol2) {
			
			System.out.println(trav);
		}
	}

}
