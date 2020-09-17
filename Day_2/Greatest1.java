import java.util.*;

public class Greatest1{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the first value : ");
		double num1 = sc.nextDouble();

		System.out.println("Enter the second value : ");
		double num2 = sc.nextDouble();

		System.out.println("Enter the third value : ");
		double num3 = sc.nextDouble();

		String res = (num1 > num2 && num1 > num3) ? "The greatest value is "+num1 : ((num2 > num1 && num2 > num3) ? "The greatest value is "+num2 : "The greatest value is "+num3);
		System.out.println(res);

	}

}