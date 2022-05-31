package CollectionFrameWork;
import java.util.Iterator;
import java.util.LinkedHashSet;
// it maintains insertion order, in which order we insert,
// in the same order only elements can be stored.
public class LinkedHashSetEx {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet();
		lhs.add(255);
		lhs.add(789);
		lhs.add(1254);
		lhs.add(77);
		lhs.add(2);
		lhs.add(488);
		lhs.add(null);
		lhs.add(77);//can't be store duplicate values.
		
		// iterating the element using iterater class
		for(Integer i:lhs) {
			System.out.println(i);
		}
		
		Iterator<Integer> it= lhs.iterator();
		System.out.println("Elements using iterator");
		while (it.hasNext()) {
			System.out.println(it.next()); 
		}
	}
}
