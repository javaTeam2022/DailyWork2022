package LinkedList;

import java.util.LinkedList;

public class LinkedList3 {
	public static void main(String[] args) {
		LinkedList<LinkedList2> ll = new LinkedList<LinkedList2>();
		LinkedList2 obj1 = new LinkedList2(1,"navya",24,"java");
		LinkedList2 obj2 = new LinkedList2(2,"venu",25,"java");
		LinkedList2 obj3 = new LinkedList2(3,"ganesh",22,"java");
		LinkedList2 obj4 = new LinkedList2(4,"kalyan",24,"java");
		ll.add(obj1);
		ll.add(obj2);
		ll.add(obj3);
		ll.add(obj4);
		System.out.println(ll);
	}

}
