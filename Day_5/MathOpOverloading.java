import java.util.*;

class MathOperation{
	
	static void multiply(int num1, int num2) {
		
		System.out.println("The multiplication of two integers is : "+(num1 * num2));
	}
	
	static void multiply(double num1, int num2) {
		
		System.out.println("The multiplication of one double and one integer is : "+(num1 * num2));
	}
	
	static void multiply(float num1, float num2, float num3) {
		
		System.out.println("The multiplication of three floats is : "+(num1 * num2 * num3));
	}
	
	static void multiply(int arr[]) {
		
		int res = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			res = res * arr[i];
		}
		
		System.out.println("The multiplication of all array elements is : "+res);
	}
}

public class MathOpOverloading{
	
	public static void main(String[] args) {
		
		MathOperation.multiply(10, 20);
		MathOperation.multiply(10.05, 20);
		MathOperation.multiply(10f, 20.2f, 30.45f);
		
		int arr[] = new int[] {10, 20, 30};
		
		MathOperation.multiply(arr);
	}
}