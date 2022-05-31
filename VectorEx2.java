package CollectionFrameWork;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx2 {
 public static void main(String[] args) {
		
	 System.out.println("VENU");
		Vector <Integer> v = new Vector();
		v.add(101);
		v.add(102);
		v.add(103);
		v.add(104);
		v.add(105);
		v.add(106);
		v.add(107);
		v.add(108);
		System.out.println(v);
		
		Iterator<Integer> it = v.iterator();
		
		System.out.println("Iterating the elements");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	Vector v2 = new Vector();
	v2.add("Mobile");
	v2.add("Laptop");
	v2.add("Watch");
	v2.add("HeadPhone");
	v2.add("Shirt");
	v2.add("TV");
	
	v2.addAll(v);
	System.out.println(v2);
	System.out.println("Capacity: "+v2.capacity());
	System.out.println("ElementAt: "+v2.elementAt(5));//Returns the component at the specified index.
	v2.ensureCapacity(200);
	System.out.println("ensureCapacity: "+v2.capacity());
	System.out.println();
	
		}
		
	}
