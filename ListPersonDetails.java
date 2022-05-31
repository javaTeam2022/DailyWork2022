package CollectionFrameWork;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ListPersonDetails {
	
	public static void main(String[] args) {
		String name1;
		long mblno;
		String addres;
		
		Scanner sc = new Scanner(System.in);
		LinkedList<PersonDetails> lpd = new LinkedList();
		
	//	HashSet<PersonDetails> lpd = new HashSet<PersonDetails>();
		
		for (int i = 1; i <= 2; i++) {
			System.out.println("Enter Person "+i+" Details Name,MobileNo,Address");
			name1 = sc.next();
			mblno = sc.nextLong();
			addres = sc.next();
			PersonDetails pd = new PersonDetails(name1, mblno, addres);
			
			lpd.add(pd);
		}
		
		Iterator<PersonDetails> it = lpd.iterator();
		System.out.println("Address Book");
		System.out.println(lpd);
		System.out.println(lpd.get(1));
		System.out.println("Delete name,moblie no,addrress");
		int delete = sc.nextInt();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		lpd.remove("Venu");
		System.out.println("Remove"+lpd);
		System.out.println("1.Delete name");
		delete = sc.nextInt();
		System.out.println("1.Delete Mobile Number");		
		
	}
}
