import java.util.*;

class Demo{
	
	static class InnerClass{
		
		void m1() {
			
			System.out.println("Calling m1() from inner class.");
		}
	}
}

public class FunInterfaceStatic{
	
	public static void main(String args[]) {
		
		//Demo.InnerClass.m1(); error m1() is not static
		Demo.InnerClass obj = new Demo.InnerClass();
		obj.m1();
	}
}