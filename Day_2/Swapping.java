import java.util.Scanner;

public class Swapping{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of num1 : ");
		double num1 = sc.nextDouble();

		System.out.println("Enter the value of num2 : ");
		double num2 = sc.nextDouble();

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("After the swapping values.");

		System.out.println("The value of num1 : "+num1);
		System.out.println("The value of num2 : "+num2);		
	
	}

}