package language.stringBuilder;

public class _StringBuilder {

    public static void main(String[] args) {
        p1();
    }

    static void p1(){
        StringBuilder s = new StringBuilder("hello String Builder");
        StringBuilder rs = s.reverse();
        System.out.println(s);

        s.insert(0, "heelo again ");
        System.out.println(s);

    }
}
