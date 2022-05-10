package collections;
import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		// type unsafe
		ArrayList al = new ArrayList();
		al.add("Navya");
		al.add("Geeta");
		al.add("Ganesh");
		al.add("Vinay");
		al.add("Kalyan");
		al.add("Venu");
		//al.add(12);
		
		//type safe
		ArrayList<String> al2 = new ArrayList<String>();
		
		al2.add("Navya");
		al2.add("Geeta");
		al2.add("Ganesh");
		al2.add("Vinay");
		al2.add("Kalyan");
		al2.add("Venu");
		//al2.addAll(al);
		System.out.println(al2);
		
		al2.remove("Geeta");// based on object
		al2.remove(3);// based on index
		System.out.println("after removal "+al2);
		al2.removeAll(al2);
		System.out.println(al2.isEmpty());
		System.out.println("removal all"+al2);
		al2.addAll(al);
		al2.add(1, "Ahemmed");
		System.out.println("add by index"+al2);
		
		al2.set(2, "Kedar");
		System.out.println("add by index"+al2);
		
		System.out.println(al2.isEmpty());// Checking whether the list is empty
		
		System.out.println(al2.contains("Ahemmed"));
		
		Iterator<String> itr = al2.iterator();
		
		while(itr.hasNext()) {
			System.out.print(" " +itr.next());
		}
	
	}

}

