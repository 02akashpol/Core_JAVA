import java.util.*;

public class StringArray{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String strArray[] = new String[] {"A", "B", "C", "D", "E"};

		System.out.println("Elements of string type array : ");

		for(String trav : strArray) {

			System.out.print(" "+trav);
		}
	}
}