import java.util.*;

public class ArrayEleRev{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements for array.");
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}

		/*
		int j = arr.length-1;
		System.out.println(j);

		for(int i=0; i<arr.length; i++) {

			System.out.println("Inside rev.");
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
		*/
			
		System.out.println("After reversing element of array : ");

		for(int i=arr.length-1; i>=0; i--) {

			System.out.println(arr[i]);
		}
	
	}
}