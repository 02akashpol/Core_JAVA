package ExceptionHandling;

enum Days {
	
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(7);
	
	//MON(1), TUE, WED, THU, FRI, SAT(6), SUN(7);
	// it will show dayNo "0" for TUE, WED, THU, and FRI bcs there is no any indexing for that. 
	
	private int dayNo;
	
	Days(int dayNo) {

		this.dayNo = dayNo;
	}
	
	int getDayNo() {
		
		return dayNo;
	}
}

public class EnumDemo1 {

	public static void main(String[] args) {
		
		Days d = Days.SAT;
		
		System.out.println(d);
		System.out.println(d.getDayNo());
		
		System.out.println("----------------------------------");
		
		Days d1 = Days.TUE;
		
		System.out.println(d1);
		System.out.println(d1.getDayNo());
		
		System.out.println("----------------------------------");
		
		Days d2 = Days.THU;
		
		System.out.println(d2);
		System.out.println(d2.getDayNo());
	}

}
