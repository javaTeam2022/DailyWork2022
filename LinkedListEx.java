package CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		
		List<String> lstr = new LinkedList(); //up casting
		LinkedList<Integer> lint = new LinkedList();
		LinkedList ls = (LinkedList) lstr ; // down cating
		lstr.add("Virat");
		lstr.add("Rohit");
		lstr.add("KL Rahul");
		lstr.add("Dhoni");
		lstr.add("Pant");
		lstr.add("Bumrah");
		lstr.add("Jadeja");
		ls.add("Dinesh Karthik");
		ls.add("Hadrik Pandya");
		ls.add("Shreyas Iyer");
		ls.add("Bhuwaneshwar Kumar");
		System.out.println(ls);
		System.out.println("Team Size: "+ls.size());
		System.out.println(lstr);
		
		lint.add(100);
		lint.add(95);
		lint.add(101);
		lint.add(74);
		lint.add(32);
		lint.add(68);
		lint.add(74);
		lint.add(91);
		lint.add(55);
		lint.add(87);
		lint.add(15);
		System.out.println("Player Score Size: "+lint.size());
		System.out.println(lint.size()==ls.size());
		lint.push(56);
		System.out.println("push(): "+lint);
		lint.pop();
		System.out.println("pop(): "+lint);
		ls.addAll(lint);
		System.out.println("Equals: "+lint.equals(ls));
		System.out.println("AddAll(): "+ls);
		ls.addFirst("INDIA TEAM --> ");
		System.out.println(ls);
		ls.addLast("WIN");
		System.out.println(ls);
		System.out.println("Virat is there in team: "+ls.contains("Virat"));
		System.out.println(ls.hashCode());
		ls.clone();
		System.out.println("Clone(): "+ls);
		System.out.println(ls.hashCode());
		ls.remove("Pant");
		System.out.println("after remove pant: "+ls);
		ls.removeLast();
		System.out.println("Removed Last Element: "+ls);
		ls.removeLast();
		System.out.println("Removed Last Element: "+ls);
		System.out.println("Contains: "+ls.containsAll(lint));
		ls.addLast("WIN");
		ls.addLast(15);
		System.out.println(ls);
		System.out.println("Contains: "+ls.containsAll(lint));
		System.out.println("Equals"+ls.equals(lint));
		System.out.println("Get(); "+ls.getFirst());
		System.out.println("Index Of 9 Element: "+ls.get(9));
		System.out.println("Removed Index value 9: "+ls.remove(9));
		System.out.println("After removed Index value 9: "+ls);
		System.out.println(ls.removeAll(lint));
		System.out.println("After Remove all: "+ls);
		lint.addAll(ls);
		System.out.println("After addall"+lint);
		lint.clear();
		System.out.println("after clear "+lint);
		
	}
}
