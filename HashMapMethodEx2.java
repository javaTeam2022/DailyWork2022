package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapMethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hashm = new HashMap<String, Integer>();
		hashm.put("key1",100);
		hashm.put("key2",50);
		hashm.put("key3",44);
		hashm.put("key4",78);
		hashm.put("key5",92);

		System.out.println("Compute(): ");
		hashm.compute("key1", (key, val) -> (key == null) ? 1 : val+10);
		for (Map.Entry<String , Integer> entry : hashm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
