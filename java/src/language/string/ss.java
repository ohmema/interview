class test {
    public static void main(String args[]) {
        char ch;
        String test2 = "abcd";
        String test = new String("abcd");

        if(test.equals(test2)) {
            if(test == test2)
                ch = test.charAt(0);
            else
                ch = test.charAt(1);
        }
        else {
            if(test == test2)
                ch = test.charAt(2);
            else
                ch = test.charAt(3);
        }
        System.out.println(ch);
    }
}
