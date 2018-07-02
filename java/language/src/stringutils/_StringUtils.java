package language.stringutils;

import org.apache.commons.lang3.StringUtils;

class _StringUtils {

    static void StringUtils_jojn(){
        // join(Object[] array, String separator)
        String sentence = StringUtils.join(new String[]{"Hello", "World"}, " ");
        System.out.println(sentence);
        //join(char[] array, char separator)
        sentence = StringUtils.join(new char[]{'1', '2', '3'}, ' ');
        System.out.println(sentence);
        //join(int[] array, char separator)
        sentence = StringUtils.join(new int[]{1, 2, 3}, ' ');
        System.out.println(sentence);
        //join(T... elements)
        sentence = StringUtils.join("a", "b","c");
        System.out.println(sentence);
    }

    static void StringUtils_compare() {
        if (StringUtils.compare("Hello", "Aello") > 0)
            System.out.println("StringUtils.compare(\"Hello\" , \"Aello\")");
    }
    static void StringUtils_contains(){
        if( StringUtils.contains("Helle Worlds", "Wor"))
            System.out.println("StringUtils.contains(\"Helle Worlds\", \"Wor\")");

    }
    static void StringUtils_strip(){
        String anyString = " \n  heel sdsd dsd  \n  \u0000  \n  \n   ";
        // To strip whitespace use strip(String).
        String stripedString = StringUtils.strip(anyString );
        System.out.println(anyString + " strippped " + stripedString );
        String trimmedString = StringUtils.trim(anyString);
        //Removes control characters (char <= 32) from both ends of this String, handling null by returning null.
        if(stripedString.equals(trimmedString))
            System.out.println(anyString + " strippped " + trimmedString);


    }

    public static void main(String[] args){
        StringUtils_jojn();
        StringUtils_compare();
        StringUtils_contains();
        StringUtils_strip();
    }
}