package chang.practice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.*;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		priorityQueueTest();
		queueTest();
	}
	
	public static void priorityQueueTest()
	{
	  PriorityQueue<String> queue =  new PriorityQueue<String>();
	        queue.add("short");
	        queue.add("very long indeed");
	        queue.add("medium");
	        while (!queue.isEmpty())
	        {
	            System.out.println(queue.remove());
	        }
	}
	
	public static void queueTest()
	{
		LinkedList<String> queue =  new LinkedList<String>();
	        queue.add("short");
	        queue.add("very long indeed");
	        queue.add("medium");
	        while (!queue.isEmpty())
	        {
	            System.out.println(queue.remove());
	        }
	}
	
	
}
