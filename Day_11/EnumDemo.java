package ExceptionHandling;

enum Months {
	
	JAN, FEB, MARCH, APR, MAY, JUNE, JUL, AUG, SEPT, OCT, NOV, DEC;
}

public class EnumDemo {

	public static void main(String[] args) {
		
		Months m1 = Months.NOV;
		
		System.out.println("The given month for m1 ref var is : "+m1);
		
		System.out.println("---------------------------------------");
		
		for(Months trav : Months.values()) {
			
			System.out.println(trav);
		}
	}

}
