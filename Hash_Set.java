package set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("Ganesh");
		hashSet.add("Venumadhav");
		hashSet.add("Navya");
		hashSet.add("Kalyan");
		Iterator itr = hashSet.iterator();
		while (itr.hasNext()) {
			System.out.println(" " + itr.next());

		}
		System.out.println(hashSet);
		hashSet.remove("Kalyan");
		System.out.println(hashSet);
		System.out.println(hashSet.contains("Navya"));
		System.out.println(hashSet);

	}

}
