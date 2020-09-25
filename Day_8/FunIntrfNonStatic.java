import java.util.*;

class Demo{

	class InnerClass{
	
		void m1() {
			
			System.out.println("Calling m1() from non static class.");
		}
	}
}

public class FunIntrfNonStatic{
	
	public static void main(String args[]) {
		
		//Demo.InnerClass obj = new Demo.InnerClass(); error InnerClass is non static.
		
		Demo obj1 = new Demo();
		Demo.InnerClass obj2 = obj1.new InnerClass();
		obj2.m1();
	}
}