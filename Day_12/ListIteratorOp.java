package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorOp {

	public static void main(String[] args) {
		
		List alcol1 = new ArrayList();
		
		alcol1.add("Akash Pol");
		alcol1.add(0, "PG-DAC Student");
		alcol1.add("CDAC Mumbai");
		
		System.out.println(alcol1);
		
		System.out.println("-----------------------------------");
		
		Iterator itr = alcol1.iterator();
		
		for(Object trav : alcol1) {
			
			System.out.println(trav);
		}
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("-----------------------------------");
		
		System.out.println(alcol1);
		
		System.out.println("-----------------------------------");
		
		ListIterator litr = alcol1.listIterator();
		System.out.println("In ListItr");
		while(litr.hasNext()) {
			System.out.println("1");
			litr.add("Akash");
			//System.out.println(litr.next());
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println(alcol1);
	}

}
