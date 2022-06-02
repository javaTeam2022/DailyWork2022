package queueInterface;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class QueueMainEx1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Book> pq = new PriorityQueue<Book>();
		LinkedList<Book> llq = new LinkedList<Book>();
		pq.add(new Book(1231, "kalyan", "Techin2022", "RK publishers", 550));
		pq.add(new Book(1232, "venu", "Oxford", "Global publishers", 890));
		pq.add(new Book(1233, "navya", "RichDadPoorDad", "BN publishers", 450));
		pq.add(new Book(1234, "ganesh", "Java", "Global publishers", 800));
		pq.add(new Book(1235, "ahemmed", "ServiceNow", "Gobal publishers", 890));
		pq.add(new Book(1236, "sai", "python", "Gobal publishers", 700));
		pq.add(new Book(1237, "harish", "Devops", "Gobal publishers", 650));

		llq.addAll(pq);
		while (true) {
			System.out.println(
					"Choose the Options:\n-------------------\n-->AddRecords(add).\n-->RemoveRecord(remove).\n-->UpdateRecord(update).\n-->DisplayRecords(display).\n-->Exit(exit).");
			String choose = sc.next();
			switch (choose) {
			case "add":
				System.out.println("Enter the BookIdno:");
				int bid = sc.nextInt();
				System.out.println("Enter the Author Name:");
				String baname = sc.next();
				System.out.println("Enter the Book Name:");
				String bname = sc.next();
				System.out.println("Enter the Publisher Name:");
				String pname = sc.next();
				System.out.println("Enter the Price:");
				int bprice = sc.nextInt();
				pq.add(new Book(bid, baname, bname, pname, bprice));
				System.out.println("Record Was Inserted.");
				break;
			case "remove":
				System.out.println("Enter the Book Idno:");
				String r = sc.next();
				for (int i = 0; i < llq.size(); i++) {
					if (llq.get(i).getBookname().equals(r)) {
						llq.remove(r);
					}
				}
				System.out.println("Record Was Removed");
				pq.clear();
				pq.addAll(llq);
				break;
			case "update":
				String uuu;
				int uu;
				System.out.println("Enter the Book Name:");
				String u = sc.next();
				for (int i = 0; i < pq.size(); i++) {
					if (llq.get(i).getBookname().equals(u)) {
						System.out.println(
								"What you want to Update:\n------------------------\n1)Book Idno.\n2)Book Name.\n3)Book Author.\n4)Publisher Name.\n5)Price.");
						int key = sc.nextInt();
						switch (key) {
						case 1:
							System.out.println(llq.get(i).getBookid());
							System.out.println("Enter the Idno you want update:");
							uu = sc.nextInt();
							llq.get(i).setBookid(uu);
							System.out.println("idno was Updated.");
							break;
						case 2:
							System.out.println(llq.get(i).getAuthor());
							System.out.println("Enter the Author Name you want to update:");
							uuu = sc.next();
							llq.get(i).setAuthor(uuu);
							System.out.println("Author Name was Updated");
							break;
						case 3:
							System.out.println(llq.get(i).getBookname());
							System.out.println("Enter the Bookname you Want to update:");
							uuu = sc.next();
							llq.get(i).setBookname(uuu);
							System.out.println("Bookname was Updated.");
							break;
						case 4:
							System.out.println(llq.get(i).getPublisher());
							System.out.println("Enter the Published name you want to update:");
							uuu = sc.next();
							llq.get(i).setPublisher(uuu);
							System.out.println("Published name was updated.");
							break;
						case 5:
							System.out.println(llq.get(i).getPrice());
							System.out.println("Enter the price you want to update:");
							uu = sc.nextInt();
							llq.get(i).setPrice(uu);
							System.out.println("Price was updated.");
							break;
						}
					}
				}
				break;
			case "display":
				System.out.println("Priority Queue:");
				Iterator<Book> itb = pq.iterator();
				while (itb.hasNext()) {
					System.out.println(itb.next());
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