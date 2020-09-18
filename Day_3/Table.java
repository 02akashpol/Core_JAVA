import java.util.*;

public class Table{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number for printing the table: ");
		int inp = sc.nextInt();

		for(int i=1; i<=10; i++) {

			int res = inp * i;
			System.out.println(inp+" x "+i+" = "+res);		
		}
	

	}

}