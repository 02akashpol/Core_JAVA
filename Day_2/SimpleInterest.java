import java.util.Scanner;

public class SimpleInterest{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the inputs for calculate simple interest.");

		System.out.println("Enter the value of principal : ");
		double p = sc.nextDouble();

		System.out.println("Enter the value of rate : ");
		double r = sc.nextDouble();

		System.out.println("Enter the value of t in months : ");
		double t = sc.nextDouble();
			
		double A = (p * r * t) / 100;

		System.out.println("The amout of simple interest for given input : "+A);		

	}

}

