package language.generic;

import java.util.Arrays;

class Gen <T extends Comparable<? super T>>{
    public static <T> T[] some(T... a){
        Arrays.sort(a);
        return a;
    }

    public static <T> T[] array(T... a){
        System.out.println(a.getClass() );
        return a;
    }
    public static void main(String[] args)
    {
        Integer[] in = Gen.some(3,4,5,6);

        for(int i =0 ; i < in.length; i++){
            System.out.println(in[i]);
        }
        System.out.println("###########################");

        Integer[] n = Gen.array(1,2,3,4);

        for(int i =0 ; i < n.length; i++){
            System.out.println(n[i]);
        }

    }

}


