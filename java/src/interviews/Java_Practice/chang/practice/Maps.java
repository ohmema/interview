package chang.practice;
import java.util.*;

public class Maps {
	public static void main(String[] args) {
		test_hashMap();
		
	}
	public static void test_hashMap()
	{
		Map<String, Integer> m = new HashMap<String,Integer>();
		
		m.put("s", 123);
		m.put("a", 13);
		m.put("v", 3);
		m.put("b", 12343);
		
		Set<String> keys = m.keySet();
		
		for(String key:keys)
		{
			System.out.println(m.get(key));
		}
	}
}
