package language.list;


import java.util.Arrays;

class Main {
    public static void main(String[] args){
        int[] a = {1,2,3,4};
        int[] b = Arrays.copyOf(a, a.length+10);
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(a));


        char[] ca = {'1','2','3','4'};
        char[] cb = Arrays.copyOf(ca, ca.length+10);
        System.out.println(Arrays.toString(cb));
        System.out.println(Arrays.toString(ca));

        char[] cc = new char[8];
        Arrays.fill(cc, Character.MIN_VALUE);
        System.out.println(Arrays.toString(cc));
        char x = '\u0000';
        System.out.println(x);




    }
}