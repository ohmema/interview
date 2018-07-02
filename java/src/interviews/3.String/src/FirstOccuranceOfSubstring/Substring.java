package FirstOccuranceOfSubstring;

public class Substring {

	public static void main(String[] args) {
		String txt = "This is my hi name hi";
		String sub = "hi";
		
		System.out.printf("\"%s\"  \"%s\" --> %d\n", txt, sub,firstSubStringIndex(txt,sub));
		System.out.printf("\"%s\"  \"%s\" --> %d", txt, sub,NumOfMachedSubString(txt,sub));

	}

	static int firstSubStringIndex(String txt, String sub)
	{
		if(txt ==null || txt.length() == 0)
			return -2;
		if(sub == null || sub.length() == 0)
			return -3;
		if(txt.length() < sub.length())
			return -4;
		
		int sub_index = 0, pivot_start = -1;
		for(int i =0; i< txt.length(); i++)
		{
			if(txt.charAt(i) == sub.charAt(sub_index))
			{
				if(sub_index ==0)
					pivot_start = i;
				sub_index++;
				
				if(sub_index == sub.length())
					return pivot_start;
			}
			else
			{
				sub_index =0;
				pivot_start =-1;
			}
		}
		return -1;
	}
	
	static int NumOfMachedSubString(String txt, String sub)
	{
		if(txt ==null || txt.length() == 0)
			return -2;
		if(sub == null || sub.length() == 0)
			return -3;
		if(txt.length() < sub.length())
			return -4;
		
		int numOfMachedString = 0, sub_index =0;
		
		for(int i =0; i < txt.length(); i++)
		{
			if(txt.charAt(i) == sub.charAt(sub_index))
			{
				sub_index++;
				if(sub_index == sub.length())
				{
					numOfMachedString++;
					sub_index = 0;
				}
			}
			else
			{
				sub_index =0;
			}
		}
		
		return numOfMachedString;
	}
}
