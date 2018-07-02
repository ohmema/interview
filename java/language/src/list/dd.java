package language.list;


import java.util.ArrayList;
import java.util.Iterator;

class List extends ArrayList<Integer> implements Iterable<Integer>{

    public int Index =0;


    @Override
    public Iterator<Integer> iterator() {
        return null;
    }
}
class SS {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i =0 ; i < 10; ++i)
            list.add(i);

        for (int i: list)
            System.out.println(i);

    }
}
