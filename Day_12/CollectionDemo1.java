package collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo1 {

	public static void main(String[] args) {
		
		Collection cole = new ArrayList();
		
		cole.add("Akash Pol");
		cole.add(9);
		cole.add("Satara");
		
		System.out.println(cole);
		
		cole.remove(9);
		
		System.out.println(cole);
	}

}
