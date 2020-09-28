package ExceptionHandling;

import java.io.IOException;
import java.util.Scanner;

class SuperClass1{
	
	public void m1() throws IOException {
		
		System.out.println("m1() of super class.");
	}
}

class SubClass extends SuperClass1{
	
	public void m1() throws IOException {
		
		System.out.println("m1() of sub class.");
	}
}

public class ThrowOverriding {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = "Akash";
		
		try {

			char trav = str.charAt(5);
			System.out.println(trav);	
			
		} catch(StringIndexOutOfBoundsException exp) {
			
			throw new StringIndexOutOfBoundsException();
		}
		
	}

}
