package language.stringBuilder;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

class Sb {
    Sb() {
    }

    public static void main(String[] var0) {
        p2();
    }
    static void p2(){
        System.out.println(String.valueOf(100));
        System.out.println(Integer.parseInt("100"));
    }
    static void p1(){
        StringBuilder var1 = new StringBuilder();
        var1.append("Hello");
        var1.insert(0, "cc ");
        var1.deleteCharAt(3);
        var1.delete(3, 5);
        System.out.println(var1);
        String[] var10000 = new String[]{"sasa", "sss"};
        Object var3 = null;
        var10000 = new String[]{"sss", "sss"};
        String[] var0 = new String[]{"34.1", "14"};
        String[] var4 = var0;
        int var5 = var0.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String var7 = var4[var6];
            System.out.println(Double.parseDouble(var7));
        }

        Sb.Color var8 = Sb.Color.RED;
        if (var8 == Sb.Color.GREEN) {
            System.out.println(var8);
        }

    }

    static enum Color {
        RED,
        BLUE,
        GREEN;

        private Color() {
        }
    }
}
