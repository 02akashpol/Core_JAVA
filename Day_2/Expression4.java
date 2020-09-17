public class Expression4{

	public static void main(String args[]) {

		boolean x = true;
		boolean y = false;
		
		boolean z = x && y || !(x || y); 

		System.out.println("The value of x is : "+x);	
		System.out.println("The value of y is : "+y);
		System.out.println("The value of z is : "+z); 

	}

}