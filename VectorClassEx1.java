package vector;

import java.util.Vector;

public class VectorClassEx1 {
public static void main(String[] args) {
	Vector<String> vc = new Vector<String>(); 
	vc.add("kalyan");
	vc.add("venu");
	vc.add("ganesh");
	vc.add("navya");
	vc.add("ranjeeth");
	vc.add("sai");
	System.out.println(vc);
	System.out.println(vc.size());
	vc.add(4,"neelima");
	vc.add(5,"susmitha");
	System.out.println(vc);
	vc.addElement("ahemmed");
	System.out.println(vc);
	System.out.println(vc.capacity());
	System.out.println(vc.contains("venu"));
	System.out.println(vc.elementAt(5));
	System.out.println(vc.equals("sai"));
	System.out.println(vc.firstElement());
	System.out.println(vc.get(4));
	System.out.println(vc.hashCode());
	System.out.println(vc.indexOf("sai"));
	System.out.println(vc.indexOf("navya", 3));
	vc.insertElementAt("java", 0);
	System.out.println(vc);
	System.out.println(vc.isEmpty());
	System.out.println(vc.lastElement());
	System.out.println(vc.lastIndexOf(vc));
	System.out.println(vc.remove(9));
	System.out.println(vc);
	System.out.println(vc.remove("sai"));
	System.out.println(vc);
	System.out.println(vc.removeElement("neelima"));
	System.out.println(vc);
	vc.set(5, "sai");
	System.out.println(vc);
	vc.setElementAt("neelima",6);
	System.out.println(vc);
	
}
}