package Palandrome;

public class Palandrome {

	public static void main(String[] args) {
		String s = "as d  ! d sa";
		if(isPalandrome(s))
			System.out.printf("\"%s\" is palandrome\n", s);
		if(isPalandrome_iter(s))
			System.out.printf("\"%s\" is palandrome\n", s);

	}
	
	static boolean isPalandrome(String s)
	{
		if(s == null || s.length() ==0)
			return false;
		return isPalandrome(s, 0, s.length()-1);
	}
	//Recursively 
	static boolean isPalandrome(String s, int start_i, int end_i)
	{
		if(start_i >= end_i)
			return true;
		
		int start = start_i, end = end_i;
		
		while(start < end && !Character.isLetter(s.charAt(start)))
			start ++;
		while(end > start && !Character.isLetter(s.charAt(end)))
			end --;
		
		if(s.charAt(start) == s.charAt(end))
			return isPalandrome(s, start+1,end-1 );
		else
			return false;			
	}

	static boolean isPalandrome_iter(String s)
	{
		int start = 0 , end = s.length()-1;
		
		while(start <= end)
		{
			while(start < end && !Character.isLetter(s.charAt(start)))
				start++;
			while(end > start && !Character.isLetter(s.charAt(end)))
				end --;
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
	
		return true;
	}
}
