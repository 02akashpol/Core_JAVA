package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {

	public static void main(String[] args) {
		
		Collection col1 = new ArrayList();
		
		col1.add("PG-DAC Student");
		col1.add(9);
		col1.add("Feb 20");
		
		Collection col2 = new ArrayList();
		
		col2.add("Akash Pol");
		col2.add(23);
		col2.add("Satara");
		
		System.out.println(col1);
		System.out.println(col2);
		
		col1.addAll(col2);
		System.out.println(col1);
		
		col2.removeAll(col1);
		System.out.println(col2);
	}

}
