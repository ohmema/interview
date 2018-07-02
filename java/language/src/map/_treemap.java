package language.map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

class Treemap {

    static void _treemap(){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1,"ss");
        map.put(1,"aa");
        map.put(3,"aa");
        map.put(56,"zz");
        map.put(10,"aaa");

        for (Map.Entry m : map.entrySet() ){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        for (int m : map.keySet() ){
            System.out.println(m);
        }
        for (String m : map.values() ){
            System.out.println(m);
        }

        System.out.println(map);
        System.out.println("################################");
        NavigableMap<Integer, String> sortedMap = map.descendingMap();

        for (Map.Entry m : sortedMap.entrySet() ){
            System.out.println(m.getKey() + " : " + m.getValue());
        }

        SortedMap<Integer, String> sub = map.subMap(2, 30);
        System.out.println("################################");
        for (Map.Entry m : sub.entrySet() ){
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }
    public static void main (String[] args){

        _treemap();
    }
}
