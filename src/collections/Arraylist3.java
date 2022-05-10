package collections;

import java.util.ArrayList;

public class Arraylist3 {
	public static void main(String[] args) {
		//type safe
		ArrayList<String> st = new ArrayList<String>();
		st.add("Wellcome to Marolix");
		st.add("Java Team");
		System.out.println(st);
		//type unsafe
		ArrayList st1 = new ArrayList();
		st1.add("Navya");
		st1.add("Venu");
		st1.add("Kalyan");
		st1.add("Ganesh");
		st1.add("Others");
		st1.add("Ranjeeth");
		st1.add("Vinod");
		st1.add("Abdul");
		System.out.println(st1);
		System.out.println(st1.hashCode());
		//System.out.println(st1.remove("Others"));
		st1.remove("Others");
		System.out.println(st1);
		st1.addAll(st1);
		System.out.println(st1);
		
	}

}
