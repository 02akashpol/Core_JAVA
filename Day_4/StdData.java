import java.util.*;

class Student{

	private int rno;
	private String name;

	void setData(int stdRno, String stdName) {

		rno = stdRno;
		name = stdName;
	}

	void showData() {

		System.out.println(rno+" "+name);
	}
}

public class StdData{

	public static void main(String args[]) {

		Student std1 = new Student();

		std1.setData(01, "Akash Pol");
		std1.showData();
	
		Student std2 = new Student();

		std2.setData(02, "Prakash Pol");
		std2.showData();
	}
	
}