package ExceptionHandling;

public class WrapperClass {

	public static void main(String[] args) {
		
		int num1 = 10;
		
		Integer obj1 = new Integer(num1); // boxing
		//System.out.println(obj1);
		
		Integer obj2 = num1;  // auto boxig
		Integer obj3 = 20;  // auto boxing
		
		Double obj4 = 40.57;
		double num2 = (double)obj4;  // un-boxing
		
		String str = new String("Akash Pol");   // auto un-boxing
		float obj5 = new Float(20.56F);      // auto un-boxing
		
		System.out.println(str);
		System.out.println("The given value is : "+num1);
		System.out.println("The given value is : "+obj1);
		System.out.println("The given value is : "+obj2);
		System.out.println("The given value is : "+obj3);
		System.out.println("The given value is : "+obj4);
		System.out.println("The given value is : "+obj5);
	}

}
