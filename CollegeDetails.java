package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
<<<<<<< HEAD
=======
import java.util.Scanner;
>>>>>>> 5755145 (Practiced Programs)
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollegeDetails {
<<<<<<< HEAD

	public static void main(String[] args) {
		
		LinkedList <Students> ls = new LinkedList();
		
		Students st1 = new Students(450, "Ganesh", "Java");
		Students st2 = new Students(478, "Kalyan", ".net");
		Students st3 = new Students(884, "Navya", "HR");
		Students st4 = new Students(741, "Ranjeeth", "Java");
		Students st5 = new Students(632, "Sushmitha", "Testing");
=======
	
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		LinkedList <CollegeStudents> ls = new LinkedList();
		
		CollegeStudents st1 = new CollegeStudents(450, "Ganesh", "Java");
		CollegeStudents st2 = new CollegeStudents(478, "Kalyan", ".net");
		CollegeStudents st3 = new CollegeStudents(884, "Navya", "HR");
		CollegeStudents st4 = new CollegeStudents(741, "Ranjeeth", "Java");
		CollegeStudents st5 = new CollegeStudents(632, "Sushmitha", "Testing");
>>>>>>> 5755145 (Practiced Programs)
		
		ls.add(st1);
		ls.add(st2);
		ls.add(st3);
		ls.add(st4);
		ls.add(st5);
		
		System.out.println(ls);
		
	    ls.descendingIterator();
<<<<<<< HEAD
	    Iterator<Students> it = ls.descendingIterator();
=======
	    Iterator<CollegeStudents> it = ls.descendingIterator();
>>>>>>> 5755145 (Practiced Programs)
	    while (it.hasNext()) {
			System.out.println(it.next()); 
			
		}
	    
<<<<<<< HEAD
//		List<Students> desc = (List<Students>) ls.stream().map(t -> {
=======
//		List<Students> desc = (List<CollegeStudents>) ls.stream().map(t -> {
>>>>>>> 5755145 (Practiced Programs)
//			t.setId(t.getId());
//        return t;
//		})collect(.(ls.descendingIterator()));
//		
//		System.out.println("Decending: "+desc);
//		
		
		
	}
}
