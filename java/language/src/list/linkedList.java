package language.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class linkedList {

    static void linkedList(){
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(int i =0 ; i <10; i++)
            ll.add(i);
        System.out.println(ll);
        ll.remove(0);
        ll.remove(0);

        System.out.println(ll);


        LinkedList<Integer> lz = new LinkedList<Integer>();
        for(int i = 9 ; i >= 0; i--)
            lz.add(i);
        System.out.println(lz);
        lz.remove(0);
        lz.remove(0);


        LinkedList<Integer> copied =  (LinkedList<Integer>)ll.clone();
        System.out.println(copied.equals(ll));

        System.out.println(ll);
        System.out.println(lz);
        System.out.println(ll.equals(lz));
        Collections.sort(lz);
        System.out.println(ll.equals(lz));
    }
    static void stack(){
        LinkedList<Integer> stack = new LinkedList<Integer>();
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.removeLast());
        System.out.println(stack.pop());
        try {
            System.out.println(stack.pop());
        }catch (java.util.NoSuchElementException e){}
        System.out.println();

    }

    static void queue() {
    }

    public static void equality_tests(){
        LinkedList l = new LinkedList(Arrays.asList(1,2,3,4));
        LinkedList ll = (LinkedList)l.clone();
        if (l == ll)
            System.out.println("==");
        if (l.equals(ll))
            System.out.println("equals");
    }
    public static void p(){

        LinkedList<Integer> queue = new LinkedList<Integer>();
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        try {
            System.out.println(queue.pop());
        }catch (java.util.NoSuchElementException e){}

        queue.add(3);
        queue.add(4);
        queue.add(5);

        System.out.println("################");
        HashSet<Integer> h = new HashSet<>(queue);
        System.out.println(h.toString());
    }
    public static void main(String[] args){
        //linkedList();
        //stack();
        //queue();
        //equality_tests();
        p2();
    }

    static void p1(){
        LinkedList<?> ll = new LinkedList<>(Arrays.asList('1','2','3'));
        System.out.println(ll.getLast());
        System.out.println(ll);
    }

    static void p2(){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.offer(null);
        ll.offer(null);
        ll.poll();ll.poll();
        ll.poll();
        ll.peek();
        ll.offer(1);
        ll.offer(2);
        System.out.println(ll.peek());
        System.out.println(ll.size());
        //ll.element(); //NoSuchElementException
        //System.out.println(ll.getLast());

    }
}
