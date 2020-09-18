import java.util.*;

public class ArrayEleAvg1{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Enter the elements for array : ");

		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Enter the "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Elements of array : ");

		for(int trav : arr) {

			System.out.println(trav);
		}
	}
}