package Collections;
//   COLLECTIONS FRAME WORK
import java.util.ArrayList;

public class Collections_Ex2 {
     
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
	
		ar.add("ID No ");
		ar.add("Emply AcNo");
		ar.add("Emp AdhNo");
		ar.add("Deposite amt");
	  
		System.out.println(ar);
		
		ArrayList<Integer> ai=new ArrayList<Integer>( );
		
		ai.add(454);
		ai.add(1236544564);
        ai.add(77081239);
        ai.add(500000);
       System.out.println(ai); 
        
       ArrayList<Integer> al=new ArrayList<Integer>();
       
       al.add(11);
       al.add(12);
       al.add(13);
       al.add(14);
       al.add(15);
       System.out.println(al.get(0)+al.get(2)+al.get(1));
       System.out.println(al);
       
//       ArrayList<Boolean> av=new ArrayList<Boolean>();
//       av.add(null);
//       av.add(true);
//       av.add(false);
//       av.add(true);
//       
//       System.out.println(av);
	}

}
/*
 1.Collection frame work represents a group of individual objects in a single entity.
 2.Collection is a Storing , Retriving , Sorting ,insert , delete this are all used in the collections.
 3.It provides the various classes such as LIST :(a).ArrayList .(b)LinkedList .(c).Vector :SET:(a).Hashset
 (b).LinkedHashset .(c).TreeSet :	QUEUE:(a)Queue .(b)Dequeue .
 4.All collection frame work classes are available in the java.util.package .
 */
 