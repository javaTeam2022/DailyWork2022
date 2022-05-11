package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollegeDetails {

	public static void main(String[] args) {
		
		LinkedList <Students> ls = new LinkedList();
		
		Students st1 = new Students(450, "Ganesh", "Java");
		Students st2 = new Students(478, "Kalyan", ".net");
		Students st3 = new Students(884, "Navya", "HR");
		Students st4 = new Students(741, "Ranjeeth", "Java");
		Students st5 = new Students(632, "Sushmitha", "Testing");
		
		ls.add(st1);
		ls.add(st2);
		ls.add(st3);
		ls.add(st4);
		ls.add(st5);
		
		System.out.println(ls);
		
	    ls.descendingIterator();
	    Iterator<Students> it = ls.descendingIterator();
	    while (it.hasNext()) {
			System.out.println(it.next()); 
			
		}
	    
//		List<Students> desc = (List<Students>) ls.stream().map(t -> {
//			t.setId(t.getId());
//        return t;
//		})collect(.(ls.descendingIterator()));
//		
//		System.out.println("Decending: "+desc);
//		
		
		
	}
}
