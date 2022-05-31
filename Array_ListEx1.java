package list_Interface;

import java.util.ArrayList;

public class Array_ListEx1 {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();

		ar.add("ID No ");
		ar.add("Emply AcNo");
		ar.add("Emp AdhNo");
		ar.add("Deposite amt");

		System.out.println(ar);

		ArrayList<Integer> ai = new ArrayList<Integer>();

		ai.add(454);
		ai.add(1236544564);
		ai.add(77081239);
		ai.add(500000);
		System.out.println(ai);

		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		// add the get().
		System.out.println(al.get(0) + al.get(2) + al.get(1));
		System.out.println(al);
	}

}
