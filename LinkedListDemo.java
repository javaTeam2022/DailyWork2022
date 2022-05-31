package CollectionFrameWork;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListDemo
{
	public static void main(String[] args) throws NumberFormatException,IOException
	{
		
       LinkedList<String>ls=new LinkedList<String>();
       ls.add("India");
       ls.add("America");
       ls.add("Russia");
       ls.add("Canada"); 
       ls.add("Australia");
       ls.add("Spain");
       ls.add("Spain");//it allow duplicate
       System.out.println("Elements are: "+ls);

       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

       String elemets;
       int position,choice;
       while(true){
       
       	System.out.println("LINCKED LIST OPRERATION");
       	System.out.println("1.Add an Elements");
       	System.out.println("2.Remove an element");
       	System.out.println("3.Change/Replace an element");
       	System.out.println("4.Exit");
       	System.out.println("End The Program");
       
       choice=Integer.parseInt(br.readLine);
       switch(choice)
       {
       	case1:  System.out.println("Chosee You Operation");
             	elemets=br.readLine();
            	System.out.println("At what Position");
                position=Integer.parseInt(br.readLine());
                ls.add(position-1,elemets);
         	    break;

       	case2:  
            	System.out.println("Enter a Position");
                position=Integer.parseInt(br.readLine());
                ls.remove(position-1);
         	    break;

        case3:  
                System.out.println("Enter a Position");
                position=Integer.parseInt(br.readLine());
                System.out.println("Enter a new elemet");
                elemets=br.readLine();
                ls.set(position-1,elemets);
         	    break;

        default:
                  System.out.println("You are exit from the program.\n Program ends");
                  return; 
           } 
           System.out.println("LIST "+ls);         

       }
	}
}
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListDemo {
		public static void main(String[] args) throws NumberFormatException, IOException {
		LinkedList<String> ls=new LinkedList<String>();
		ls.add("India");
		ls.add("America");
		ls.add("Japan");
		ls.add("Japan"); // stores duplicates
		System.out.println("List="+ls);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position, choice;
		while(true)
		{
			System.out.println("LINKED LIST OPERATIONS");
			System.out.println("1.Add an element");
			System.out.println("2.Remove an element");
			System.out.println("3.Change/Replace an element");
			System.out.println("4.Exit");
			System.out.println("Select any operation :");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
			case 1:System.out.println("Enter the element");
				   element=br.readLine();
			       System.out.println("At what position ?");
			       position=Integer.parseInt(br.readLine());
			       ls.add(position-1,element);
				   break;         
			case 2:System.out.println("Enter position");
			       position=Integer.parseInt(br.readLine());
		           ls.remove(position-1);
			       break;
			case 3:System.out.println("Enter position");
			 	   position=Integer.parseInt(br.readLine()); 
			       System.out.println("Enter a new element");
			       element=br.readLine();
		           ls.set(position-1,element);// set() method replaces 
			       break;
			default:System.out.println("You are exit from the program.\n Program Ends.");
                    return; // terminates from the swich and loop.
			}
			System.out.println("List="+ls);

			/*Iterator<String> it=lst.iterator();
			while(it.hasNext());
			System.out.println(it.next()+"");*/
		}
	}
}
