package queue_Interface_Pro;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedListEx1 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Mouse");
		q.add("Keybord");
		q.add("Joystick");
		q.add("Trackball");
		q.add("Trackball");
		q.add("Monitor");
		System.out.println(q);
		
	    q.remove("Trackball");
	    //Removing the element.
		System.out.println("Removed :"+q);
		System.out.println("Retrive the head element :"+q.peek());
		System.out.println(q);
		//removing and retriving the element.
		System.out.println("retriving and removing the head element :"+q.poll());
		System.out.println(q);
		Iterator<String> ts = q.iterator();
		while (ts.hasNext()) {
			System.out.println(ts.next()); 
			
		} 
	}

}
