import java.util.*;

class Student{
	
	private int rno;
	private String name;
	private static int counter;
	
	void setData(int stdRno, String stdName, int stdCounter) {
		
		rno = stdRno;
		name = stdName;
		counter = stdCounter;
	}
	
	void showData() {
		
		System.out.println(rno+" "+name);
	}
	
	void countMethod() {
		
		System.out.println("Count of object created for Student class is : "+counter);
	}
}

public class CntStd{
	
	public static void main(String args[]) {
		
		Student std1 = new Student();
		
		std1.setData(01, "Akash POl", 1);
		std1.showData();
		
		Student std2 = new Student();
		
		std2.setData(02, "Prakash Pol", 2);
		std2.showData();
		
		std2.countMethod();
	}
}