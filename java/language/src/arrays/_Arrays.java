package language.arrays;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
Arrays  Operations on arrays, primitive arrays (like int[])
This class contains various methods for manipulating arrays (such as sorting and searching).
 */
public class _Arrays {
    static List<Integer> Arrays_asList(Integer... vna){
        return Arrays.asList(vna);
    }

    static void Arrays_equals(){
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        if(a != b)
            System.out.println(String.format("Primitive Array Comparison: %s != %s ", Arrays.toString(a), Arrays.toString(b)));
        if (Arrays.equals(a, b))
            System.out.println(String.format("Arrays.equals(%s, %s)", Arrays.toString(a), Arrays.toString(b)));
        Integer[] c = new Integer[] {1,2,3};
        Integer[] d = new Integer[] {1,2,3};
        if (!c.equals(d))
            System.out.println(String.format("wrapper class Array Comparison: %s not equals %s ", c, d));

        if (Arrays.equals(c,d))
            System.out.println(String.format("wrapper class Array Comparison: Arrays.equals(%s, %s) ", Arrays.toString(c), Arrays.toString(d)));

        if(Arrays.equals(ArrayUtils.toObject(a),c))
            System.out.println(String.format("wrapper class Array Comparison: Arrays.equals(%s, %s) ", Arrays.toString(c), Arrays.toString(d)));
        /*
        Compile Error: type does not match
        1. if(a != c)
        2. if(Arrays.equals(a,c))
        */
    }

    static void Arrays_fill(){
        int[] a = new int[10];
        System.out.println("int default value for an array : " + Arrays.toString(a));
        Integer[] wrapper_a = new Integer[10];
        System.out.println("Integer default value for an array : " + Arrays.toString(wrapper_a));

        Arrays.fill(a, -1);
        Arrays.fill(wrapper_a, -1);
        System.out.println("after Arrays.fill(a, -1) : " + Arrays.toString(a));
        System.out.println("after Arrays.fill(wrapper_a, -1): " + Arrays.toString(wrapper_a));
    }


    static void Arrays_sort(){
        int[] a = {4, 4, 1, -4, 70};
        Integer[] wrapper_a = {3, 6, 9, -1};
        Arrays.sort(a);
        Arrays.sort(wrapper_a);
        System.out.println("after Arrays.sort(a) : " + Arrays.toString(a));
        System.out.println("after Arrays.sort(wrapper_a): " + Arrays.toString(wrapper_a));
        /*
        Sort with Comparator is Only for class not for primitives
        Arrays.sort(a, new Comparator<Object>(){ // a should br Integer
                    @Override
                    public int compare(Object a, Object b){return (int)b - (int)a; }
                });
        */
        Arrays.sort(wrapper_a , (x, y) -> y - x);

    }
    public static void main(String[] args){
        System.out.println(Arrays_asList(1,2,3,4,5));
        Arrays_equals();
        Arrays_fill();
        Arrays_sort();
    }
}
