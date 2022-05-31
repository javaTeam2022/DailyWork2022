package list_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List_Ex2 {

	public static void main(String[] args) {
		// TYPE UNSEFE : It collect any type of data .
		ArrayList al = new ArrayList();
		
		al.add("1.Venumadhav");
		al.add("2.Ganesh");
		al.add("3.Kalyan");
		al.add("4.Vinod");
		al.add("5.Ranjith kumar");
		al.add(101);
		al.add(102);
		al.add(null);
		
		System.out.println(al);
		// Get the iterator
		Iterator<String> itr = al.iterator();
		// Print the first item.
		System.out.println(itr.next());
		
		// TYPE SEFE : It collect declare datatype only .
		ArrayList<String> as = new ArrayList<String>();
		
         as.add("1.RCB");//add the all elements in the in the array point of view.
         as.add("2.RRR");
         as.add("3.CSK");
         as.add("4.SR");
         as.add("5.SRH");
         as.add(null);// Arraylist allow the null.
         
         System.out.println(as);
         Iterator<String> is = as.iterator();
         while (is.hasNext()) {
           System.out.println(is.next()); 
			
		}
       //addall method can be used in the add the all elements in in the arrays point of view
         al.addAll(as);
         System.out.println(al);
//         as.removeAll(as);
//         as.add(1,"kalyan");//1st position will be changed name. 
//         System.out.println(as);
         al.set(3,"Marolix");
         System.out.println(al);
         al.add(4,"Employee");
         System.out.println(al);
         System.out.println(as.contains("3.CSK"));
         al.removeAll(al);// Remove all the elements
         System.out.println("Remove all "+al);
       //containall all the elements are same then returns true otherwise it return false.
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
