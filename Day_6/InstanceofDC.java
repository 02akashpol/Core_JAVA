import java.util.*;

class Person{
	
	void showRecord() {
		
		System.out.println("Calling showRecord() method of Person class.");
	}
	
	void getData() {
		
		System.out.println("Calling getData() method of Person class.");
	}
}

class Employee extends Person{
	
	void showRecord() {
		
		System.out.println("Calling showRecord() method of Employee class.");
	}
	
	void displayRecord() {
		
		System.out.println("Calling displayRecord() method of Employee class.");
	}
}

public class InstanceofDC{
	
	public static void main(String args[]) {
		
		Person arr[] = {new Employee(), new Person()};
		
		for(Person trav : arr) {
			
			if(trav instanceof Employee) {
			
				Employee obj = (Employee)trav;
			
				obj.showRecord();
				obj.getData();
				obj.displayRecord();
			}
		}
	}
}