import java.util.*;

public class PrimeBtwn{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the range for finding the primw numbers.");
		long start = sc.nextLong();
		long end = sc.nextLong();
		boolean flag = false;
		//System.out.println(start);
		//System.out.println(end);

		System.out.println("Prime numbers between given range : ");
		for(long i=start+1; i<end; i++) {

			if(i == 0 || i == 1) {

				continue;
			}

			flag = false;

			for(long j=2; j<=i/2; j++) {

				if(i % j == 0) {

					flag = true;
					break;
				}
			}

			if(flag == false) {

				System.out.println(i);
			}
		}
	}
}