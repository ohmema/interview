package language.generic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class gen2 {
    public static <T> Object get(T t){
        Integer m = Integer.MIN_VALUE;
        return m;
    }
    public static <T> Object getFirst(List<T> l){
        return l.get(0);
    }

    public static void main(String[] args){
        List<Integer> l = new LinkedList<Integer>(Arrays.asList(1,2,3,4));
        System.out.println(gen2.getFirst(l));
        System.out.println(gen2.get(new Integer(1)));
    }
}
