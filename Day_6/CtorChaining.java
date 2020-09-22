import java.util.*;

class Boy{
	
	private int age;
	private String name;
	
	Boy(){
		
		this(23, "Akash Pol");
	}
	
	Boy(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	void showRecord() {
		
		System.out.println("Age : "+age);
		System.out.println("Name : "+name);
	}
}

class Student extends Boy{
	
	private String std;
	
	Student() {
		
		this(23, "Akash Pol", "CDAC");
	}
	
	Student(int age, String name, String std) {
		
		super(age, name);
		this.std = std;
	}
	
	void showRecord() {
		
		super.showRecord();
		System.out.println("Std : "+std);
	}
}

public class CtorChaining{
	
	public static void main(String args[]) {
		
		Boy arr[] = {new Boy(), new Student()};
		
		for(Boy trav : arr) {
			
			trav.showRecord();
		}
	}
}