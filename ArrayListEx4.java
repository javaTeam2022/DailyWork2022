package arrayList;
import java.util.Scanner;
import java.util.LinkedList;
public class ArrayListEx4 {
	public static void main(String[] args) {
		LinkedList<String> ll1= new LinkedList();
		LinkedList<String> ll2 = new LinkedList();
		ll1.add("kalyan");
		ll1.add("venu");
		ll1.add("navya");
		ll1.add("ganesh");
		ll1.add("ranjeeth");
		ll1.add("sai");
		System.out.println(ll1);
		ll2.add("kgf");
		ll2.add("major");
		ll2.add("svp");
		ll2.add("project k");
		ll2.add("kgf2");
		ll2.add("RRR");
		System.out.println(ll2);
		ll1.addAll(ll2);
		System.out.println(ll1);


	}

}
