package TreeSet;

import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		TreeSet<Integer> in = new TreeSet<Integer>();
		in.add(123);
		in.add(456);
		in.add(789);
		in.add(369);
		in.add(99);
		System.out.println(in);
	
		System.out.println(in.ceiling(124));
		System.out.println(in.floor(457));
		System.out.println(in.lower(789));
		System.out.println(in.higher(123));
		System.out.println(in.first());
	
		System.out.println(in.pollFirst());
		System.out.println(in.pollLast());
	}

}
