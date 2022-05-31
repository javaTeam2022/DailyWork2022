package CollectionFrameWork;
//Elements in ascending order
//It not allow the duplicate values
//It not allow the null value.
//It is not synchronized by default.
//If we want to represent a group of individual object as a single entity
//where duplicates are not allowed and all objects should be inserted according to 
//ascending order then we should use TreeSet
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx2 {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet();
		 
		ts1.add(96);
     	ts1.add(92);
     	ts1.add(97);
     	ts1.add(94);
		ts1.add(95);
    	System.out.println(ts1);
    	System.out.println(ts1.ceiling(93));
    	System.out.println(ts1.floor(93));
    	System.out.println(ts1.lower(95));
    	System.out.println(ts1.first());
    	System.out.println(ts1.higher(95));
    	System.out.println();
//		
//		ts1.add("Navya");
//		ts1.add("Ganesh");
 //    	ts1.add(98);
//		ts1.add(99);
//		System.out.println(ts1);
		
	}
}
