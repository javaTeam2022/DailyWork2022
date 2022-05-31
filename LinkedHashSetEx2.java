package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx2 {
public static void main(String[] args) {
	
	LinkedHashSet lhs = new LinkedHashSet();
	lhs.add("Venu");
	lhs.add("Kalyan");
	lhs.add(88);
	lhs.add("Venu");
	lhs.add("Ganesh");
	lhs.add(99);
	lhs.add(23);
//	System.out.println(lhs);
	Iterator<Integer> it= lhs.iterator();
	System.out.println("Elements using iterator");
	while (it.hasNext()) {
		System.out.println(it.next()); 
	}
}
}
