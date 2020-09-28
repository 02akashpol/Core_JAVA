package ExceptionHandling;

class SuperClass{
	
	int num1;

	public SuperClass(int num1) {
		super();
		this.num1 = num1;
	}
	
	void display() {
		
		System.out.println("The value of num1 is : "+num1);
	}
}

public class ClassesObj {

	public static void main(String[] args) {
		
		SuperClass obj = new SuperClass(10);
		obj.display();
		System.out.println(obj);  // hexadecimal code bcs user-defined classes
		
		int num1 = 10;
		
		Integer i = new Integer(num1);
		System.out.println(i);    // the value of we are passing that var 
								  //bcs in build classes. method can be modified. 
		
	}

}
