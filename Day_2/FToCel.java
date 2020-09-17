import java.util.Scanner;

public class FToCel{

	static public void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please give the input for conversion : ");
		
		double inp = sc.nextDouble();

		double res = 5 * (inp - 32) / 9;

		System.out.println("The value of given input in celcius is : "+res); 		

	}

}