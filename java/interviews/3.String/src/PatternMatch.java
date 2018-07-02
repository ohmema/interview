
public class PatternMatch {

	public static void main(String[] args) {
		String pattern = "e*d*";
		String word = "eede";
		
		boolean b =  isPattermMatched(pattern, word);
		
		if(b)
			System.out.println(pattern+ " "+ word + " is matched" );
		else
			System.out.println(pattern+ " "+ word + " is not matched" );
	}

	static boolean isPattermMatched(String pattern, String word)
	{
		if(pattern == null && word == null)
			return true;
		if(pattern == null || word == null)
			return false;
		
		int patternIndex =0;
		char lastchar = '.', p = ' ', temp;
		int i=0;
		for(i =i; i<word.length();i++)
		{
			if(patternIndex == pattern.length())
				return false;
			p = pattern.charAt(patternIndex);
			temp = word.charAt(i);
			if(p != '*')
			{
				lastchar = p;
			}
			if(p == '.')
			{
				if(Character.isLetter(temp))
				{
					patternIndex++;
				}
				else
					return false;
			}
			else if( p =='*')
			{
				if(lastchar == '.') 
				{
					if(!Character.isLetter(temp))
						return false;
				}
				else
				{
					if(lastchar != temp)
					{
						patternIndex++;
					}
				}
					
			}
			else
			{
				if(p!= temp)
					return false;
				else
					patternIndex++;
			}
		}
		
		System.out.println( patternIndex + " " + i);
		if(patternIndex == pattern.length())
			return true;
		else
		{
			for(i =	patternIndex+1 ; i<pattern.length();i++)
			{
				if(pattern.charAt(i) == '*')
					continue;
				else if(i != pattern.length() && pattern.charAt(i+1)== '*')
					i++;
			}
			return true;
		}
	}
}
