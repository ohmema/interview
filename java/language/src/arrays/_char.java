package language.arrays;

public class _char {
    public static void main(String[] args) {
        p1();
    }

    static void p1(){
        char[] chrs = {'1', 'a','F',' '};
         if (Character.isAlphabetic(chrs[1])){
             System.out.println(String.format("%c is an alphabet",chrs[1]));
         }

        if (Character.isAlphabetic(chrs[1]))
            System.out.println(String.format("%c is an alphabet",chrs[1]));

        if (Character.isDigit(chrs[0]))
            System.out.println(String.format("%c is a digit",chrs[0]));

        if (Character.isLetter(chrs[2]))
            System.out.println(String.format("%c is a letter",chrs[2]));

        if (Character.isLetter(chrs[3]))
            System.out.println(String.format("%c is a letter",chrs[3]));

        if (Character.compare('a','a') == 0)
            System.out.println("'A' == 'a'");


        if (Character.isLetterOrDigit(chrs[0]))
            System.out.println(String.format("%c is letterOrDigit ", chrs[0]));

        if (Character.isWhitespace(chrs[3]))
            System.out.println(String.format("%c is a whilespace",chrs[3]));

        if (Character.toUpperCase('a') == 'A')
            System.out.println("A is uppcase");

    }
}
