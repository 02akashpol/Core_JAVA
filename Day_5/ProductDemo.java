import java.util.*;

class Product{
	
	private double pid;
	private double price;
	private double quantity;
	
	Product(double pid, double price, double quantity){
		
		this.pid = pid;
		this.price = price;
		this.quantity = quantity;
	}
	
	static double totalAmtSpent(double arr[][]) {
		
		double allProAmt = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			double singleProAmt = (arr[i][1] * arr[i][2]);
			allProAmt = allProAmt + singleProAmt;
		}
		
		return allProAmt;
	}
}

public class ProductDemo{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of products.");
		int size = sc.nextInt();
		
		double arr[][] = new double[size][3];
		
		int pid = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				
				if(j==0) {
					
					arr[i][j] = pid;
					pid++;
				}
				
				if(j==1) {
					
					System.out.println("Enter the price of "+(i+1)+" product : ");
					arr[i][j] = sc.nextDouble();
				}
				
				if(j==2) {
					
					System.out.println("Enter the quantity of "+(i+1)+" product : ");
					arr[i][j] = sc.nextDouble();
				}
				
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			
			Product obj = new Product(arr[i][0], arr[i][1], arr[i][2]);
		}

		System.out.println("============================================");

		for(double arr1[]: arr) {
			
			for(double trav : arr1) {
				
				System.out.print(" "+trav);
			}
			
			System.out.println(" ");
		}
		 
		System.out.println("============================================");
				
		double highest = 0;
		double hPid = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(i==0) {
				
				highest = arr[i][1];
				hPid = arr[i][i];
			}
				
			if(highest<arr[i][1]) {
			
				highest = arr[i][1];
				hPid = arr[i][0];
			}
		}
		
		System.out.println("The pid of highest price and price of product among all products - pid : "+hPid+" price : "+highest);

		System.out.println("============================================");

		double res = Product.totalAmtSpent(arr);
		System.out.println("The total amount spent on all products is : "+res);
		
		System.out.println("============================================");
	}
}