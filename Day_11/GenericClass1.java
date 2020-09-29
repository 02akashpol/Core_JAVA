package ExceptionHandling;

class Generic1 <Type1, Type2> {
	
	Type1 t1;
	Type2 t2;
	
	public Generic1(Type1 t1, Type2 t2) {
		
		super();
		this.t1 = t1;
		this.t2 = t2;
	}

	void displya() {
		
		System.out.println("The given values are :: Value1 : "+t1+", Value2 : "+t2);
	}
}

public class GenericClass1 {

	public static void main(String[] args) {
	
		Generic1 <String, Integer> obj1 = new Generic1 <String, Integer> ("Akash Pol", 12);
		obj1.displya();
		
		Generic1 <Float, Double> obj2 = new Generic1 <Float, Double> (45.2F, 23.23);
		obj2.displya();
	}

}
