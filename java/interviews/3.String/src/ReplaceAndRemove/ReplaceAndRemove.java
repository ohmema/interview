package ReplaceAndRemove;

public class ReplaceAndRemove {

	public static void main(String[] args) {
		String txt = "hello is is replace and remove interview questiona";
		
		System.out.println(remove(txt));
		System.out.println(replace(txt));
	}
//	remove characters
	public static String remove(String txt)
	{
		int write_index = 0, numOfA = 0;
		char[] array = txt.toCharArray();
		for(int i =0; i<txt.length();i++)
		{
			array[write_index] = array[i];
			if(txt.charAt(i) != 'i')
				write_index++;
			else
				numOfA++;
		}
		return new String(array,0,txt.length()-numOfA);
	}
	//replace 'a' -->"bb"
	public static String replace(String txt)
	{
		int write_index = 0, numOfA = 0;
		
		for(int i =0;i<txt.length();i++)
		{
			if(txt.charAt(i) == 'a')
				numOfA++;
		}
		
		char[] replaceArray = new char[txt.length()+numOfA];
		write_index = txt.length() -1 +numOfA;
		for(int i = txt.length() -1; i >= 0 ;i--)
		{
			if(txt.charAt(i)== 'a')
			{
				replaceArray[write_index--] = 'b';
				replaceArray[write_index--] = 'b';
			}
			else
			replaceArray[write_index--] = txt.charAt(i);
			
		}
		return new String(replaceArray);
	}
}
