package language.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

class Rflection1 {

    static void dd(){
        System.out.println("reflection1");
    }
    public static void main(String[] args) throws ClassNotFoundException
    {
        Rflection1 r = new Rflection1();
        System.out.println(Rflection1.class.getSimpleName());
        System.out.println(r.getClass().getSimpleName());
        System.out.println(Class.forName("language.reflection.Rflection1").getSimpleName());
        Class<?> superclass = r.getClass().getSuperclass();
        System.out.println(superclass);
        System.out.println(Arrays.toString(r.getClass().getInterfaces()));
        Method[] me = r.getClass().getMethods();
        for (Method m : me)
            System.out.println(m.getName());
        System.out.println(Arrays.toString(me));

        try {
            Class<?> c = Class.forName("language.reflection.Rflection1");
            Object t = c.newInstance();
            Method m = r.getClass().getMethod("dd");
            m.invoke(t);

        }catch(NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
