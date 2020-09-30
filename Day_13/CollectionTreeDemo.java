package collection;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.stream.Stream;

class Employee implements Comparable<Employee> {
	
	int empId;
	String empName;
	
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		
		return empId+" "+empName;
	}
	
	@Override
	public int compareTo(Employee obj) {
	
		return empId - obj.empId;
	}
	
}

public class CollectionTreeDemo {

	public static void main(String[] args) {
		
		TreeSet<Employee> tcol = new TreeSet<Employee>();
		
		tcol.add(new Employee(1, "Akash Pol"));
		tcol.add(new Employee(2, "Akash "));
		tcol.add(new Employee(3, "Pol"));
		tcol.add(new Employee(4, "Pol Akash"));
		tcol.add(new Employee(1, "Akash Pol new"));   // it will not store this object bcs of same key value.
		
		for(Employee trav : tcol) {
			
			System.out.println(trav);
		}
	}

}
