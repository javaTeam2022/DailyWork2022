package set_Interface;

import java.util.LinkedHashSet;

public class Linked_HashSetEx1 {

	public static void main(String[] args) {
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		hs.add("Hello");
		hs.add("Java");
		hs.add("Is");
        hs.add("Awesome");
        
        hs.add("Java");
        hs.add("Awesome");
        System.out.println(hs);
        System.out.println("size of the linkedlist  :"+hs.size());
        hs.remove("Hello");
        System.out.println("Remove  "+hs);
        hs.contains("Java");
        System.out.println("checking of java :"+hs);

	}

}
