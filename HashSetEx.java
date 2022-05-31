package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String args[]) {
		HashSet<String> set = new HashSet();
		set.add("one");
		set.add("two");
		set.add("Three");
		set.add("four");
		set.add("Five");
		Iterator<String> i=set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
		
	}

}
