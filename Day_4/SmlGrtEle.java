import java.util.*;

public class SmlGrtEle{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows for 2-D array : ");
		int row = sc.nextInt();
		int arr[][] = new int[row][];	

		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of columns for "+(i+1)+" 1-D array : ");
			int col = sc.nextInt();
			arr[i] = new int[col];

			for(int j=0; j<arr[i].length; j++) {

				System.out.println("Enter the "+(j+1)+" element of 1-D array : ");
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Printing the all elements from 2-D array : ");

		for(int arr1[] : arr) {

			for(int trav : arr1 ) {

				System.out.print(" "+trav);
			}

			System.out.println(" ");
		}

		int min = 0;
		int max = 0;
		boolean flag = true;

		for(int i=0; i<arr.length; i++) {

			for(int j=0; j<arr[i].length; j++) {

				if(flag == true) {

					min = arr[i][j];
					max = arr[i][j];
				}


				if(min > arr[i][j])
					min = arr[i][j];

				if(max < arr[i][j])
					max = arr[i][j];

				flag = false;				
			}
		}

		System.out.println("The min element from given array is : "+min);
		System.out.println("The max element from given array is : "+max);	
	}
}