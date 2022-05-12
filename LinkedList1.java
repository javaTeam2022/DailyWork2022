package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		LinkedList<String> ll1 = new LinkedList<String>();
		ll.add("Navya");
		ll.add("Srinivasrao");
		ll.add("Anitha");
		ll.add("Saikumar");
		System.out.println(ll);
		ll1.add("JAva");
		ll1.add(".Net");
		ll1.add("SalesForce");
		ll1.add("Html");
		System.out.println(ll1);
		ll.addAll(2, ll1);
		System.out.println(ll);
		ll.add(0, "Hello");
		System.out.println(ll);
		ll.removeAll(ll1);
		System.out.println(ll);
		Iterator<String> itr =  ll1.iterator();
		while(itr.hasNext());
		System.out.println(" "+itr.next());
		
	}


}
