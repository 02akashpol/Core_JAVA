package collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class CollectionDemo4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> col = new ArrayList<Integer>();
		
		col.add(23);
		col.add(3);
		col.add(453);
		col.add(21);
		col.add(0);
		
		Stream<Integer> strm = col.stream();
		
		Optional<Integer> opt = strm.max(Comparator.comparing(ele -> ele));
		int res = opt.get();
		System.out.println(res);
	}

}
