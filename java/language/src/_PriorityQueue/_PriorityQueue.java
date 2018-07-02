package language._PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class _PriorityQueue {


    public static void main(String[] args) {
        p1();
    }

        static void p1(){
            int[] a = {1,2,3,4,5,6};
            for (int i : a){
                System.out.println(i);
            }
        }
        static void p2(){
        Comparator<Integer> comp = (x, y)->y-x;
        PriorityQueue<Integer> p = new PriorityQueue<>(2, comp);
        p.offer(100);
        p.offer(50);
        p.offer(2);
        p.offer(-100);
        p.offer(150);
        p.offer(-12);
        for (int i : p){
            System.out.println(i);
        }
        boolean a = true;
        System.out.println("_PriorityQueue");
        while(!p.isEmpty()){
            System.out.println(p.poll());
        }
    }

}
