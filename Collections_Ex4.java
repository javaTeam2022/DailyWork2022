package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Collections_Ex4 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		al.add("1.Venumadhav");
		al.add("2.Ganesh");
		al.add("3.Kalyan");
		al.add("4.Vinod");
		al.add("5.Ranjith kumar");
		al.add(101);
		al.add(102);
		
		System.out.println(al);
		// Get the iterator
		Iterator<String> itr = al.iterator();
		// Print the first item.
		System.out.println(itr.next());
		
		ArrayList<String> as = new ArrayList<String>();
		
         as.add("1.RCB");//add the all elements in the in the array point of view.
         as.add("2.RRR");
         as.add("3.CSK");
         as.add("4.SR");
         as.add("5.SRH");
         
         System.out.println(as);
         al.addAll(as);//addall method can be used in the add the all elements in in the arrays point of view
         System.out.println(al);
//         as.removeAll(as);
         as.add(1,"kalyan");//position will be changed to the element. 
         System.out.println(as);
         System.out.println(as.contains("3.CSK"));
       //containall allthe elements are same then returns true otherwise it return false.
         System.out.println(as.containsAll(al));
         System.out.println(" Empty :"+as.isEmpty());
         // Get the iterator
         Iterator<String> it = as.iterator();
         while (it.hasNext()) {
        	 // Print the all items .
        	 System.out.println(" "+it.next());	
		}
         
	}

}
