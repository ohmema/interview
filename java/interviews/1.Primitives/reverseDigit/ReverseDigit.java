package reverseDigit;

public class ReverseDigit {

	public static void main(String[] args) {
		
		int a  = 1234;
		
		System.out.format("The number is %d --> reversed %d\n", a, reverseInt(a));
		
		a = -1233;
		
		System.out.format("The number is %d --> reversed %d\n", a, reverseInt(a));
		// -22%10 -->-2 -22/10 = -2
		System.out.format("The number is %d --> %d %d\n", a, a%10, a/10);
	}
	
	public static int reverseInt(int x)
	{
		
		if(x == 0 )
			return 0;
		int result = 0;
		
		
		while(x != 0)
		{
			result *=10;
			int a = x%10;
			x /=10;
			result += a;
		}
		return result;
	}

}
