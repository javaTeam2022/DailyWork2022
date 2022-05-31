package CollectionFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList();
		
		queue.add("Virat Kohli");
		queue.add("Rohit Sharma");
		queue.add("Dhoni");
		queue.add("Rishab Pant");
		queue.add("Shreyas Iyer");
		queue.add("Dinesh Karthik");
		System.out.println(queue);
		queue.offer("Jadeja");
		System.out.println("Offer() Insert the element at last of the list "+queue);
		System.out.println("retune the first element of the list "+queue.peek());
		System.out.println(queue.element());
		System.out.println(queue);
		queue.poll();
		System.out.println("Poll() will remove the first element of the list "+queue);
		System.out.println(queue.remove());
		System.out.println("After remove() "+queue);
		
		
	}
}
