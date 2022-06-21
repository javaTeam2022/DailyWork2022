package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethodsEx1 {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(459, "kalyan");
		hm.put(457, "venu");
		hm.put(450, "navya");
		hm.put(452, "ganesh");
		hm.put(456, "sai");
		System.out.println(hm);
		System.out.println( hm.isEmpty());
		System.out.println(hm.entrySet());
		System.out.println("PutIfAbsent(): "+hm.putIfAbsent(451, "vinay"));//it will insert the element and key if it is not there.
		for (Map.Entry<Integer , String> me : hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
		hm.remove(451);
		System.out.println("After remove(): ");
		for (Map.Entry<Integer , String> me : hm.entrySet()) {
			System.out.println(me.getKey()+" "+me.getValue());
		}
//		hm.replaceAll((k,v) ->"seera");
//		System.out.println("After replaceAll() :");
//		for (Map.Entry<Integer , String> me : hm.entrySet()) {
//			System.out.println(me.getKey()+" "+me.getValue());
//		}
		System.out.println("get(): "+hm.get(459));
		System.out.println("size(): "+hm.size());
		System.out.println("Keyset(): "+hm.keySet());
		System.out.println("value(): "+hm.values());
		Set<Integer> keys =hm.keySet();
		System.out.println("keySet(): "+keys);
		
		
	}
}