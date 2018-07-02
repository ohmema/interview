import java.util.Comparator;
import java.util.PriorityQueue;


public class Test {

	static class PQsort implements Comparator<Integer> {
		 
		public int compare(Integer one, Integer two) {
			return two - one;
		}
	}
 
	public static void main(String[] args) {
		int[] ia = { 1, 10, 5, 3, 4, 7, 6, 9, 8 };
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
 
		// use offer() method to add elements to the PriorityQueue pq1
		for (int x : ia) {
			pq1.offer(x);
		}
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, new PQsort());
		for (int x : ia) {
			pq2.offer(x);
		}
		System.out.println("pq1: " + pq1);
 
		
 
		System.out.println("pq2: " + pq2);
		
		while(!pq1.isEmpty())
		{
			System.out.print(pq1.poll() + " ");
		}
		System.out.println();
		while(!pq2.isEmpty())
		{
			System.out.print(pq2.poll() + " ");
		}
/* 
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element in the queue without removing it
		System.out.println("peek: " + pq2.peek());
		// print size
		System.out.println("size: " + pq2.size());
		// return highest priority element and removes it from the queue
		System.out.println("poll: " + pq2.poll());
		// print size
		System.out.println("size: " + pq2.size());
 
		System.out.print("pq2: " + pq2);*/
	}
}
