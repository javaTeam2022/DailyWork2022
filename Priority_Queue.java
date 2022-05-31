package Queue_Interface;

import java.util.LinkedList;
import java.util.Queue;

public class Priority_Queue {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Mouse");
		q.add("Keybord");
		q.add("Joystick");
		q.add("Trackball");
		q.add("Trackball");
		q.add("Monitor");
		System.out.println(q);
		System.out.println("removed :"+q.remove());
		System.out.println(q);
		System.out.println("Retrive the head element :"+q.peek());
		System.out.println(q);
		System.out.println("retriving and removing the head element :"+q.poll());
		System.out.println(q);

	}

}
