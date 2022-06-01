package queue_Interface_Pro;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_PriorityQueueEx2 {

	public static void main(String[] args) {
		// priorityQueue the first priority given to the smallest element.
		Queue<Integer> Priority_Queue = new PriorityQueue<>();
		Priority_Queue.add(5);
		Priority_Queue.add(3);
		Priority_Queue.add(4);
		Priority_Queue.add(1);
		// Priority_Queue.add(10);
		Priority_Queue.add(2);
		System.out.println(Priority_Queue);
		System.out.println("Removing headelement :" + Priority_Queue.peek());
		Priority_Queue.remove(2);
		System.out.println("remove the element :" + Priority_Queue);
		for (Integer priority : Priority_Queue) {
			System.out.println(priority);
		}
		Priority_Queue.poll();
		System.out.println("Removing and retriving the element :" + Priority_Queue);
		Priority_Queue.remove(1);
		System.out.println("Removed :" + Priority_Queue);
		for (Integer int1 : Priority_Queue) {
			System.out.println(Priority_Queue);
			break;
		}

	}

}
