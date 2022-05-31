package CollectionFrameWork;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx2 {

	public static void main(String[] args) {
		
	 PriorityQueue<PriorityQueueGaudges> gaudges = new PriorityQueue<PriorityQueueGaudges>();
	 PriorityQueueGaudges p1 =new PriorityQueueGaudges("Iphone","13mini", 999);
	 PriorityQueueGaudges p2 =new PriorityQueueGaudges("Iphone","13",9999);
	 gaudges.add(p1);
	 gaudges.add(p2);
//	 gaudges.add(new PriorityQueueGaudges("samsung","S22ultra", 110999));
//	 gaudges.add(new PriorityQueueGaudges("samsung","A33",35999));
//	 gaudges.add(new PriorityQueueGaudges("OnePlus","9T", 43999));
//	 gaudges.add(new PriorityQueueGaudges("Iqoo","9pro", 33999));
//	 gaudges.add(new PriorityQueueGaudges("realme","9i", 23999));
 
	 System.out.println(p1.compareTo(p2));
	 
//		System.out.println(gaudges);
//        Iterator it = gaudges.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}	
//	
//	    System.out.println();
			
		}
	
}
