import java.util.Comparator;
import java.util.PriorityQueue;


public class Stock<T> {
	
	public class Node{
		T t;
		int i;
		public Node(T t, int i)
		{
			this.t = t;
			this.i =i;
		}
	}
	
	public class timeComparator implements Comparator<Node>{
		public int compare(Node n, Node m)
		{
			return Integer.compare(n.i,m.i)*-1;
		}
	}
	
	PriorityQueue<Node> pq = new PriorityQueue<Node>(10, new timeComparator());
	int index = 0;
	
	public T peek()
	{
		return pq.peek().t;
	}
	
	public void push(T t)
	{
		pq.add(new Node(t, index++));
	}
	public T pop()
	{
		if(pq.isEmpty())
			return null;
		index--;
		return pq.poll().t;
	}
	
	public static void main(String[] args) {
		
		Stock<Integer> stack = new Stock<Integer>();
		
		stack.push(5);
		stack.push(8);
		stack.push(1);
		stack.push(10);
		Integer n ;
		while((n = stack.pop()) != null)
		{
			System.out.print(n + " ");
		}
	}

}
