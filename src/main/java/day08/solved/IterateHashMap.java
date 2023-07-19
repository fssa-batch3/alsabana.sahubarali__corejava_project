package day08.solved;

import java.util.*;

class IterateHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Chennai", 2);
		map.put("Bangalore", 1);
		map.put("Mumbai", 2);
		map.put("Hyderabad", 1);

		// Method 1: Foreach
		System.out.println("for each method");
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			System.out.println(key + " = " + map.get(key));
		}

		// Method 2: Iterator
		System.out.println("using iterator");
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key + " = " + map.get(key));
		}

		// Method 3: Lambda expression
		System.out.println("using lambda expression");
		map.forEach((key, value) -> System.out.println(key + " = " + value));

		// Method 4 : using map entry
		System.out.println("map entry");
		for (Map.Entry entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
