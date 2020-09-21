import java.util.*;

class ThisDemo{
	
	private String input;
	
	void setRecord(String input) {
		
		this.input = input;
	}
	
	void showRecord() {
		
		System.out.println(input);
	}
}

public class ThisKey{
	
	public static void main(String[] args) {
		
		ThisDemo demo = new ThisDemo();
	
		demo.setRecord("We are giving input using this keyword.");
		demo.showRecord();
	}
	
}