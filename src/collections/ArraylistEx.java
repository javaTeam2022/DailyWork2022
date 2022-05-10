package collections;

import java.util.ArrayList;

public class ArraylistEx {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(53);
		al.add("hello");
		al.add(56.12f);
		al.add(true);
		al.add(15689.2);
		al.add("Navya");
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		al1.add(21);
		al1.add("Java");
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		al.equals(al1);
		System.out.println(al);
		al.addAll(al1);
		System.out.println(al);
		al.hashCode();
		System.out.println(al);
		al.add(4, 53);
		System.out.println(al);
		System.out.println(al.get(3));
		
		
	}

}
