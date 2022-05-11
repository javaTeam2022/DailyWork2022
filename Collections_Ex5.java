package Collections;

import java.util.LinkedList;

public class Collections_Ex5 {

	public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList();
        ls.add("Employee ID");
        ls.add("RollNo");
        ls.add("Adhar Name");
        ls.add("Dateofbirth");
        
        System.out.println(ls);
        LinkedList obj = new LinkedList();
        obj.add(454);
        obj.add(102);
        obj.add(415453);
        obj.add(11071999);
        
        System.out.println(obj);
        obj.addAll(ls);//add the both all elaments
        System.out.println(obj);
        
        System.out.println( "contins all :"+obj.containsAll(ls));//it returns the true are false
      //deleted for first element
        obj.pop();
        System.out.println(obj);
      //deleted the first element
        obj.poll();
        System.out.println(obj);
      //push the element (first)
        ls.push("Ganesh");
        System.out.println(ls);
      //retrive the elements
        obj.peek();
        System.out.println(obj);
        //addfirst element will be added.
        obj.addFirst("Marolix");
        System.out.println(obj);
        //addlast element will be added.
        obj.addLast("Java is Awesome");
        System.out.println(obj);
        
	}

}
