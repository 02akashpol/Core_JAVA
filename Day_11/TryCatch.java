package ExceptionHandling;

import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please eneter the number : ");
		int sal = sc.nextInt();
		int rem = 1;
		
		try {
			
				int res = rem / sal;
				System.out.println(res);
				
		} catch(ArithmeticException exp) {
			
			System.out.println("denominator can not be zero");
		
		} finally {
			
			System.out.println("Program terminated successfully.");
		}
		
	}

}
