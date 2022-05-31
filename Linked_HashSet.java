package set_Interface;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linked_HashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.add(106);
		ls.add(102);
		ls.add(101);
		ls.add(108);
		ls.add(100);
		ls.add(100);
		ls.add(105);
		System.out.println("LinkedHashSet :"+ls);
		
        Iterator<Integer> it = ls.iterator();
        while (it.hasNext()) {
		    System.out.println(it.next()); 
			
		}
	}

}
