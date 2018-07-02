import java.util.ArrayList;


public class PP {

	public static void main(String[] args) {
//		ArrayList<String> al = new ArrayList();
//		al.add("a");
//		al.add("b");
//		al.add("c");
//		al.add("d");
//		al.add("e");
//		al.add("f");
//		System.out.println(al.get(2));


	     String c = "0qwewe1*%&*2!3a!4dsf5gwe6gw7gw8gge234&*%^$#@#@9";//.substring(0,10);
	     String d = "0123456789".substring(0, 5);
	     System.out.println(c.replaceAll("[^\\d|-]", " "));
	     System.out.println(d);
	     if("Aaa".matches("\\w+"))
	     {
	    	 System.out.println("Matches");
	     }
	     
	     System.out.println("abcde".substring(5,5));
	}

}
