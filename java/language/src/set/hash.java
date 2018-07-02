package language.set;

import java.util.HashSet;
import java.util.Objects;

public class hash {
    String name;

    public hash(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        hash h = (hash)obj;
        return h.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        //Both are o.k. But you an do --> Objects.hash(name, weight, age);
        //return this.name.hashCode();
        return Objects.hash(name);
    }

    public static void main(String[] args){
        HashSet<hash> set = new HashSet();

        set.add(new hash("asasas"));
        set.add(new hash("asasas"));
        set.add(new hash("asasas"));

        for(Object s : set){
            hash ss = (hash)s;
            System.out.println(ss.name);
        }
    }


}
