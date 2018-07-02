package language.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class _set {

    static Set _setA(){
        return new HashSet(Arrays.asList(1,2,3,4));
    }

    static Set _setB(){
        return new HashSet(Arrays.asList(4,5,6,7,8,9));
    }
    static boolean isSubset(HashSet a, HashSet b){
        return a.containsAll(b);
    }

    static void intersection(HashSet a, HashSet b){
        //return a.retainAll(b);
        a.retainAll(b);
    }

    static void add_null(){
        HashSet a = new HashSet();
        a.add(null);
        a.add(null);
        System.out.println(a);
    }

    public static void main(String[] args) {
        setEquals_test();
    }
    public static void setEquals_test(){
        HashSet s = new HashSet(Arrays.asList(1,2,3,4,3));
        HashSet s1 = (HashSet)s.clone();
        if (s == s1)
            System.out.format("equals");

        if(s.equals(s1))
            System.out.format("elements equals");
    }
    public static void p1(){

        HashSet a =  (HashSet) _setA();
        HashSet b =  (HashSet) _setB();
        System.out.println(a);
        System.out.println(b);

        System.out.println(isSubset((HashSet) _setA(),(HashSet) _setB()));
        intersection(a , (HashSet) _setB());
        System.out.println(a);

        add_null();
    }
}
