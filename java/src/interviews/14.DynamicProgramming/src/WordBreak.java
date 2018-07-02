import java.util.ArrayList;


public class WordBreak {

	static boolean isWord(String word)
	{
	    String[] dictionary = {"mobile","samsung","sam","sung","man","mango",
	                           "icecream","and","go","i","like","ice","cream"};
	    int size = dictionary.length;
	    for (int i = 0; i < size; i++)
	        if (dictionary[i].equals(word) )
	           return true;
	    return false;
	}
	static ArrayList<String> wordBreak(String str, StringBuffer sb, ArrayList<String> list)
	{
		if(str.length() ==0)
		{		
			list.add(sb.toString());
			return list;
		}
		
		for(int i =0; i < str.length()+1;i++)
		{
			if(isWord(str.substring(0,i)))
			{
					sb.append( " " + str.substring(0,i));
					list= wordBreak(str.substring(i,str.length()),sb, list   );
					sb.setLength( sb.length() - str.substring(0,i).length()-1);
			}
		}
		return list;
	}
	
	static void PrintWordBreak(String str, StringBuffer sb)
	{
		if(str.length() ==0)
		{		
			System.out.println(sb.toString());
			return;
		}
		
		for(int i =0; i < str.length()+1;i++)
		{
			if(isWord(str.substring(0,i)))
			{
					sb.append( " " + str.substring(0,i));
					PrintWordBreak(str.substring(i,str.length()),sb);
					sb.setLength( sb.length() - str.substring(0,i).length()-1);
			}
		}
		return ;
	}
	
	
	static void printArray(ArrayList<String> list)
	{
		if(list == null)
			System.out.println("null");
		for(String s:list)
		{
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "samsungandmango";
		ArrayList<String> l;
		l = wordBreak(s,new StringBuffer(),  new ArrayList<String>());
		printArray(l);
//		 PrintWordBreak(s, new StringBuffer());
		
//		System.out.println(s.substring(3,3).length());
	}

	
}
