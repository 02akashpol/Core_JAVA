import java.util.*;

public class InputEmp{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		boolean flag = false;
		System.out.println("Enter the value of basic salary.");
		int inp = sc.nextInt();
		int HRA = 0;
		double DA = 0;		

		if (inp == 10000 || inp > 10000) {

			HRA = 2000;
			DA = 98/100 * (inp);
			flag = true;
		
		}
		else if (inp < 10000 && inp > 0) {

			HRA = 10/100 * (inp);
			DA = 90/100 * (inp);
			flag = true;

		}
		else {

			System.out.println("Please provide the correct inputs.");	

		}
		
		if (flag == true) {

			double GS = inp + HRA + DA;
			System.out.println("The gross salary is : "+GS);

		}
	}

}