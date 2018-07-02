
public class TelephoneToWord {
	static final char[][] Words = { { '0', '0', '0' }, { '1', '1', '1' },
			{ 'A', 'B', 'C' }, { 'D', 'E', 'f' }, { 'g', 'H', 'I' },
			{ 'J', 'K', 'L' }, { 'M', 'N', 'o' }, { 'P', 'R', 'S' },
			{ 'T', 'U', 'V' }, { 'W', 'X', 'Y' } };

	public static void main(String[] args) {
		int[] phoneNumber = { 8, 0, 5, 3, 6, 8, 2 };
//		int[] phoneNumber = {6,1};
		PhoneNumberConversion(phoneNumber, new StringBuffer(), 0);
	}

	static void PhoneNumberConversion(int[] phone, StringBuffer sb, int start) {
		if (start == phone.length) {
			System.out.println(sb.toString());
			return;
		}

		if(phone[start] != 1 && phone[start]!=0)
		{
			for (int i = 0; i < 3; i++) {
				PhoneNumberConversion(phone, sb.append(Words[phone[start]][i]), start+1);
				sb.setLength(sb.length()-1);
			}
		}
		else
		{
				PhoneNumberConversion(phone, sb.append(Words[phone[start]][0]), start+1);
				sb.setLength(sb.length()-1);
		}
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
