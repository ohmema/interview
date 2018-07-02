package randomNumber;

import java.util.Random;

/*
	How would you implement a random number generator that generate a random integer i between a and b, inclusive, 
	given a random number generator that produces either 0 or 1 with equal probability 
	
	
	---I did not finish because it is harder than I though 
	---Come back later and solve it. 
	-- Answer is 5.12 Elements of programming interview.
*/
public class RandonNumber {

	public static void main(String[] args) throws Exception {
		
		int a = 5, b=10;
//		System.out.format("%d %d -random is %d\n", a , b, random(a, b));
		
		int[] ave= new int[b+1];
		Random random = new Random();
		for(int i = 0 ;i <1000; i++)
		{
			ave[random(a, b)]++;
			ave[random.nextInt(b)]++; //exclusive b
//			System.out.format("%d\n", System.currentTimeMillis());
		}
		
		display(ave, 0,b);
	}
	
	public static int random(int a, int b) throws Exception
	{
		if (a >= b || a < 0)
			throw new Exception("Error");
		
		Random random = new Random();
		int max = b-a +1;
		int num = random.nextInt(max)+a;
		return num;
	}

	public static void display(int ave[], int a, int b)
	{
		for(int i = a ;i <=b ;i++)
		{
			System.out.format("%d -- %d\n", i,ave[i] );
		}
	}
}
