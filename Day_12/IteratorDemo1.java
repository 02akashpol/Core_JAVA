package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo1 {

	public static void main(String[] args) {

		//LinkedList col1 = new LinkedList();
		Collection col1 = new LinkedList();
		
		col1.add("Akash Pol");
		col1.add(23);
		col1.add("CDAC Mumbai");
		
		Iterator itr = col1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.print(" "+itr.next());
			itr.remove();
		}
		//System.out.println(" ");
	}

}
