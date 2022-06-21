package map;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapforEach {
	// Java program to demonstrate
	// forEach(BiConsumer) method.
	public static void main(String[] args) {

		// create a HashMap and add some values
		Map<String, Integer> map = new HashMap<>();

		map.put("geeks", 55);
		map.put("for", 13);
		map.put("geeks", 22);
		map.put("is", 11);
		map.put("heaven", 90);
		map.put("for", 100);
		map.put("geekies like us", 96);

		// creating a custom action
		BiConsumer<String, Integer> action = new MyBiConsumer();

		// calling forEach method
		map.forEach(action);
	}
}

// Defining Our Action in MyBiConsumer class
class MyBiConsumer implements BiConsumer<String, Integer> {

	public void accept(String k, Integer v) {
		System.out.print("Key = " + k);
		System.out.print("\t Value = " + v);
		System.out.println();

	}

}
