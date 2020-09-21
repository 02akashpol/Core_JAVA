import java.util.*;

class OneBHK{
	
	private double roomArea;
	private double hallArea;
	private double price;
	
	OneBHK(){
		
		this(130.256, 160.456, 25000);
	}
	
	OneBHK(double roomArea, double hallArea, double price){
		
		this.roomArea = roomArea;
		this.hallArea = hallArea;
		this.price = price;
	}
	
	void showRecord() {
		
		System.out.println("The area of room in sqft : "+roomArea);
		System.out.println("The area of hall in sqft : "+hallArea);
		System.out.println("The price of 1BHK flat : "+price);
	} 
}

class TwoBHK extends OneBHK{
	
	private double room2Area;
	
	TwoBHK(){
		
		this(140.256, 170.456, 40000, 140.256);
	}
	
	TwoBHK(double roomArea, double hallArea, double price, double room2Area){
		
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}
	
	void showRecord() {
		
		System.out.println("The area of room2 in sqft : "+room2Area);
		super.showRecord();	
	} 
}

class Demo extends TwoBHK{
	
	Demo() {
		
		this(150.326, 180.235, 50000, 150.326);
	}
	
	Demo(double roomArea, double hallArea, double price, double room2Area) {
		
		super(roomArea, hallArea, price, room2Area);
	}
	
	void showRecord() {
	
		super.showRecord();
	}
}

public class FlatDemo{
	
	public static void main(String args[]) {
		
		OneBHK obj1 = new OneBHK();
		System.out.println("-----------------------------");
		System.out.println("The details of 1BHK flat : ");
		obj1.showRecord();
		
		OneBHK obj2 = new OneBHK(131.253, 161.235, 26000);
		System.out.println("-----------------------------");
		System.out.println("The details of 1BHK flat : ");
		obj2.showRecord();
		
		TwoBHK obj3 = new TwoBHK();
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat : ");
		obj3.showRecord();
		
		TwoBHK obj4 = new TwoBHK(141.233, 171.233, 41000, 141.326);
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat : ");
		obj4.showRecord();
	}
}

class DemoMain{
	
	static public void main(String args[]) {
		
		Demo obj5 = new Demo();
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat from Demo class : ");
		obj5.showRecord();
		
		Demo obj6 = new Demo(151.236, 181.235, 51000, 151.235);
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat from Demo class : ");
		obj6.showRecord();
		
		Demo obj7 = new Demo(152.236, 182235, 52000, 152.235);
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat from Demo class : ");
		obj7.showRecord();
		
		Demo obj8 = new Demo(153.236, 183.235, 5300, 153.235);
		System.out.println("-----------------------------");
		System.out.println("The details of 2BHK flat from Demo class : ");
		obj8.showRecord();
	}
}