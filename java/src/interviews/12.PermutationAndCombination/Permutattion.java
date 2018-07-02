import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
//This is permutation for String.
//  T(N) = NT(N-1)O(N!)
public class Permutattion {

	public static void main(String[] args) {
		String s = "1234";

		Set<String> set = new HashSet<String>();

		//permutation2(s, 0, new HashSet<Character>(), new StringBuffer(), set);
		permutation3(new StringBuffer(s), 0, set);
		for (String i : set) {
			System.out.print(i + " ");
		}
	}
	// this is for 111, 112, 113, 123, 132, 222 ,333 .....
	public static void permutation1(String s, int k, StringBuffer sb,
			Set<String> set) {

		if (k == s.length()) {
			set.add(sb.toString());
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			permutation1(s, k + 1, sb, set);
			sb.setLength(sb.length() - 1);

		}
	}

	//this is Permutation 123 -> 123, 132, 213, 231, 321, 312 
	public static void permutation2(String s, int k, Set<Character> skip, StringBuffer sb,
			Set<String> set) {

		if (k == s.length()) {
			set.add(sb.toString());
			return;
		}

		for (int i = 0; i < s.length(); i++) {
			if (!skip.contains(s.charAt(i))) {
				sb.append(s.charAt(i));
				skip.add(s.charAt(i));
				
				permutation2(s, k + 1, skip, sb, set);
				sb.setLength(sb.length() - 1);
				skip.remove(s.charAt(i));
			}
		}
	}
	
	//This Permutation is same as Array Permutation
	public static void permutation3(StringBuffer sb, int k, Set<String> set)
	{
		if(k  == sb.length())
		{
			set.add(sb.toString());
			return;
		}
			
		
		for(int i =k ;i < sb.length();i++)
		{
			swap(sb,k,i);
			permutation3(sb,k+1, set);
			swap(sb,i,k);
		}
	}
	
	public static void swap(StringBuffer sb, int i , int j)
	{
		char temp = sb.charAt(i);
		sb.setCharAt(i, sb.charAt(j));
		sb.setCharAt(j, temp);
	}
}
