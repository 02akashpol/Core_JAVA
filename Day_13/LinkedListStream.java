package collection;

import java.util.LinkedList;
import java.util.stream.Stream;

public class LinkedListStream {

	public static void main(String[] args) {
		
		LinkedList lcol = new LinkedList();
		
		lcol.add(12);
		lcol.addFirst("CDAC");
		lcol.add(1, "Akash Pol");
		lcol.addLast("DAC");
		lcol.add(40.477);
		
		Stream strm = lcol.stream();
		
		strm.forEach(ele -> System.out.println(ele));
	}

}
