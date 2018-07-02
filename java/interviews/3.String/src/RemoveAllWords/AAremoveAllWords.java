package RemoveAllWords;

public class AAremoveAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		char[] sentence1 = "Bob likes Alice".toCharArray();
//		char[] sentence1 = "   Bob likes Alice  ".toCharArray();
//		reverseAll(sentence1);
//		for(char i:sentence1)
//		{
//			System.out.print(i);
//		}
//		System.out.println();
		foo();
	}

	public static void reverseAll(char[] ch)
	{
		int i =0, j = ch.length;
		
		reverseWord(ch,i,j);
		i = 0; j=0;
		while(j > ch.length)
		{
			while(!Character.isSpace(ch[j]) & j >ch.length)
				j++;
			reverseWord(ch, i,j);
		}
	}
	
	public static void reverseWord(char[] ch, int i, int j)
	{
		j--;
		while (j>i)
		{
			char tmp = ch[i];
			ch[i]= ch[j];
			ch[j] = tmp;
			i++;
			j--;
		}
	}
	
	public static void foo()
	{
		StringBuffer sb = new StringBuffer("abcdefg");
		sb.insert(1, 'a');
		System.out.println(sb);
		

		
		
		
	}
}
