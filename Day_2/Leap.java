import java.util.*;

public class Leap{

	static public void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		boolean leap = false;
		System.out.println("Enter the value of year.");
		int y = sc.nextInt();

		if(y % 4 == 0) {

			if(y % 100 == 0) {

				if(y % 400 == 0) {

					leap = true;		
		
				}
		
			}
			
			leap = true;			

		}
		else {

		
		leap = false;


		}

		if(leap == true) {

			System.out.println("The given value of year is leap year.");			

		}
		else {

			System.out.println("The given value of year is not leap year.");

		}

	}

}