import java.util.*;

class Demo{
	
	void m1() {
		
		class InnerClass{
			
			void m2() {
				
				System.out.println("Calling m2() via m1() on Demo class obj.");
			}
		}
		
		InnerClass obj1 = new InnerClass();
		obj1.m2();
	}
}

public class FunIntrfLocal{
	
	public static void main(String args[]) {
		
		Demo obj2 = new Demo();
		obj2.m1();
	}
} 