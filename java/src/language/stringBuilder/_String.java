package language.stringBuilder;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class _String {
    public static void main(String[] var0) {
        p1();
    }
    static void p2(){
        System.out.println(String.valueOf(100));
        System.out.println(Integer.parseInt("100"));
    }
    static void p1(){
        String s = "  \n    So     it    needs to be made sure by some synchronization method that only one thread can access the resource at a given point of time. \n ";

        System.out.println(s.length());

        String[] ss = s.trim().split(" ");
        System.out.println(Arrays.toString(ss));

        int lastIndex = removeEmpty(ss);
        ss = ArrayUtils.subarray(ss,0, lastIndex);

        System.out.println(Arrays.toString(ss));

        //String[] sss = StringUtils.split(s.trim(), " ");
        //System.out.println(Arrays.toString(sss));

    }

    static int removeEmpty(String[] words){
        int lastNonEmptyIndex = 0, i = 0;

        while( i < words.length){
            if ( !words[i].isEmpty() ){
                String tmp = words[lastNonEmptyIndex];
                words[lastNonEmptyIndex] = words[i];
                words[i] = tmp;
                i++;
                lastNonEmptyIndex++;
            }
            else{
                i++;
            }
        }
        return lastNonEmptyIndex;
    }
}
