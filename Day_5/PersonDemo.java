import java.util.*;

class Person{
	
	private int age;
	private String perName;
	
	Person(String perName){
		
		this(18, perName);
	}
	
	Person(int age, String perName) {
		
		this.age = age;
		this.perName = perName;
	}
	
	void showRecord() {
		
		System.out.println("Details of person - age : "+age+" Person name : "+perName);
	}
}

public class PersonDemo{
	
	static public void main(String args[]) {
		
		Person obj1 = new Person("Akash Pol");
		obj1.showRecord();
		
		Person obj2 = new Person(23, "Akash Pol");
		obj2.showRecord();
	}
}