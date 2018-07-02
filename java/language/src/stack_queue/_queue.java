package language.stack_queue;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class _queue {
    static void _queue(){
        Queue q = new LinkedList();
        Collections.addAll(q, 1.2,3,4, 5,6,7,8,9);
        q.add(1);
        q.add(2);
        //q.add("abc");
        //q.add("abc");
        //q.add("abc");
        q.add(2);
        q.add(3);
        //q.add(null);
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q);

        HashSet<Object> h = new HashSet<>(q);
        System.out.println(h);

        System.out.println(Collections.min(q));
    }
    public static void main(String[] args){
        _queue();
    }
}
