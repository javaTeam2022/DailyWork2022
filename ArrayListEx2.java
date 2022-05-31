package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListEx2 {
public static void main(String[] args) {
	
	//Type Safe
	ArrayList <String> al = new ArrayList();
	LinkedList ld = new LinkedList();
	al.add("Java");
	al.add("is");
	al.add("funny");
	ld.add("500");
	ld.add("501");
	ld.add("502");
//	al.add(55);// it not takes integers because we mention type safe as string
	System.out.println(al);
	System.out.println(ld);
	al.addAll(ld);
	System.out.println(al);
	// no type safe
	ArrayList al2 = new ArrayList();
	al2.add("Java");
	al2.add("is");
	al2.add("funny");
	al2.add(55);// it will allows integers because it is not type safe
	al2.add(98);
	System.out.println(al2);
	
    }
}

