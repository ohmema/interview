package language.inheritance;

public class A {
    public String av = "A.av";

    public A(){
        System.out.println("A constructior");
    }

    public void ma(){
        System.out.println("A.ma()");
    }
}

class B extends A {
    public String av ="B.av";

    public B(){
        System.out.println("B constructior");
    }


    @Override
    public void ma(){
        System.out.println("B   B.ma()");
    }

    public void mb(){
        System.out.println("B.mb()");
    }
}

class M{
    public static void main(String[] args){
        A a = new B();
        a.ma();
        //a.mb(); #Compile Error
        ((B)a).mb();
        System.out.println(a.av);
        System.out.println(((B)a).av);


    }
}
