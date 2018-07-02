public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] array = { 'w', 'x', 'y','z' };
//		combination(array, new StringBuffer(), array.length,0);
//		combin(array, new StringBuffer(), array.length,0);
//		permutation(array,new StringBuffer(),new boolean[array.length],array.length);
	}

	static void combination(char[] s, StringBuffer sb,int length,  int start) {
		System.out.println(sb.toString());


		for (int i = start; i < length; i++) {
			sb.append(s[i]);
			combination(s, sb, length,  i+1);
			sb.setLength(sb.length() - 1);
		}
	}
	
	static void combin(char[] s, StringBuffer sb,int length, int start) {
		System.out.println(sb.toString());


		for (int i = start; i < length; i++) {
			sb.append(s[i]);
			combin(s, sb, length, start+1);
			sb.setLength(sb.length() - 1);
		}
	}
	
	static void permutation(char[] s, StringBuffer sb, boolean[] flag, int length)
	{
		if(sb.length() == s.length)
		{
			System.out.println(sb.toString());
			return;
		}
		
		for(int i =0; i<s.length;i++)
		{
//			if(flag[i] == true)
//				continue;
			sb.append(s[i]);
			flag[i] = true;
			permutation(s,sb,flag,length);
			flag[i]=false;
			sb.setLength(sb.length() - 1);
		}
		
	}
}
