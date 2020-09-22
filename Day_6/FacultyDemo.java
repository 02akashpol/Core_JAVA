import java.util.*;

class Faculty{
	
	private int facultyId;
	private double salary;
	
	void input(int facultyId, double salary) {
		
		this.facultyId = facultyId;
		this.salary = salary;
	}
	
	void printSalary() {
		
		System.out.println("Faculty's salary : "+salary);
	}
}

class FullTimeFaculty extends Faculty{
	
	private double basicSalary;
	private double allowance;
	
	void input(int facultyId, double basicSalary, double allowance) {
		
		this.basicSalary = basicSalary;
		this.allowance = allowance;
		
		double salary = basicSalary + allowance;
		super.input(facultyId, salary);
		
	}
	
}

class PartTimeFaculty extends Faculty{
	
	private int workingHours;
	private double ratePerHour;
	
	void input(int facultyId, int workingHours, double ratePerHour) {
		
		this.workingHours = workingHours;
		this.ratePerHour = ratePerHour;
		
		double salary = workingHours * ratePerHour;
		super.input(facultyId, salary);
	}
}

public class FacultyDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		FullTimeFaculty obj1 = new FullTimeFaculty();
		obj1.input(01, 30000.256, 5000);
		obj1.printSalary();
		
		FullTimeFaculty obj2 = new FullTimeFaculty();
		obj2.input(02, 35000.256, 6000);
		obj2.printSalary();
		
		PartTimeFaculty obj3 = new PartTimeFaculty();
		obj3.input(03, 4, 150);
		obj3.printSalary();
		
		PartTimeFaculty obj4 = new PartTimeFaculty();
		obj4.input(04, 2, 200);
		obj4.printSalary();
	}
}