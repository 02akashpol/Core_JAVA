import java.util.*;

public class ArraySortDesc{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements of array : ");
		int arr[] = new int[10];

		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the "+(i+1)+" element of array : ");
			arr[i] = sc.nextInt();			
		}

		for(int i=0; i<=arr.length; i++) {

			for(int j=i+1; j<arr.length; j++) {

				if(arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
						
		}

		System.out.println("Values after sorting in descending order.");
		
		for(int trav : arr) {

			System.out.println(trav);
		}
	}
}