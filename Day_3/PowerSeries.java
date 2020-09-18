import java.util.*;

public class PowerSeries{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for power series : ");
		long inp = sc.nextLong();
		long res = 0;
		System.out.println("The power series for given number.");
		
		for(int i=1; i<=inp; i++) {

			res = i * i;
			System.out.println(res); 
		}
	}
}