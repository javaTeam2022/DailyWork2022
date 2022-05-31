package list_Interface;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// ArrayList concept Example programs
		// Arraylist can accept any type of data
		ArrayList obj = new ArrayList();

		obj.add(66);
		obj.add(76);
		obj.add(88);
		obj.add(68);
		// if you can number charcters then it will be added to the arraylist
		obj.add("Java");
		obj.contains(true);
		obj.add("Hello World");

		System.out.println("index position :" + obj.indexOf(88));
		System.out.println("last index position :" + obj.lastIndexOf(68));

		System.out.println(obj);
		ArrayList obj1 = new ArrayList();
		// contain() checks to the index values
		obj1.add(10);
		obj1.add(20);
		obj1.add(30);
		obj1.add(40);
		obj1.add(50);
		obj1.indexOf(40);// serch for index position

		obj1.add("Java is awesome");
		System.out.println(obj1);
		// Addall method used for all are added in this method
		obj.addAll(obj1);
		System.out.println(obj);
		// contains()it will be check on the value it returns boolean true are false
		System.out.println(obj1.contains(50));
		System.out.println(obj.contains(10));
		System.out.println(obj1);

	}

}
