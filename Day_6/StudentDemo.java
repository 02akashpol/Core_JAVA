import java.util.*;

class Student{
	
	private int rollNo;
	public double percentage;

	Student() {
		
		this(3, 99);
	} 
	
	Student(int rollNo, double percentage) {
		
		this.rollNo = rollNo;
		this.percentage = percentage;
	}
	
	void show() {
		
		System.out.println("Roll Number : "+rollNo);
		System.out.println("Percentage : "+percentage);
	}
		
}

class CollegeStudent extends Student{
	
	private int semester;
	
	CollegeStudent() {
		
		this(2, 70, 6);
	}
	
	CollegeStudent(int rollNo, double percentage, int semester) {
		
		super(rollNo, percentage);
		this.semester = semester;
	}
	
	void show() {
		
		super.show();
		System.out.println("Semester : "+semester);
		
	}
}

class SchoolStudent extends Student{
	
	private String className;
	
	SchoolStudent() {
		
		this(1, 90, "10th");
	}
	
	SchoolStudent(int rollNo, double percentage, String className) {
		
		super(rollNo, percentage); // syntax for calling para ctor
		this.className = className;
	}
	
	void show() {
		
		super.show();
		System.out.println("Class Name : "+className);
	}
}

public class StudentDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of five students.");
		
		System.out.println("Provide the details of first school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo1 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage1 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className1 = sc.nextLine();
		
		System.out.println("Provide the details of second school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo2 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage2 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className2 = sc.nextLine();
		
		System.out.println("Provide the details of third school student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo3 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage3 = sc.nextDouble();
		sc.nextLine();
		System.out.print("Enter the class name : ");
		String className3 = sc.nextLine();
		
		System.out.println("Provide the details of first college student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo4 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage4 = sc.nextDouble();
		System.out.print("Enter the number of semester : ");
		int semester4 = sc.nextInt();
		
		System.out.println("Provide the details of second college student.");
		
		System.out.print("Enter the roll number : ");
		int rollNo5 = sc.nextInt();
		System.out.print("Enter the percentage of student : ");
		double percentage5 = sc.nextDouble();
		System.out.print("Enter the number of semester : ");
		int semester5 = sc.nextInt();
		
		Student arr[] = {
			new CollegeStudent(rollNo4, percentage4, semester4), 
			new SchoolStudent(rollNo1, percentage1, className1), 
			new SchoolStudent(rollNo2, percentage2, className2), 
			new CollegeStudent(rollNo5, percentage5, semester5), 
			new SchoolStudent(rollNo3, percentage3, className3)
		};
		
		for(Student trav : arr) {
			
			trav.show();
		}
		
		int counter = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i].percentage>75)
				counter++;
		}
		
		System.out.println("The count of students who all are having A grade : "+counter);
	}
}