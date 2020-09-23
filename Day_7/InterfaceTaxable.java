import java.util.*;

interface Taxable{
	
	int salesTax = 7;
	//public static final int salesTax = 7;
	double incomeTax = 10.5;
	
	//void calcTax();
	//public abstract void calcTax();
}

abstract class AbstractTaxable{
	
	double tax;
	
	abstract void taxCal();
	
	void showData() {
		
		System.out.println("The yearly tax on given inputs : "+tax);
	}
}

class Employee extends AbstractTaxable implements Taxable{
	
	private int empId;
	private String name;
	private double salary;
	
	Employee(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void taxCal() {
		
		tax = (incomeTax * salary) / 100;
	}
}

class Product extends AbstractTaxable implements Taxable{
	
	private int pid;
	private double price;
	private int quantity;
	
	Product(int pid, double price, int quantity) {
		
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	void taxCal() {
		
		double res = price * quantity;
		tax = (salesTax * res) / 100;
	} 
}

public class InterfaceTaxable{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice to perform operation.");
			
		System.out.println("1. To calculate the employee's salary tax.");
		System.out.println("2. To calculate the product tax.");
		System.out.println("0. Exit.");
		//int choice = sc.nextInt();
		int choice;
		//sc.nextLine();
			
		while((choice = sc.nextInt())!=0) {
				
			if(0<choice && choice<=2) {				
			
				switch(choice) {
					
					case 1 : 
						System.out.println("Enter the employee details.");
						System.out.print("Enter the empId : ");
						int empId = sc.nextInt();
						sc.nextLine();
						System.out.print("Enter the emp name : ");
						String name = sc.nextLine();
						System.out.print("Enter the emp salary : ");
						double salary = sc.nextInt();
						
						Employee obj1 = new Employee(empId, name, salary);
						obj1.taxCal();
						obj1.showData();
						
						break;
						
					case 2 :
						sc.nextLine();
						System.out.println("Enter the product details.");
						System.out.print("Enter the pid : ");
						int pid = sc.nextInt();
						System.out.print("Enter the price : ");
						double price = sc.nextDouble();
						System.out.print("Enter the quantity : ");
						int quantity = sc.nextInt();
						
						Product obj2 = new Product(pid, price, quantity);
						obj2.taxCal();
						obj2.showData();
						
						break;
				}
			} else {
			
				System.out.println("Please provide the valid inputs.");
			}
		} 
	}
}