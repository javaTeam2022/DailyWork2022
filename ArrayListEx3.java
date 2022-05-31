package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListEx3
{
	public static void main(String[] args) {
	String s = "venu";
	int a[] = {11,12,13};
	
		ArrayList<String>al=new ArrayList<String>();
<<<<<<< HEAD
		
=======
		ArrayList<String>al3=new ArrayList();
>>>>>>> 5755145 (Practiced Programs)
		al.add("RCB");
		al.add("SRH");
		al.add("RR");
		al.add("DC");
		al.add("CSK");
		al.add("SRH");//it accept duplicate
		al.add("MI");
		al.add("KKR");
		al.add("LSG");
		al.add("GT");
		al.add(s);
<<<<<<< HEAD
		
		System.out.println("Elements are "+al);
		
=======
		al3.add("500");
		System.out.println("Elements are "+al);
		al.addAll(al3);
>>>>>>> 5755145 (Practiced Programs)
		ArrayList al2 = new ArrayList();
		al2.add("Bangalore");
		al2.add("Hyderabad");
		al2.add("Rajastan");
		al2.add("Delhi");
		al2.add("Chennai");
		al2.add("Hyderabad");
		al2.add("Mumbai");
		al.addAll(al2);
	
		System.out.println("After addAll: "+al2);
		System.out.println("Size of ArryList "+al.size());
		al.remove(1);
		System.out.println("After Removing index 1: "+al);
		System.out.println("Size of ArryList "+al.size());
		System.out.println("Hash code of array: "+al.hashCode());
		System.out.println("Get specific element: "+al.get(2));
		al.set(3,"Hyderabad");
		System.out.println("After replace the element specific index: "+al);
		System.out.println("Check the Hyderabad is there or not: "+al.contains("Hyderabad"));
		System.out.println(al); System.out.println(al2);
		System.out.println("check al and al1 have same elements: "+al.containsAll(al2));
		System.out.println("Removed the element: "+al.remove("Bangalore"));
		System.out.println("after remove check al and al1 have same elements: "+al.containsAll(al2));
		System.out.println("comapare two objectes: "+al.equals(al2));
<<<<<<< HEAD
		System.out.println();

=======
		System.out.println(al.set(7, "VENU"));
		System.out.println("After set value: " +al);
        
>>>>>>> 5755145 (Practiced Programs)
        Iterator it =al.iterator();
        System.out.println("Iterating Present Elemets by using iterator method");	
        while(it.hasNext())
        {
        	System.out.print(", "+it.next());
        
        }

        al.add(2,"Goa");
        System.out.println("\nAfter adding a elemet by index "+al);
<<<<<<< HEAD

=======
        
        System.out.println("after Null: "+al);
>>>>>>> 5755145 (Practiced Programs)
//        Object[]ob=al.toArray();//returns array of objectType.
//        //String[]s=(String[])
//        for(int i=0;i<ob.length;i++)
//        {
//        	System.out.println(ob[i]);
//        }

	}
}

