import java.util.*;
import java.lang.Math;

class MathOperation{
	
	static double add(double num1, double num2) {
		
		return(num1 + num2);
	}
	
	static double subtract(double num1, double num2) {
		
		return(num1 - num2);
	}
	
	static double multiply(double num1, double num2) {
		
		return(num1 * num2);
	}
	
	static double power(double num1, double num2) {
		
		return(Math.pow(num2, num1));
	}
	
	static void showRecord(double num1, double num2) {
		
		double add = add(num1, num2);
		System.out.println("The addition of given two numbers is : "+add);
		
		double sub = subtract(num1, num2);
		System.out.println("The subtraction of given two numbers is : "+sub);
		
		double mul = multiply(num1, num2);
		System.out.println("The multiplication of given two numbers is : "+mul);
		
		double pow = power(num1, num2);
		System.out.println("The power of given two numbers is : "+pow);
	}
}

public class MathOpDemo{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the two numbers for math operations : ");
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		
		MathOperation obj1 = new MathOperation();
		
		obj1.showRecord(num1, num2);
	}
}