package Facebook;

import java.util.HashSet;
import java.util.Set;

//'121' -->ABA, MA, AW
public class CombinationOfLetter {
	char[] letter = {'A', 'B', 'C', 'D', 'E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
			public static void main(String[] args) {
				String s = "1234";
				Set<String> set = new HashSet<String>();
				insertSpace(s, new StringBuffer(), 0, set);
				for (String i : set) {
					System.out.println(i);
				}

	}

	public static void insertSpace(String s, StringBuffer sb, int k, Set<String> set)
	{
		if(k == s.length()){
			set.add(sb.toString());
			return;	
		}
			
		sb.append(s.charAt(k));
		insertSpace(s, sb, k+1, set);
		if (k != s.length()-1)
		{
			sb.append(" ");
			insertSpace(s, sb, k+1, set);
			sb.setLength(sb.length()-2);
		}
		else
			sb.setLength(sb.length()-1);
		
	}
}
