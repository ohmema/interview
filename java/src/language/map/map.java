package language.map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class map {

    static void _map(){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"ss");
        map.put(1,"aa");
        map.put(3,"aa");
        map.put(56,"zz");
        map.put(10,"aaa");
        map.put(null,"");
        map.put(-1,null);
        /*
        for (Map.Entry m : map.entrySet() ){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for (int m : map.keySet() ){
            System.out.println(m);
        }
        for (String m : map.values() ){
            System.out.println(m);
        }

        */
        System.out.println(map);
        System.out.println(map.get(15));
        System.out.println(map.remove(15));

    }

    static void _linkedhashmap(){
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"ss");
        map.put(1,"aa");
        map.put(3,"aa");
        map.put(56,"zz");
        map.put(10,"aaa");
        map.put(null,"");
        map.put(-1,null);
        /*
        for (Map.Entry m : map.entrySet() ){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for (int m : map.keySet() ){
            System.out.println(m);
        }
        for (String m : map.values() ){
            System.out.println(m);
        }

        */
        System.out.println(map);
        System.out.println(map.get(15));
        System.out.println(map.remove(15));

    }

    public static void main (String[] args){

        _map();
    }
}
