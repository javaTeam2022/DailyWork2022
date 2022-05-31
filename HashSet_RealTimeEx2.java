package set_Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSet_RealTimeEx2 {

	public static void main(String[] args) throws IOException {
		HashSet<HashSet_RealTimeEx1> hashSet = new HashSet<HashSet_RealTimeEx1>();
		LinkedList<HashSet_RealTimeEx1> lst = new LinkedList<HashSet_RealTimeEx1>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id;
		String name;
		String mobile_Num;
		String domain;
		String options;
		HashSet_RealTimeEx1 hasSet1 = new HashSet_RealTimeEx1("101", "Ganesh", "8790846101", "Java");
		HashSet_RealTimeEx1 hasSet2 = new HashSet_RealTimeEx1("102", "Kalyan", "8790846102", ".net");
		HashSet_RealTimeEx1 hasSet3 = new HashSet_RealTimeEx1("103", "Venumadhav", "8790846103", "python");
		HashSet_RealTimeEx1 hasSet4 = new HashSet_RealTimeEx1("104", "Navya", "8790846104", "Java...");
		hashSet.add(hasSet1);
		hashSet.add(hasSet2);
		hashSet.add(hasSet3);
		hashSet.add(hasSet4);
		while (true) {
			System.out.println("+.Add Record.\n2.Remove Record.\n3.Update Record\n4.Display Record.\n5.Exit.");
			System.out.println("\''Select One Option\''");
			options = br.readLine();
			switch (options) {
			case "+":
				System.out.println("Enter your ID :");
				id = br.readLine();
				System.out.println("Enter your Name :");
				name = br.readLine();
				System.out.println("Enter your M_NO :");
				mobile_Num = br.readLine();
				System.out.println("Enter your Domain :");
				domain = br.readLine();
				HashSet_RealTimeEx1 added = new HashSet_RealTimeEx1(id, name, mobile_Num, domain);
				hashSet.add(added);
			case "Display":
				System.out.println("Display all Records");
				Iterator<HashSet_RealTimeEx1> itr = hashSet.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			case "exit":
				System.out.println("Exit");
				return;

			}
		}

	}

}
