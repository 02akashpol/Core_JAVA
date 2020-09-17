import java.util.*;

public class MaleFemale{

	static public void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the gender like m for male and f for female.");
		char gen = sc.next().charAt(0);

		System.out.println("Enter the age of that person.");
		int age = sc.nextInt();

		if (gen == 'm' && age > 0) {

			if (age >= 21) {

				System.out.println("This person is eligible for marraige.");
			
			}
			else{

				System.out.println("This person is not eligible for marraige.");
			}

		}
		else if (gen == 'f' && age > 0) {

			if (age >= 18) {

				System.out.println("This person is eligible for marraige.");
			
			}
			else{

				System.out.println("This person is not eligible for marraige.");
			}

		}
		else {

			System.out.println("Please provide the valid inputs.");

		} 
	}

}