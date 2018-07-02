package language.stack_queue;


import java.util.*;

class _stack {

    // Do not use Stack
    static void stack() {
        /*
        Stack s = new Stack();
        s.push(1);
        s.push(2);

        s.push("assas");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        try {
            System.out.println(s.peek());
        } catch (EmptyStackException e) {
            System.out.println(e);
        }

        s.push(1);
        s.push(1);
        s.push("assas");

        HashSet<Object> h = new HashSet<>(s);
        System.out.println(h);
        */
        ArrayDeque s = new ArrayDeque(1);
        s.push(1);
        s.push(2);

        s.push("assas");
        try {
            s.push(null);
        }catch (NullPointerException e){System.out.println(e);}

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        try {
            System.out.println(s.peek());
        } catch (EmptyStackException e) {
            System.out.println(e);
        }

        s.push(1);
        s.push(1);
        s.push("assas");

        HashSet<Object> h = new HashSet<>(s);
        System.out.println(h);

    }
        static void stack2(){
         LinkedList s = new LinkedList();
            s.push(1);
            s.push(2);
            s.push("assas");
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.size());

            System.out.println(s.peek());
            try {
                System.out.println(s.pop());
            } catch (NoSuchElementException e) {
                System.out.println(e);
            }


        }
        // do not use Stack
    static void stack3() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //s.push("assas");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());
        try {
            System.out.println(s.peek());
        } catch (EmptyStackException e) {
            System.out.println(e);
        }
    }
    static void stack4(){
        LinkedList<Integer> s = new LinkedList<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.size());

        System.out.println(s.peek());
        try {
            System.out.println(s.pop());
        } catch (NoSuchElementException e) {
            System.out.println(e);
        }


    }


    public static void main (String[] args){
        stack();
        //stack2();
        //stack3();
        //stack4();
    }

}
