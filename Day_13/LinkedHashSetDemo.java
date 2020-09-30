package collection;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> col1 = new LinkedHashSet<String>();
		
		col1.add("Akash Pol");
		col1.add("Pol");
		col1.add("Akash Pol");
		col1.add("Pol Akash");
		col1.add("Akash Pol");
		
		Stream<String> strm = col1.stream();
		
		//strm.forEach(ele -> System.out.println(ele));
		
		List<String> col2 = strm.collect(Collectors.toList());
		col2.forEach(ele -> System.out.println(ele));
		
	}

}
