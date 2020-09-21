import java.util.*;

class Student{
	
	//String name
	private int rollNo;
	private int age;
	private int score;
	
	Student(int rollNo, int age, int score) {
		
		this.rollNo = rollNo;
		this.age = age;
		this.score = score;
	}
}

public class StudentDemo{

		public static void main(String args[]) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Please provide the value of number of students.");
			int size = sc.nextInt();
			
			int arr[][] = new int[size][3];
			
			for(int i=0; i<arr.length; i++) {
				
				for(int j=0; j<arr[i].length; j++) {
				
					if(j==0) {
					
						System.out.println("Enter the roll number of "+(i+1)+" student : ");
						arr[i][j] = sc.nextInt();
					}
				
					if(j==1) {
					
						System.out.println("Enter the age of "+(i+1)+" student : ");
						arr[i][j] = sc.nextInt();
					}
				
					if(j==2) {
					
						System.out.println("Enter the score of "+(i+1)+" student : ");
						arr[i][j] = sc.nextInt();
					}
				
				}
			}
						
			
			for(int i=0; i<arr.length; i++) {
			
				Student obj = new Student(arr[i][0], arr[i][1], arr[i][2]);
			}
			
			System.out.println("=============================================");
			
			System.out.println("The students are from [0-50] group : ");
			
			for(int i=0; i<arr.length; i++) {
			
				if(0<=arr[i][2] && arr[i][2]<=50) {
				
					System.out.println("The details of "+(i+1)+" student - rollNo : "+arr[i][0]+" age : "+arr[i][1]+" score : "+arr[i][2]);
				}
			}
			
			System.out.println("=============================================");
			
			System.out.println("The students are from [50-65] group : ");
			
			for(int i=0; i<arr.length; i++) {
			
				if(50<arr[i][2] && arr[i][2]<=65) {
				
					System.out.println("The details of "+(i+1)+" student - rollNo : "+arr[i][0]+" age : "+arr[i][1]+" score : "+arr[i][2]);
				}
			}
			
			System.out.println("=============================================");
			
			System.out.println("The students are from [65-80] group : ");
			
			for(int i=0; i<arr.length; i++) {
			
				if(65<arr[i][2] && arr[i][2]<=80) {
				
					System.out.println("The details of "+(i+1)+" student - rollNo : "+arr[i][0]+" age : "+arr[i][1]+" score : "+arr[i][2]);
				}
			}
			
			System.out.println("=============================================");
			
			System.out.println("The students are from [80-100] group : ");
			
			for(int i=0; i<arr.length; i++) {
			
				if(80<arr[i][2] && arr[i][2]<=100) {
				
					System.out.println("The details of "+(i+1)+" student - rollNo : "+arr[i][0]+" age : "+arr[i][1]+" score : "+arr[i][2]);
				}
			}
			
			System.out.println("=============================================");
		}
}