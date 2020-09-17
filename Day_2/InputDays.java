import java.util.Scanner;

public class InputDays{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the days for cal : ");

		int inp = sc.nextInt();

		int y = inp / 365;
		System.out.println("The number of years as per the input : "+y);

		inp = inp % 365;
		int m = inp / 30;
		System.out.println("The number of months as per the input : "+m);

		int d = inp % 30;
		System.out.println("The number of days as per the input : "+d);		
		
	}

}