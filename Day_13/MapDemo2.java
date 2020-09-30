package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer, Object> map1 = new LinkedHashMap<Integer, Object>();
		
		map1.put(1, "Akash Pol");
		map1.put(2, 40);
		map1.put(3, "CDAC");
		map1.put(4, 40.69);
		map1.put(5, 50);
		
		Collection<Object> val = map1.values();
		val.forEach(ele -> System.out.println(ele));
		
		System.out.println("---------------------------------------");
		
		Set<Integer> key = map1.keySet();
		Iterator<Integer> itr = key.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
	}

}
