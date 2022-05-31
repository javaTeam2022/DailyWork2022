package CollectionFrameWork;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
//- It is used to create collections.
//- It is the implemented of set interface.
//- It dosn't maitaine the insertion order of the elements to be stored.
//- It is does not allow duplicate elements to be stored.HashSet contain unique elements.
//- It allows  null value. Duplicate null values not accepted.
//- It is not synchronized by default but can be synchronized explicitly.
public class HashSetEx {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		HashSet<String> hs = new HashSet();
		hs.add("Navya");
		hs.add("VENU");
		hs.add("Ganesh");
		hs.add("Kalyan");
		hs.add("Ranjeeth");
		hs.add("999");
		hs.add(null);
		//Printing the elements
		System.out.println(hs);//[null, Navya, Ganesh, Kalyan, Ranjeeth, Vinod, VENU]
		
		System.out.println(hs.getClass());
		//Iterating the elements from array using for each loop.
		for(String e: hs) {
			System.out.println(e);
		}
/*		null
		Navya
		Ganesh
		Kalyan
		Ranjeeth
		Vinod
		VENU
*/		
		// iterating the element using iterater class
		Iterator<String> it = hs.iterator();
		System.out.println("Elements are");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
