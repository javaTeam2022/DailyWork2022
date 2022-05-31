package vector;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorClassEx3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int a=0;
//		LinkedList<String> ll= new LinkedList<String>();
//		ll.add("kalyan");
//		ll.add("venu");
//		ll.add("ganesh");
//		ll.add("navya");
//		ll.add("ranjeeth");
//		ll.add("sai");
//		ll.add("neelima");
//		ll.add("susmitha");
		Vector<UserInput> vs = new Vector<UserInput>();
		
		for (int i=0; i<5;i++) {
			System.out.println("Enter user "+i+" Name:");
			s=sc.next();
			UserInput ui = new UserInput(s);
			vs.add(ui);
		}
		
		System.out.println(vs);
		ListIterator<UserInput> lis = vs.listIterator();
		
		while (lis.hasNext()) {
			System.out.println(a);
			System.out.print(lis.next());
			a++;
		}
	}
}