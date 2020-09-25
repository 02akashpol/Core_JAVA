import java.util.*;

interface MylogicClass{
	
	double test(double num1, double num2);
}

class Operation{
	
	
	static void calculate(double num1, double num2, MylogicClass ref) {
		
		double res = ref.test(num1, num2);
		System.out.println("Result : "+res);
	}
}

public class FunPrgrm2{
	
	public static void main(String args[]) {
		
		Operation.calculate(10, 20, (num1, num2) -> {return num1+num2;});
	}
}