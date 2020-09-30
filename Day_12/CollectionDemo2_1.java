package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionDemo2_1 {

	public static void main(String[] args) {
		
		Collection col1 = new LinkedList();
		//Collection col2 = new LinkedList();
		
		col1.add("PG-DAC Student");
		col1.add(9);
		col1.add("Feb 20");
		
		Collection col2 = new LinkedList();
		
		col2.add("Akash Pol");
		col2.add(23);
		col2.add("Satara");
		
		System.out.println(col1);
		System.out.println(col2);
		
		col1.addAll(col2);
		System.out.println(col2.contains(col1));
		System.out.println(col1);
		col2.clear();
		System.out.println(col2);
		
		
	}

}
