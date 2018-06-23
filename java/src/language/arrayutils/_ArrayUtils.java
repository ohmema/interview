package language.arrayutils;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * ArrayUtils  Operations on arrays, primitive arrays (like int[]) and primitive wrapper arrays (like Integer[]).
 * Need to becarefull int[] and Integer[], repectively 0, null for default values.
 */
class _ArrayUtils {

    static void ArrayUtils_add(){
        String[] words = {"Hello", "world"};
        //ArrayUtils.add: Copies the given array and adds the given element at the end of the new array.
        words = ArrayUtils.add(words,"5");
        System.out.println(Arrays.toString(words));


        if (ArrayUtils.contains(words, "Hello")){
            System.out.println("Words contains \"Hello\"");
        }

        ArrayUtils.reverse(words);
        System.out.println(Arrays.toString(words));
    }

    static void ArrayUtils_contains(){
        String[] words = {"Hello", "world"};

        if (ArrayUtils.contains(words, "Hello")){
            System.out.println("Using ArrayUtils.contain(primetive_array, element) works");
        }
    }

    static void ArrayUtils_reverse(){
        String[] words = {"Hello", "world"};

        ArrayUtils.reverse(words);
        System.out.println(Arrays.toString(words));
    }

    static int[] ArrayUtils_toPrimitive(ArrayList<Integer> alist){
        return ArrayUtils.toPrimitive(alist.toArray(new Integer[alist.size()]));
    }

    public static void main(String[] args){
        ArrayUtils_add();
        ArrayUtils_contains();
        ArrayUtils_reverse();
        int[] int_array_primitive = ArrayUtils_toPrimitive(new ArrayList<Integer>(Arrays.asList(0,1,2,3,4)));
        System.out.println(String.format("Changing arraylist to primitive int[]: %s",Arrays.toString(int_array_primitive)));

    }





}