package CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;
<<<<<<< HEAD

=======
>>>>>>> 5755145 (Practiced Programs)
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
<<<<<<< HEAD
		System.out.println("push(): "+lint);
		lint.pop();
		System.out.println("pop(): "+lint);
=======
		System.out.println("push(): "+lint);// inserts the element at the front of this list.
		lint.pop();
		System.out.println("pop(): "+lint);//removes and returns the first element of this list.
>>>>>>> 5755145 (Practiced Programs)
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
<<<<<<< HEAD
		System.out.println("Contains: "+ls.containsAll(lint));
		ls.addLast("WIN");
		ls.addLast(15);
		System.out.println(ls);
		System.out.println("Contains: "+ls.containsAll(lint));
		System.out.println("Equals"+ls.equals(lint));
=======
		System.out.println("Contains: "+ls.contains(lint));
		ls.addLast("WIN");
		ls.addLast(15);
		System.out.println(ls);
		System.out.println("ContainsAll: "+ls.containsAll(lint));
		System.out.println("Equals: "+ls.equals(lint));
>>>>>>> 5755145 (Practiced Programs)
		System.out.println("Get(); "+ls.getFirst());
		System.out.println("Index Of 9 Element: "+ls.get(9));
		System.out.println("Removed Index value 9: "+ls.remove(9));
		System.out.println("After removed Index value 9: "+ls);
		System.out.println(ls.removeAll(lint));
		System.out.println("After Remove all: "+ls);
		lint.addAll(ls);
		System.out.println("After addall"+lint);
<<<<<<< HEAD
		lint.clear();
		System.out.println("after clear "+lint);
		
=======
		System.out.println("Hashcode: "+lint.hashCode());
		System.out.println("Clone: "+lint.clone());
		System.out.println("Hashcode: "+lint.hashCode());
		System.out.println("Element: "+lint.element());// it return the first element of the list
		System.out.println("Get first: "+lint.getFirst());
		System.out.println("Get Last: "+lint.getLast());
		System.out.println("IndexOf: "+lint.indexOf("Virat"));//Returns the index of the first occurrence of the specified element in this list,
		//or -1 if this list does not contain the element.
		System.out.println(lint);
		System.out.println("LastIndexOf: "+lint.lastIndexOf("WIN"));
		System.out.println("Offer: "+lint.offer(8));//integer add the in list at last position
		System.out.println(lint);
		System.out.println("OfferFirst: "+lint.offerFirst(45));//integer add the in list at the first position
		System.out.println(lint);
		System.out.println("OfferLast: "+lint.offerLast(101));
		System.out.println(lint);
		System.out.println("Set: "+lint.set(5, 55));
		System.out.println(lint);
		System.out.println("PeekFirst: "+lint.peekFirst());// return the fist element of list
		System.out.println(lint);
		System.out.println("PeekLast: "+lint.peekLast());// return the last element of list
		System.out.println(lint);
		System.out.println("PollFirst: "+lint.poll());//Retrieves and removes the first element of this list, or returns null if this list is empty.
		System.out.println(lint);
		System.out.println("PollLast: "+lint.pollLast());//Retrieves and removes the last element of this list, or returns null if this list is empty.
		System.out.println(lint);
		System.out.println("removeFirstOccurrence: "+lint.removeFirstOccurrence(100));
		System.out.println(lint);
		System.out.println("removeLastOccurrence: "+lint.removeLastOccurrence(8));
		System.out.println("removeLastOccurrence: "+lint.removeLastOccurrence("WIN"));
		System.out.println(lint);
		System.out.println();
		
		LinkedList ls2 = new LinkedList();
		ls2.add("Ganesh");
		ls2.add("Navya");
		ls2.add("Kalyan");
		ls2.add("501");
		ls2.add("Ranjeeth");
		System.out.println("List2: "+ls2);
		System.out.println(ls2.toArray());
		
		lint.clear();
		System.out.println("after clear "+lint);
		
		
>>>>>>> 5755145 (Practiced Programs)
	}
}
