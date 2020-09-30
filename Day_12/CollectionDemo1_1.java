package collection;

import java.util.LinkedList;

public class CollectionDemo1_1 {

	public static void main(String[] args) {
		
		LinkedList licol = new LinkedList();
		
		licol.add("Akash Pol");
		licol.add("CDAC Mumbai");
		System.out.println(licol);
		licol.add(1, "Satara");
		System.out.println(licol);
		licol.addFirst("PG-DAC Student");
		licol.addLast("Feb-20");
		System.out.println(licol);
	}

}
