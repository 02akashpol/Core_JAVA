package collection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Double> col = new ArrayList<Double>();
		
		col.add(2.678);
		col.add(5.678);
		col.add(50.678);
		col.add(10.678);
		col.add(0.678);
		col.add(2.0);
		
		Stream<Double> strm = col.stream();
		strm = strm.filter(ele -> ele%2 == 0);
		strm.forEach(ele -> System.out.println(ele));
		
	}

}
