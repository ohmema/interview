package language.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class _Collections {
    static void _map(){
        HashMap<Integer, String> m = new HashMap<>();

        System.out.println(m.getOrDefault(1, ""));
    }
    static void _list(){
        ArrayList<Integer> m = new ArrayList<>();
        Collections.addAll(m,1,2,3,4,0,5,6);
        System.out.println(m);
        int min = Collections.min(m);
        System.out.println(min);
    }

    public static void main (String[] args){

        //_map();
        _list();
    }
}
