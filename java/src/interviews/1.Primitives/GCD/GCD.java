package GCD;

public class GCD {

	public static void main(String[] args) {
		int a = 10 ,b = 15;
		System.out.format("A = %d , B = %d, GCD1 = %d \n", a, b, getGCD1(a,b));
		System.out.format("A = %d , B = %d, recursiveGCD = %d \n", a, b, recursiveGCD(a,b));
		System.out.format("A = %d , B = %d, optimalGCD = %d \n", a, b, optimalGCD(a,b));
		
		a = 7 ;
		b = 15;
		System.out.format("A = %d , B = %d, GCD1 = %d \n", a, b, getGCD1(a,b));
		System.out.format("A = %d , B = %d, recursiveGCD = %d \n", a, b, recursiveGCD(a,b));
		System.out.format("A = %d , B = %d, optimalGCD = %d \n", a, b, optimalGCD(a,b));
		
		a = 14 ;
		b = 20;
		System.out.format("A = %d , B = %d, GCD1 = %d \n", a, b, getGCD1(a,b));
		System.out.format("A = %d , B = %d, recursiveGCD = %d \n", a, b, recursiveGCD(a,b));
		System.out.format("A = %d , B = %d, optimalGCD = %d \n", a, b, optimalGCD(a,b));
	}
	
	//O(N^2)
	public static int getGCD1 (int a, int b){
		int result =1, max = Math.min(a, b);
		
		for(int i =2; i<max;++i)
		{
			if(a%i == 0 && b%i == 0)
			{
				result *= i;
				a/=i;
				b/=i;
				--i;
			}
		}		
		return result;
	}
	
	public static int recursiveGCD(int a , int b)
	{
		int max = Math.min(a,b);
		
		for(int i = 2 ; i <= max ; ++i)
		{
			if(a%i == 0 && b%i == 0 )
			{
				return i*recursiveGCD(a/i, b/i);
			}
		}
		return 1;
	}
	//O(loga + logb)
	public static int optimalGCD(int a , int b)
	{
		if(a ==0)
			return b;
		if(b == 0)
			return a;
		
		if((a & 1) == 0 && (b & 1) == 0) 
			return optimalGCD(a>>1, b>>1) << 1;
		else if ((a & 1) == 1 && (b & 1) == 0)
			return optimalGCD(a, b>>1);
		else if ((a & 1) == 0 && (b & 1) == 1)
			return optimalGCD(a>>1, b);
		else if (a > b)
			return optimalGCD(a-b, b);
		
	return optimalGCD(a, b-a);
	}
}
