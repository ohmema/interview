package language._PriorityQueue;

import java.util.LinkedList;
import java.util.PriorityQueue;

class _PriorityQueue2 {

    public static void main(String[] args){
        System.out.println("DEFAULT: MINHEAP");
        p1();
        System.out.println("MAX HEAP");
        maxheap();
        p2();
    }
    static void p1(){
        PriorityQueue heapq = new PriorityQueue<>();
        heapq.offer(1);
        heapq.offer(3);
        heapq.offer(-3);
        System.out.println(heapq.peek());
        heapq.poll();
        System.out.println(heapq.peek());
        heapq.poll();
        System.out.println(heapq.peek());

    }
    static void maxheap(){
        PriorityQueue<Integer> heapq = new PriorityQueue<>( (x, y)-> -1*Integer.compare(x, y));
        heapq.offer(1);
        heapq.offer(3);
        heapq.offer(-3);
        System.out.println(heapq.peek());
        heapq.poll();
        System.out.println(heapq.peek());
        heapq.poll();
        System.out.println(heapq.peek());

    }

    static void p2(){
        LinkedList a = new LinkedList();
        a.add(1);
        a.add(3);
        a.add("s");
        a.add("i");
        System.out.println((int)a.pop() + (int)a.pop());
        System.out.println((String)a.pop() + (String)a.pop());
    }
}
