package RegularExpression;

public class RegularExpreesion {

	public static void main(String[] args) {
//		String txt ="dog";
//		String pattern = "**dog";
		String txt ="dog";
		String pattern = "*dog*";
//		String txt ="ddoggggpigddff";
//		String pattern = "ddoggggpigddff";
		System.out.printf("txt = %s  pattern = %s  isMatch: %b\n", txt, pattern,isMatch(txt,pattern));
	}

	static boolean isMatch(String s, String pattern) {
		StringBuffer sb = new StringBuffer();
		int i =0;
		while(i < pattern.length())
		{
			//make input as valid pattern format
			sb.append(pattern.charAt(i));
			if(pattern.charAt(i) == '*'){
				while(i < pattern.length() && pattern.charAt(i) == '*')
					i++;
			}
			else
				i++;
		}
//		System.out.printf(" txt = %s  pattern = %s \n", s, sb.toString());
		return isMatch(s, 0, sb.toString(), 0);
	}

	static boolean isMatch(String txt, int t_index, String pattern, int p_index) {
		if (t_index == txt.length() && p_index == pattern.length()) //All matches return true
			return true;
		if (t_index < txt.length() && p_index == pattern.length()) //txt has left and pattern all consumed
			return false;
		if (t_index <= txt.length() && p_index == pattern.length() - 1 //txt has all consumed, patterns has only * left
				&& pattern.charAt(p_index) == '*')
			return true;
		else if (t_index == txt.length() && p_index < pattern.length() - 1) // txt has all consumed, patterns has left except "*"
			return false;

		switch (pattern.charAt(p_index)) {
		case '*':
//			int start =p_index;
//			while(start < pattern.length() && pattern.charAt(start)=='*')  //For the test cases of txt = dog  pattern = **dog -->false
//				start++;
			String word = getNextWord(pattern, p_index);
//			System.out.printf("t_index = %d  pattern = %s index = %d word = %s \n",t_index,pattern,p_index, word);
			if(word.length()> txt.length()-t_index)//Need to consider////
				return false;
			if (txt.substring(t_index, t_index + word.length()).equals(word))
				return isMatch(txt, t_index + word.length(), pattern, p_index
						+ 1 + word.length());  //For the how many * --(start-p_index)
			else
				return isMatch(txt, t_index + 1, pattern, p_index);

		default:
//			System.out.printf("t_index = %d  pattern = %s index = %d \n",t_index,pattern,p_index);
			if (txt.charAt(t_index) == pattern.charAt(p_index))
				return isMatch(txt, t_index + 1, pattern, p_index + 1);
			else
				return false;
		}
	}

	static String getNextWord(String pattern, int p_index) {
		
//		if(p_index == pattern.length())
//			return "";
//		
//		for (int i = p_index+1; i < pattern.length(); i++) {
//			if (pattern.charAt(i) == '*')
//				return pattern.substring(p_index+1, i);
//		}
//		return "";
		//either * or end of string length
		int start = p_index+1, end = p_index+1;
		if(start == pattern.length())
			return "";
		
		while(end < pattern.length() && pattern.charAt(end)!= '*')
			end++;
		return pattern.substring(start,end);
	}
}
