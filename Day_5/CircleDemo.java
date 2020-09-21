import java.util.*;

class Circle{
	
	private double rad;
	private double area;
	
	void init(double rad) {
		
		this.rad = rad;
		//calculateArea(this.rad);
	}
	
	double calculateArea(double rad) {
		
		return (3.14 * rad * rad);
	}
	
	void display() {
		
		double res = calculateArea(this.rad);
		System.out.println("Area of circle for given radius is : "+res);
	}
} 

public class CircleDemo{
	
	public static void main(String[] args) {
		
		Circle obj1 = new Circle();
		
		obj1.init(20.25);
		obj1.display();
	}
}