package vector_Ex_Programs;

import java.util.ListIterator;
import java.util.Vector;

public class Vector_Program1 {

	public static void main(String[] args) {
		 Vector<Integer> vs = new Vector<Integer>();
	     int n[]= {10,20,30,40,50,11,21,60,50,100};
	     
	     for (int i = 0; i < n.length; i++) 
			vs.add(n[i]);
		System.out.println("Vector Element");
		
	    ListIterator lit = vs.listIterator(); 
	    
	    System.out.println("Forword Direction");
	    while (lit.hasNext()) 
		System.out.println( lit.next());
	    
		System.out.println("Backword Direction");
		while (lit.hasPrevious()) 
		System.out.println( lit.previous());


	}

}
