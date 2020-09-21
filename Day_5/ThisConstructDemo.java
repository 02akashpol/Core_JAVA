import java.util.*;

class ThisConstruct{
	
	private int stdId;
	private String stdName;
	
	ThisConstruct() {
		
		this(101, "Akash Pol");
	}
	
	ThisConstruct(int stdId) {
		
		this(stdId, "fname2 lname2");
	}
	
	ThisConstruct(String stdName) {
		
		this(103, stdName);
	}
	
	ThisConstruct(int stdId, String stdName) {
		
		this.stdId = stdId;
		this.stdName = stdName;
	}
	
	void showRecord() {
		
		System.out.println("The details of student - stdId : "+stdId+" stdName : "+stdName);
	}
}

public class ThisConstructDemo{
	
	public static void main(String args[]) {
		
		ThisConstruct obj1 = new ThisConstruct();
		obj1.showRecord();
		
		ThisConstruct obj2 = new ThisConstruct(102);
		obj2.showRecord();
		
		ThisConstruct obj3 = new ThisConstruct("fname3 lname3");
		obj3.showRecord();
		
		ThisConstruct obj4 = new ThisConstruct(104, "fname4 lname4");
		obj4.showRecord();
	}
}