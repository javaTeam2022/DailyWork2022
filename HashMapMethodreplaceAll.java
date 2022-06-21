package map;

import java.util.HashMap;

public class HashMapMethodreplaceAll {

	public static void main(String[] args) {

		 HashMap<String, Integer>
         map1 = new HashMap<>();
     map1.put("Tushar", 2000);
     map1.put("Anushka", 2001);
     map1.put("Sanskriti", 2003);
     map1.put("Anuj", 2002);

     // print map details
     System.out.println("HashMap1: "
                        + map1.toString());

     // replace yearOfBirth with current age
     // using replaceAll method
     map1.replaceAll((key, yearOfBirth)
                         -> 2022 - yearOfBirth);

     // print new mapping
     System.out.println("New HashMap: "
                        + map1);

	}

}
