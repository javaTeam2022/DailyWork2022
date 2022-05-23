package vector;
import java.util.*;
public class Stack_pros_Ex1 {
	//hashset program Ex1.
	public static void main(String[] args) {
		Set<String> ss = new HashSet<String>();
         ss.add("Ganesh");
         ss.add("Venumadhav");
         ss.add("kalyan");
         ss.add("Navya");
         ss.add("Venumadhav");
         ss.add("kalyan");
         ss.add("Navya");
         ss.add("Java is awesome");
         //1.set is collection of elements.
         //2.set does not allow the duplicate elements,if we try to pass same element which is already
         //available in the set ,then it is not stored into the set(and dont raise any error). 
         //3.set will grow dynamically when the elements are stored into it.
         //4.set is the sub interface of collection of interface. 
         System.out.println("set list :"+ss);
         
         Set<Integer> ss1 = new HashSet<Integer>();
         ss1.add(101);
         ss1.add(102);
         ss1.add(103);
         ss1.add(104);
         ss1.add(102);
         ss1.add(103);
         ss1.add(104);
         ss1.add(105);
         System.out.println("Numbers :"+ss1);
         
         Iterator<String> it = ss.iterator();
         while (it.hasNext()) {
			System.out.println(it.next()); 
			
		}
	}
}
