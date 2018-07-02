package language.miscellaneous;

import java.util.Map;

class System_Envornment_Properties {

    public static void main(String[] args) {
        //system_v();
        environ_v();
    }

    private static void environ_v() {
        for(Map.Entry e  : System.getenv().entrySet())
        {
            System.out.println(e.getKey() + " : " +e.getValue());
        }

        System.out.println(System.getenv("COMPUTERNAME"));
        System.out.println(System.getenv("SystemRoot"));
    }

    static void system_v(){
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("java.vendor"));
    }
}
