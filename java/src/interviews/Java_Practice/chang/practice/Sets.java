package chang.practice;
import java.util.*;
public class Sets {

	public static void main(String[] args) {
//		test_hashset();
		test_treeset();
	}
	
	public static void test_hashset()
	{
		String names[] = {"o","a","p","t","h","f","h","s","a"};
		
		Set<String> set = new HashSet<String>(Arrays.asList(names));
		
		for(String s :set)
		{
			System.out.println(s);
		}
	}
	
	public static void test_treeset()
	{
		String names[] = {"o","a","p","t","h","f","h","s","a"};
		
		Set<String> set = new TreeSet<String>(Arrays.asList(names));
		
		for(String s :set)
		{
			System.out.println(s);
		}
	}
	
}
