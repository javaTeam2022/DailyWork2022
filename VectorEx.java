package CollectionFrameWork;

import java.util.ListIterator;
import java.util.Vector;

public class VectorEx {
	public static void main(String[] args) {
		
		Vector<String> vs = new Vector();
		
		String a [] = {"Hyderabad","Bangalore","Mumbai","Chennai","Kerala","Pune","Delhi","Noida"};
		
		for(int i = 0;i<a.length;i++)
			
			vs.add(a[i]);
	
		System.out.println("Vector Elements");
		
		for(int i=0;i<vs.size();i++)
			
			System.out.println(vs.get(i));
		
		System.out.println("Elements using ListIterator ");
			
		ListIterator lit = vs.listIterator();
		
		System.out.println("Forward Direction :");
		
		while (lit.hasNext()) {
			
			System.out.println(lit.next());
		}
			
	System.out.println("Backward Direction :");
		
		while (lit.hasPrevious()) {
			
			System.out.println(lit.previous());
		}
		
	}
}
