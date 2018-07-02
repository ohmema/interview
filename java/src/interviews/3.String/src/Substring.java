import java.util.Hashtable;
import java.util.Stack;
import java.util.StringTokenizer;


public class Substring {
	public enum SELECTION {SUB, NONREPEAT, REMOVECH, REVERSEWORD, PRSEINT,INTTOSTRING}
	//public static final int SELECTION = 1;
	
	public static boolean isSubstring(String s1, String s2)
	{
		String big = null, small=null;
		boolean result=false;
		
		if(s1.length()-s2.length() < 0){
			big = s2;
			small =s1;
		}
		else
		{
			big=new String(s1);
			small=new String(s2);		
		}
		
		int big_len=big.length(), small_len=small.length();
			
		for(int i=0;i<big_len-small_len+1;i++){			
			String tmp=big.substring(i, i+small_len);	
				if(tmp.equals(small))
						result=true;		
		}
		return result;
	}
	
	public static void nonRepeatableChars(String word){
		//char[] chars=word.toCharArray();
		int[] alphabet = new int[26];
		
		for(int i=0;i < alphabet.length;i++)
				alphabet[i]=0;			
		for(int i=0;i<word.length();i++)
			alphabet[word.charAt(i)-'a']++;
	
		System.out.printf("Input String is \"%s\" \n",word);

		for(int i=0;i<alphabet.length;i++)
		{
			if(alphabet[i]==1)
				System.out.printf("%c ", i+'a' );
		}
		System.out.println();
	}
	
	public static void nonRepeaatableChars_hash(String word)
	{
		Hashtable hash = new Hashtable();
		for(int i = 0;i<word.length();i++){
		
			Character a = new Character(word.charAt(i));
			Integer num = (Integer)hash.get(a);
			if( num != null){
				hash.put(a, new Integer(num.intValue()+1));
			}
			else
				hash.put(a, new Integer(1));
		}
			
		for(int i = 0;i<word.length();i++){
				Character c = new Character(word.charAt(i));
				if(((Integer)hash.get(c)==1))
					System.out.printf("%c ", c );
			}
					
			System.out.println();
	}
	
	public static void removeChars(String chs){
		
	}
	
	public static void reverseWord(String string){
		StringTokenizer st = new StringTokenizer(string);
		System.out.printf("%s \n",string);
		Stack stack= new Stack();
		while(st.hasMoreTokens()){
			stack.push(st.nextToken());
		}
		
		while(!stack.empty()){
			String s =(String)stack.pop();	
			System.out.printf("%s ", s);
	
		}
	}
	
	public static Integer parseInt(String nu){
		char[] ch = nu.toCharArray();
		int num =0;
		
		
		for(int i=0;i<ch.length;i++){
			num*=10;
			num+=ch[i]-'0';
		}
		return num;
	}
	
	public static String intToString(int nu){
		char[] tmp =new char[10];
		int len =0;
		while (nu !=0){
		 tmp[len++]=(char)(nu%10 +'0');	
			nu/=10;
			
		}
		
		//This does not work;
		//return tmp.toString();
		String s = "";
		for(int j=len-1 ;j>=0;j--)
			s+=tmp[j];
		return s;
	}
	public static void main(String[] args) {
		SELECTION sel = SELECTION.INTTOSTRING;
		if(sel  ==  SELECTION.SUB)
		{
			String s1="asdsafsadsfsdsd";
			String s2="sdsd";
			if(isSubstring(s1,s2))
				System.out.printf("\"%s\" and \"%s\" are substring\n",s1,s2);
			else
				System.out.printf("\"%s\" and \"%s\" are not substring\n",s1,s2);
			System.out.println();
			s1="heelo ssas as ddsd";
			s2=" as";
			if(isSubstring(s1,s2))
				System.out.printf("\"%s\" and \"%s\" are substring\n",s1,s2);
			else
				System.out.printf("\"%s\" and \"%s\" are substring\n",s1,s2);
		}
		
		if(sel ==  SELECTION.NONREPEAT)
		{
			
			String word ="asjkasfgsadgfao";
			nonRepeatableChars(word);
			 nonRepeaatableChars_hash(word);
		}
		
		if(sel ==  SELECTION.REVERSEWORD)
		{
			String sen = "Here is some code that shows you how to use the Day enum defined above: "; 
			reverseWord(sen);
		}
		
		
		if(sel ==  SELECTION.PRSEINT)
		{
			String sen = "12345";
			System.out.printf("String %s \n",sen);
			System.out.printf("int %d \n",parseInt(sen));
			Integer.toString(13);
			Integer.parseInt("13");
		}
		if(sel ==  SELECTION.INTTOSTRING)
		{
			int sen = 12345;
			System.out.printf("int %d \n",sen);
			System.out.printf("String %s \n",intToString(sen));
			Integer.toString(13);
			Integer.parseInt("13");
		}
		
	}

}
