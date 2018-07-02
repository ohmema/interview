import java.util.HashSet;
import java.util.Set;

public class Combination {

	public static void main(String[] args) {
		String s = "123";
		Set<String> set = new HashSet<String>();
		combination(s, new StringBuffer(), set, 0);
		set.add(null);
		for (String i : set) {
			System.out.print(i + " ");
		}
	}

	public static void combination(String s, StringBuffer sb, Set<String> set,
			int k) {
		set.add (sb.toString());
	//	System.out.print(sb + " ");
		if(k == s.length())
		{
				return;
		}
		
		for (int i = k; i< s.length(); i++)
		{
			sb.append(s.charAt(i));
			combination(s, sb, set, i+1);
			sb.setLength(sb.length()-1);
		}
		
	}

}
