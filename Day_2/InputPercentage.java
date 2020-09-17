import java.util.Scanner;

public class InputPercentage{

	public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter the marks of first subject : ");
	double sub1 = sc.nextDouble();

	System.out.println("Enter the marks of second subject : ");
	double sub2 = sc.nextDouble();

	System.out.println("Enter the marks of third subject : ");
	double sub3 = sc.nextDouble();

	System.out.println("Enter the marks of fourth subject : ");
	double sub4 = sc.nextDouble();

	System.out.println("Enter the marks of fifth subject : ");
	double sub5 = sc.nextDouble();		

	double per = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

	System.out.println("percentage marks "+per+" % ");

	}

}