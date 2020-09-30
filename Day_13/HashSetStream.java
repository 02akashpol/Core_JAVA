package collection;

import java.util.HashSet;
import java.util.stream.Stream;

public class HashSetStream {

	public static void main(String[] args) {
		
		HashSet hcol = new HashSet();
		
		hcol.add(23.4);
		hcol.add(40.45);
		hcol.add(2.565);
		hcol.add(12.55);
		
		Stream<Double> strm = hcol.stream();
		strm = strm.map( ele -> ele + 100);
		strm.forEach(ele -> System.out.println(ele));
		
		System.out.println("--------------------------------");
		
		System.out.println(hcol);
	}

}
