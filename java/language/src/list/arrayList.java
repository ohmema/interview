package language.list;
import java.util.*;
import java.util.List;
//import org.junit.Assert.assertTrue;

class arrayListP {

    static void arrayList(){


        //ArrayList<String>  listP = new ArrayList<String>();
        //List listP = new ArrayList<String>();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("1", "2", "3"));
        list.add("a");
        list.add(0,"b");

        list.set(0, "c");
        list.remove(0);
        list.add("d");
        list.add(0, "c");
        list.add(0, "b");
        list.set(0, "a");

        //assertTrue(true);
        //assertTrue(listP.contains("a") );
        //assertEquals(Collections.binarySearch(listP,"a"), 0);


        Collections.sort(list);
        System.out.println(list );
        Collections.reverse(list);
        System.out.println(list );

        ArrayList<String> copied = (ArrayList<String>)  ((ArrayList<String>) list).clone();

        System.out.println(copied.equals(list));


        list.set(0 , "aaa");
        copied.set(0,"assas");
        System.out.println(list );
        System.out.println(copied );

        copied.add(0,"assas");
        copied.add(0,"a");
        copied.add(0,"assas");
        List<String> sub = copied.subList(1, 4);
        System.out.println(sub);

        sub.remove("a");
        System.out.println(sub);
        System.out.println("################");
        list.add("z");
        list.add("z");
        System.out.println(list);
        System.out.println("################");
        HashSet<String> h = new HashSet<>(list);
        //HashSet<Integer> h = new HashSet<>((List)listP);
        System.out.println(h.toString());

        ArrayList<String> no_dups = new ArrayList<>(h);
        System.out.println(no_dups);
        //try {
        //    ArrayList<int> a = new ArrayList<int>();
        //}catch (Exception e){}

    }

    public static void main(String[] args){
        //System.out.println("ArrayList");
        //arrayList();
        p1();
    }


    static void p1(){
        ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,45, 6,89));

        List s = a.subList(1,4);
        try {
            s.remove(89);
        }catch (Exception e){System.out.println("No index 89 to be removed");}
        s.remove(Integer.valueOf(89));

        if (!s.contains(89)){
            System.out.println("89 was not contained");
        }

        Object[] i_a = a.toArray();

        //Error
        //int[] copied1 = new int[a.size()];
        //a.toArray(copied1);

        Integer[] copied = new Integer[a.size()];
        a.toArray(copied);

    }

}


