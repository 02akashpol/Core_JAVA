package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Map<String, Object> map1 = new HashMap<String, Object>();
		
		map1.put("Key1", "Akash Pol");
		map1.put("Key1", "Akash");
		map1.put("Key2", "Pol");
		map1.put("Key3", 20);
		map1.put("Key4", 40.46567);
		
		System.out.println(map1.get("Key1"));
		System.out.println(map1);
	}

}
