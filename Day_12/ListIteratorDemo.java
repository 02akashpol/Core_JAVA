package collection;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List col1 = new LinkedList();
		
		col1.add("Akash Pol");
		col1.add("CDAC Mumbai");
		
		ListIterator litr = col1.listIterator();
		
		while(litr.hasNext()) {
			
			System.out.println(" "+litr.next());
		}
		
		System.out.println("----------------------------------------");
		
		while(litr.hasPrevious()) {
			
			System.out.println(" "+litr.previous());
		}
		
		System.out.println("----------------------------------------");
		
		for(int i=0; i<col1.size(); i++) {
			
			System.out.println(col1.get(i));
		}
	}

}
