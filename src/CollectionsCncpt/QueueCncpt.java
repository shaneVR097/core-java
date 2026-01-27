package CollectionsCncpt;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class QueueCncpt {
	public static void main(String[] args) {
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("abc");
		pq.add("efg");
		try {
			pq.add(null);
		} catch ( NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(pq);
		pq.add("adc");
		System.out.println(pq);
		
		PriorityQueue<Integer> 
		pq2 = new PriorityQueue<Integer>();
		pq2.add(10);
		pq2.add(20);
		pq2.add(100);
		pq2.add(5);
		pq2.add(30);
		pq2.add(70);
		System.out.println(pq2);
		
		ArrayDeque<String> adq = new ArrayDeque<String>();
		adq.add("pqr");
		adq.add("uvw");
		System.out.println(adq);
		adq.offer("ijk");
		System.out.println(adq);
		adq.addFirst("dfg");
		System.out.println(adq);
		adq.addLast("hij");
		System.out.println(adq);
		adq.offerFirst("jkl");
		System.out.println(adq);
		adq.offerLast("pqr");
		System.out.println(adq);
		adq.removeFirst();
		System.out.println(adq);
		adq.removeLast();
		System.out.println(adq);
		adq.pollFirst();
		System.out.println(adq);
		adq.pollLast();
		System.out.println(adq);
		
		System.out.println(adq.peekFirst());
		
		System.out.println(adq.peekLast());
		
	}
}
