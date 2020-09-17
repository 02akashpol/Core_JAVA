import java.util.*;

public class Greatest{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value : ");
		double num1 = sc.nextDouble();

		System.out.println("Enter the second value : ");
		double num2 = sc.nextDouble();

		System.out.println("Enter the third value : ");
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {

			System.out.println("The greatest value is : "+num1);

		}
		else if (num2 > num1 && num2 > num3) {

			System.out.println("The greatest value is : "+num2);

		}
		else {

			System.out.println("The greatest value is : "+num3);			
		
		}


	}

}