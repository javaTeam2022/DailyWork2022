package CollectionFrameWork;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		
		PriorityQueue <Integer> pq = new PriorityQueue();
		pq.add(742);
		pq.add(689);
		pq.add(1056);
		pq.add(45);
		pq.add(856);
		pq.add(541);
		pq.add(956);
		pq.add(325);
		pq.add(289);
		System.out.println(pq);
		System.out.println("Size() "+pq.size());
		pq.offer(1000);
		System.out.println(pq);
		System.out.println("retune the first element of the list "+pq.peek());
		System.out.println("Poll() will remove the first element of the list "+pq.poll());
		System.out.println(pq);
		System.out.println(pq.remove());
		System.out.println(pq);
		
		Iterator it = pq.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
	}
}
