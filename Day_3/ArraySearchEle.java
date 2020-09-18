import java.util.*;

public class ArraySearchEle{

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the elements for array.");
		int arr[] = new int[5];
		
		for(int i=0; i<arr.length; i++) {

			System.out.println("Enter the value of "+(i+1)+" element : ");
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter the index for element searching : ");
		int inp = sc.nextInt(); 

		System.out.println("The value of given index number : "+arr[inp]);						
	
	}
}