public class Expression3{

	public static void main(String args[]) {

		int x = 10;
		int y = 20;
		
		int z = x++ - --y - --x  +  x++; 

		//int y = x++ + ++x;

		System.out.println("The value of x is : "+x);	
		System.out.println("The value of y is : "+y);
		System.out.println("The value of z is : "+z); 

	}

}