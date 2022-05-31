package CollectionFrameWork;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HashSetEx2 {
	
	static Scanner sc = new Scanner(System.in);
	
public static void main(String[] args) {
	/**
	 * 
	 * 
	 * @author home
	 */
	HashSet<HashSetObject> hs = new HashSet<HashSetObject>();
	LinkedList<HashSetObject> linkedlist = new LinkedList<HashSetObject>();
	
	HashSetObject hashSetObject1 = new HashSetObject(457, "Venu", "Java");
	HashSetObject hashSetObject2 = new HashSetObject(895, "ganesh", "Java");
	hs.add(hashSetObject1);
	hs.add(hashSetObject2);
	System.out.println(hs);
	linkedlist.addAll(hs);
	System.out.println(linkedlist);
	
	   while(true) {
	System.out.println("1.Add Element\n2.Read elements\n3.Update Element\n4.Delete Element"); 
	     int choose = sc.nextInt();
	  
	     switch (choose) {
	case 1:
		 System.out.println("Adding Elements");
		    	
		    	 System.out.println("Enter id Number");
			     int  id = sc.nextInt();
			     System.out.println("Enter Name");
			     String name = sc.next();
			     System.out.println("Enter Domain name");
			     String  domain = sc.next();
			     HashSetObject a = new HashSetObject(id,name,domain);
			     hs.add(a);
			     System.out.println(hs);
		         break;
		      
	case 2:
		 System.out.println("Enter a id Which emp details you want");
			     
			     HashSetObject hso = new HashSetObject();
			     System.out.println("Enter id Number");
			     int  userId = sc.nextInt();
			  
			     
//			     for(int i = 0; i<linkedlist.size();i++) {
//			    	 if(linkedlist.get(i).getId().equals(userId)) {
//				    	 System.out.println(hs.contains(userId));
//				     }
			     }
//			     System.out.println("Enter Name");
//			     String name = sc.next();
//			     System.out.println("Enter Domain name");
//			     String  domain = sc.next();
//			     HashSetObject a = new HashSetObject(userId,name,domain);
//			     hs.add(a);
//			     System.out.println(hs);
		         break;
		
	     }
	}
		
	}
	



