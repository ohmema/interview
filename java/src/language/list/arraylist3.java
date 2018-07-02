import java.util.*;
import static java.lang.System.out;

class A{
    int variable =100;
    public String toString(){
        return Integer.toString(variable);
    }
}

class dd {

    public static void main(String[] args) {
        //new dd().p1();
        //new dd().p2();
        //p3();
        //p4();
        //p5();

        Object a =0, b =4;
        System.out.println((int)a+(int)b);
    }
    public static void p5(){
        HashSet s = new HashSet(Arrays.asList(1,2,3,4));
        int[][] d = {{1,2,3}, {4,5,6}, {7,8,9}};
        //for( int i =0 ; i < d.length; ++i){
        //    for(int j = 0 ; j < d[0].length; ++j){
        //        System.out.print(d[i][j]);
        //    }
        //    System.out.println();
        //}
        for(int i =0; i<d.length; ++i){
            System.out.println(Arrays.toString(d[i]));
        }

        int[] a = {1,2,3,4};
        int[] b = a.clone();
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        if(a.equals(b)){ //Object of equals only checks identities
            System.out.println("a==b");
        }

        String a1 = "a Hello";
        String a2 = "a Hello";
        if ( a1 == a2) {
            out.println(a1);
            out.println(a2);
        }

        String b1 = new String("b Hello");
        String b2 = new String("b Hello");

        if ( b1 == b2) {
            out.println(b1);
            out.println(b2);
        }
    }
    public static void p4(){
        int[] aarray = {2, 3,4,5};

        ArrayList a = new ArrayList(Arrays.asList(2,3,4,5));
        ArrayList b = new ArrayList(Arrays.asList(aarray));
        //a.add(0,"sss");
        if (a.equals(b))
            System.out.println("equals");

        if (a.equals(a.clone()))
            System.out.println("#####equals");

        if (a.equals(b))
            System.out.println("!!!!!equals");
    }

    public static void p3(){
        int a = Integer.parseInt("123");
        String s = Integer.toString(123);
        byte b = 'a';
        char c = 'a';
        long l = 111;
        float f = 3.3333F;
        double d = 33.333D;
        int i  = 343;

        if (b == c)
        {
            System.out.println("AAAAAA");
            System.out.println(String.format("%s %c","byte:", (byte)112));
            System.out.println(String.format("%s %d", "char:", (int)c));
        }
        float fz = Float.parseFloat("13.3");
        String fs = Float.toString(3.333f);

    }

    public void p2(){
        List l1 = new ArrayList(Arrays.asList(new A(), new A(), new A(), new A()));
        List l2 = (ArrayList)((ArrayList)l1).clone();
        A a = new A();
        a.variable = 100;

        l2.set(3, a);
        for (Object e : l1)
            System.out.println(e);

        System.out.println();

        for (Object e : l2)
            System.out.println(e);
    }


    public void p1(){
        List l1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        List l2 = (ArrayList)((ArrayList)l1).clone();
        l2.set(3, -100);
        for (Object e : l1)
            System.out.println(e);
        System.out.println();

        for (Object e : l2)
            System.out.println(e);
    }
    public void le(){
        List l = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        l.add(0, "First");
        l.add(l.size(), "Last");
        for (Object e : l)
            System.out.println(e);

        System.out.println();
    }
    public void se(){
        List l = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        Set s =  new HashSet(l);
        s.add(3);
        for (Object e : s)
            System.out.println(e);


        Set ss = new HashSet();

        System.out.println();

        ss.addAll(l);
        for (Object e : ss)
            System.out.println(e);
    }
}
