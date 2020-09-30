package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, Object> map = new TreeMap<Integer, Object>();
		
		map.put(1, 19);
		map.put(2, 1);
		map.put(3, 39);
		map.put(4, 70);
		map.put(5, 2);
		map.put(1, 1);
		
		Set<Entry<Integer, Object>> set = map.entrySet();
		
		Iterator<Entry<Integer, Object>> itr = set.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		System.out.println("-------------------------------------");
		
		for(Entry<Integer, Object> trav : set) {
			
			System.out.println(trav);
		}
		
		System.out.println("--------------------------------------");
		
		//Set<Entry<Integer, Object>> set1 = map.entrySet();
		
		Collection<Object> col = map.values();
		Iterator<Object> itr1 = col.iterator();
		while(itr1.hasNext()) {
			
			System.out.println(itr1.next());
		}
	}

}
