package language.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class _sortedSet {

    static Set _setA(){
        return new TreeSet(Arrays.asList(4,5,66,1));
    }

    static Set _setB(){
        return new TreeSet(Arrays.asList(48,85,86,67,38,29));
    }
    static boolean isSubset(TreeSet a, TreeSet b){
        return a.containsAll(b);
    }

    static void intersection(TreeSet a, TreeSet b){
        //return a.retainAll(b);
        a.retainAll(b);
    }

    static void ex(){
        TreeSet a = (TreeSet) _setA(), b = (TreeSet) _setB();
        System.out.println(a.last());
        System.out.println(a.first());
        System.out.println(a);


    }
    static void add_null(){
        TreeSet a = new TreeSet();
        try {
            a.add(null);
            a.add(null);
        }catch (NullPointerException e){
            System.out.println("Exception adding null to SortedSet");
        }
        System.out.println(a);
    }

    public static void main(String[] args){
        TreeSet a =  (TreeSet) _setA();
        TreeSet b =  (TreeSet) _setB();
        System.out.println(a);
        System.out.println(b);

        System.out.println(isSubset((TreeSet) _setA(),(TreeSet) _setB()));
        intersection(a , (TreeSet) _setB());
        System.out.println(a);

        add_null();

        ex();
    }
}
