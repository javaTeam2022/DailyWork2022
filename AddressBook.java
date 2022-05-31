package linkedList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
public static void main(String[] args) {
	String type;
	String name;
	long phoneno;
	String add;
	LinkedList<AddDetails> ab = new LinkedList();
//	AddDetails adds = new AddDetails(name,phoneno,add);
	Scanner sc = new Scanner(System.in);
	while (true) {
	System.out.println("Specify the option Addrecords/Delete/Exit");
	type=sc.next();
	if (type.equalsIgnoreCase("Addrecords")) {
		for (int i = 0; i <3; i++) {
			System.out.println("Enter the name,Phoneno and Address: ");
			name=sc.next();
			phoneno=sc.nextLong();
			add=sc.next();
			sc.nextLine();
			AddDetails ads = new AddDetails(name, phoneno, add);
			
			ab.add(ads); 
			}
		Iterator<AddDetails> itads = ab.iterator();
			while (itads.hasNext()) {
				System.out.println(itads.next());	
			}
//			System.out.println(ab);
	}
// if (type.equalsIgnoreCase("Delete")) {
//		System.out.println(ab);
//		String delete=sc.next();
////		Iterator<AddDetails> itads = ab.iterator();
////		int posi = Integer.parseInt();
//		ab.toString();
////		AddDetails d=ab.get(1);
////		Boolean con =ab.contains(d);
////		System.out.println(con+" "+d);
////		ab.remove(con);
//		System.out.println(ab);
//	}

	if (type.equalsIgnoreCase("exit")) {
		System.out.println("Exited");
		 return;
	}
	}
}
} 