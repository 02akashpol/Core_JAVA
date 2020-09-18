import java.util.*;

public class ArrayEleSum{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements for array.");
		int arr[] = new int[5];		

		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}

		int evenSum = 0;
		int oddSum = 0;

		for(int i=0; i<arr.length; i++) {

			if(arr[i] % 2 == 0) {

				int temp = arr[i];
				evenSum = evenSum + temp;
			}
			else {

				int temp = arr[i];
				oddSum = oddSum + temp;				
			}
		}

		System.out.println("The sum of even elements is : "+evenSum);
		System.out.println("The sum of odd elements is : "+oddSum);
	
	}
}