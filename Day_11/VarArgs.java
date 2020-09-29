package ExceptionHandling;

public class VarArgs {

	public static void main(String[] args) {
		
		display();
		display(10);
		display(10, 10, 40, 8000);
		int arr[] = {30, 47, 739, 30};
		display(arr);
		//display(arr, 10); // error we can pass only type of multiple elements 
	}
	
	static void display(int... args) {
		
		for(int trav : args) {
			
			System.out.print(" "+trav);
		}
		System.out.println(" ");
	}

}
