package vector;

import java.util.ListIterator;
import java.util.Vector;

public class VectorClassEx2 {

	public static void main(String[] args) {
		int a[] = { 12, 23, 34, 56, 54, 78, 27, 78, 91, 36, 49, 83 };
		Vector<Integer> vec = new Vector<Integer>();
		for (int i = 0; i < a.length; i++) {
			vec.add(a[i]);
		}
		System.out.println(vec);
		ListIterator<Integer> lit = vec.listIterator();
		System.out.println("ForWord Direction ListIterator:");
		while (lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("Back Word Direction ListIterator:");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}
}