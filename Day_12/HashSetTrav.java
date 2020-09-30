package collection;

import java.util.Collection;
import java.util.HashSet;

public class HashSetTrav {

	public static void main(String[] args) {
		
		Collection col1 = new HashSet();
		
		col1.add("Akash Pol");
		col1.add(23);
		col1.add("CDAC Mumbai");
		col1.add("Akash Pol");   // this will skip by doing hashing 
		
		System.out.println(col1);
	}

}
