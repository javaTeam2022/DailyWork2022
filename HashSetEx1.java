package hashSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetEx1 {

	public static void main(String[] args) throws IOException {
		HashSet<CompDetails> hashSet = new HashSet<CompDetails>();
		LinkedList<CompDetails> llcd = new LinkedList<CompDetails>();

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		String choose;
		String id;
		String name;
		String phoneno;
		String domain;
		CompDetails cd1 = new CompDetails("459", "kalyan", "8374767245", "Java");
		CompDetails cd2 = new CompDetails("456", "Venu", "255334433", "java");
		CompDetails cd3 = new CompDetails("452", "ganesh", "43456546l", "java");
		CompDetails cd4 = new CompDetails("450", "navya", "4354654l", "java");
		hashSet.add(cd1);
		hashSet.add(cd2);
		hashSet.add(cd3);
		hashSet.add(cd4);
		llcd.addAll(hashSet);
		while (true) {
			System.out.println(
					"Choose the option:\n-->AddRecords(add).\n-->RemoveRecord(remove).\n-->UpdateRecord(update).\n-->DisplayRecord(display).\n-->Exit(exit).");
			System.out.println("Enter the option:");
			choose = bfr.readLine();
			switch (choose) {
			case "add":
				System.out.println("Enter the Id no:");
				id = bfr.readLine();
				System.out.println("Enter the Name:");
				name = bfr.readLine();
				System.out.println("Enter the Phoneno:");
				phoneno = bfr.readLine();
				System.out.println("Enter the Domain:");
				domain = bfr.readLine();
				CompDetails cd = new CompDetails(id, name, phoneno, domain);
				hashSet.add(cd);
				System.out.println("Record Was Added.");
				break;
			case "remove":
				System.out.println("Enter the id no:");
				String r = bfr.readLine();
				for (int i = 0; i < llcd.size(); i++) {
					if (llcd.get(i).getId().equals(r)) {
						llcd.remove(i);
						System.out.println(llcd.get(i).getId().equals(r));
					} else if (!llcd.get(i).getId().equals(r)) {
						System.out.println("Record doesn't Exist");
					}
				}
				hashSet.clear();
				hashSet.addAll(llcd);
				break;
			case "update":
				String uu;
				System.out.println("Enter the idno:");
				String u = bfr.readLine();
				for (int i = 0; i < llcd.size(); i++) {
					if (llcd.get(i).getId().equals(u)) {
						System.out.println("what you want to update:");
						System.out.println("->idno.\n->name.\n->phoneno.\n->domain.");
						String up = bfr.readLine();
						switch (up) {
						case "idno":
							System.out.println(llcd.get(i).getId());
							System.out.println("Enter the id you want to update:");
							uu = bfr.readLine();
							llcd.get(i).setId(uu);
							break;
						case "name":
							System.out.println(llcd.get(i).getName());
							System.out.println("Enter the name you want to update:");
							uu = bfr.readLine();
							llcd.get(i).setName(uu);
							;
							break;
						case "phoneno":
							System.out.println(llcd.get(i).getPhoneno());
							System.out.println("Enter the phoneno you want to update:");
							uu = bfr.readLine();
							llcd.get(i).setPhoneno(uu);
							;
							break;
						case "domain":
							System.out.println(llcd.get(i).getDomain());
							System.out.println("Enter the domain you want to update:");
							uu = bfr.readLine();
							llcd.get(i).setDomain(uu);
							;
							break;
						default:
							break;
						}
					} else if (!llcd.get(i).getId().equals(u)) {
						System.out.println("Record doesn't Exist");
					}
				}
				hashSet.clear();
				hashSet.addAll(llcd);
				break;
			case "display":
				System.out.println("HashSet:");
				Iterator<CompDetails> ite = hashSet.iterator();
				while (ite.hasNext()) {
					System.out.println(ite.next());
				}
				break;
			case "exit":
				System.out.println("Exited.");
				return;
			default:
				return;
			}

		}

	}
}