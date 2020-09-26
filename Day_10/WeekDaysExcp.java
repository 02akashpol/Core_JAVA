package pkg_52;

import java.util.Scanner;

public class WeekDaysExcp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the number of week days.");
		//int size = sc.nextInt();
		String weekdays[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		/*
		System.out.println("Enter the week days.");
		for(int i=0; i<weekdays.length; i++) {
			
			System.out.print("Enter the "+(i+1)+" day : ");
			weekdays[i] = sc.next();
		}
		*/
		
		System.out.println("Enter the number for searching day.");
		int inp = sc.nextInt();
		
		try {
			
					System.out.print("The day with respect to your input : "+weekdays[inp-1]);
			
		} catch(ArrayIndexOutOfBoundsException exp) {
			
			System.out.println("Please provide the correct input between 1 to 7.");
		}
	}

}
