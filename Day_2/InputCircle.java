import java.util.Scanner;

public class InputCircle{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the value of radius for cal : ");

		double rad = sc.nextDouble();

		double area = (3.14 * rad * rad);
		double crmf = (2 * 3.14 * rad);

		System.out.println("The value of area of circle is : "+area);
		System.out.println("The value of circumference of circle is : "+crmf);		

	}

}