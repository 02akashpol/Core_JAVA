import java.util.*;

public class ArrayEleAvg{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[10];
		System.out.println("Enter the elements for array : ");
		int sum = 0;	
		int avg = 0;

		for(int i=0; i<arr.length; i++) {
			
			System.out.println("Enter the "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}
		
		/*
		for(int trav : arr) {

			System.out.println(trav);
		}
		*/

		for(int i=0; i<arr.length; i++) {

			sum = sum + arr[i];
		}

		avg = sum / arr.length;
		System.out.println("Average of array's elements is : "+avg);
	}
}