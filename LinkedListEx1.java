package linkedList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEx1 {
	private static final int Comparator = 0;

	public static void main(String[] args) {
		LinkedList<String> linkl1 = new LinkedList<String>();
		LinkedList<String> linkl2 = new LinkedList<String>();

		linkl1.add("audi");
		linkl1.add("benz");
		linkl1.add("skoda");
		linkl1.add("suzuki");
		linkl1.add("porch");
		linkl1.add("honda");
		System.out.println(linkl1);
		linkl2.add("Dell");
		linkl2.add("hp");
		linkl2.add("asus");
		linkl2.add("Samsung");
		linkl2.add("Apple");
		linkl2.add("lenovo");
		System.out.println(linkl2);
		linkl1.addAll(linkl2);
		System.out.println(linkl1);
		System.out.println(linkl1.containsAll(linkl2));
		Iterator its = linkl1.descendingIterator();
		while (its.hasNext()) {
			System.out.println(its.next());
		}
		System.out.println("element() Method: "+linkl1.element());//last element of the LinkedList.
		System.out.println(linkl1.indexOf("lenovo "));
		linkl1.isEmpty();
		linkl1.remove("Apple");
		System.out.println(linkl1);
		}
}