import java.util.*;

public class Prime{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number whether it is prime or not : ");
		long inp = sc.nextLong();
		boolean flag = false;

		for(int i=2; i<inp/2; i++) {

			if(inp%i == 0) {

				flag = true;
			}
		}

		if(flag == true) {

			System.out.println("The given number is not a prime number.");
		}
		else {

			System.out.println("The given number is a prime number.");
		}
	}
}