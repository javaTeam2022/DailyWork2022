package CollectionFrameWork;
import java.util.TreeSet;
// Elements in ascending order
// It not allow the duplicate values
// It not allow the null value.
// It is not synchronized by default.
// If we want to represent a group of individual object as a single entity
// where duplicates are not allowed and all objects should be inserted according to 
// ascending order then we should use TreeSet.
public class TreeSetEx {
public static void main(String[] args) {
	
	TreeSet<Integer> ts = new TreeSet<Integer>();
	
	ts.add(95);
	ts.add(99);
	ts.add(97);
	ts.add(98); 
	ts.add(94); // it not allow the duplicate values
	ts.add(99);
	ts.add(100);
//	ts.add(null); // it not allow the null value.
    for(int i:ts) {
    	System.out.println(i);
    }	
   }
}
