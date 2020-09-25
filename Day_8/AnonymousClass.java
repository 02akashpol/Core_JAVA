import java.util.*;

interface Greet{
	
	void greetFun(String name);
}

public class AnonymousClass{
	
	static void setMethod(Greet ref) {
		
		ref.greetFun("Akash");
	}
	
	public static void main(String args[]) {
		
		Greet obj = new Greet() {
			
			public void greetFun(String name) {
				
				System.out.println("Welcome !!!"+name);
			}
		};
		
		AnonymousClass.setMethod(obj);
	}
}