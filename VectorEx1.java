package Vectors;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add("hello");
		v.add("hi");
		v.add("navya");
		v.add("kalyan");
		v.add("venu");
		v.addElement("ganesh");
		System.out.println(v);
	    System.out.println("Tiger is present at the index " +v.indexOf("hello"));  
	    System.out.println(v.size());  
	    System.out.println(v.capacity());
	
		v.addElement("200");
		v.addElement("500");
		System.out.println(v);
		System.out.println(v.remove(4));
		System.out.println(v);
		v.removeElementAt(5);
		System.out.println(v);
		System.out.println(v.hashCode());
		System.out.println(v.get(1));
	}

}
