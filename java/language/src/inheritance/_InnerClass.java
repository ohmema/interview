package language.inheritance;

class Outer {
    public class Inner {
        void print(){
            System.out.println("Inner");
        }
        //static  void p() {
        //    System.out.println("Inner");
        //}
    }

    public static class sInner{
        static void print(){
            System.out.println("sInner static print");
        }
        void p(){
            System.out.println("sInner p");
        }
    }

    public static void main(String args[]) {
       Outer o = new Outer();
       Outer.sInner.print();
       Inner i = (new Outer()).new Inner();
       i.print();
    }

}