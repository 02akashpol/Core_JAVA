package ExceptionHandling;

class Generic <Type> {
	
	Type t;
	
	public Generic(Type t) {
	
		this.t = t;
	}
	
	void displya() {
		
		System.out.println("The given value is : "+t);
	}
}

public class GenericClass {

	public static void main(String[] args) {
		
		Generic <Integer> obj1 = new Generic <Integer> (12);
		obj1.displya();
		
		Generic <String> obj2 = new Generic <String> ("Akash Pol");
		obj2.displya();
		
		Generic <Boolean> obj3 = new Generic <Boolean> (true);
		obj3.displya();
				
	}

}
