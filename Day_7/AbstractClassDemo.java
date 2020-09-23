import java.util.*;

abstract class Processor{
	
	double data;
	
	void showData() {
		
		System.out.println("Data : "+data);
	}
	
	abstract void process();
	
}

class Factorial extends Processor{
	
	void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for factorial.");
		int inp = sc.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=inp; i++) {
			
			fact = fact * i;
		}
		
		data = fact;
	}
}

class Circle extends Processor {
	
	final double PI = 3.14;
	
	void process() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to calculate area of circle.");
		int inp = sc.nextInt();
		
		data = PI * inp * inp;
	}
}


public class AbstractClassDemo{
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice to perform operation.");
			
		System.out.println("1. Factorial of given number.");
		System.out.println("2. Area of circle for given radius.");
		System.out.println("0. Exit.");
		int choice = sc.nextInt();
		
		if(0<=choice && choice<=2) {
			
			if(choice != 0) {
			
				switch(choice) {
					
					case 1: 
						Factorial obj = new Factorial();
						obj.process();
						obj.showData();
						break;
					
					case 2: 
						Circle obj1 = new Circle();
						obj1.process();
						obj1.showData();
						break;
						
				}
			}
		}
		else {
			
			System.out.println("Please provide the valid inputs.");
		}
	}
}