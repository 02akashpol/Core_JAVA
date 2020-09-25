import java.util.*;

interface LogicClass{
	
	boolean test(int num);
}

class OpeClass{
	
	static void calculate(int arr[], LogicClass ref) {
		
		for(int trav : arr) {
			
			if(ref.test(trav)) {
				
				System.out.print(" "+trav);
			}
		}
		System.out.println(" ");
	}
}

public class FunProgrm1{
	
	public static void main(String args[]) {
		
		int arr[] = {1,2,3,4,5};
		
		OpeClass.calculate(arr, (int n) -> {return true;});
		OpeClass.calculate(arr, (n) -> {return n%2 == 0;});
		OpeClass.calculate(arr, n -> n%2 !=0);
	}
} 