import java.util.*;

public class Reverse{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for reversing it : ");
		int inp = sc.nextInt();

		long temp, rev = 0, rem;

		temp = inp;
		while(inp > 0) {

			rem = inp % 10;
			rev = rev * 10 + rem;
			inp = inp / 10;
		}

		System.out.println("The given number is : "+temp);
		System.out.println("The reverse of given number is : "+rev);

	}
}