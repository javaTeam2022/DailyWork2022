package map;

import java.util.HashMap;

public class HashMapComputeIfAbsent {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("key1", 10000);
		map.put("key2", 55000);
		map.put("key3", 44300);
		map.put("key4", 53200);
		map.put("key5", 13500);

		// print map details
		System.out.println("HashMap:\n " + map.toString());

		// provide value for new key which is absent
		// using computeIfAbsent method
//     it will not modify the value in the key5
		map.computeIfAbsent("key5", k -> 2000 + 33000);
		map.computeIfAbsent("key6", k -> 2000 * 34);

		// print new mapping
		System.out.println("New HashMap:\n " + map);
		

	}

}
