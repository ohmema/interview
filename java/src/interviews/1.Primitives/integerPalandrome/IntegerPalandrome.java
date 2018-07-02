package integerPalandrome;

public class IntegerPalandrome {

	public static void main(String[] args) {

		int a = 123;	
		System.out.format("the original number is %d, reverse is %d, palandrome is %B\n", a, reverse(a), isPalandrome(a));
		a = 234432;
		System.out.format("the original number is %d, reverse is %d, palandrome is %B\n", a, reverse(a), isPalandrome(a));	
		a= 23432;
		System.out.format("the original number is %d, reverse is %d, palandrome is %B\n", a, reverse(a), isPalandrome(a));	
		a = -1200;
		System.out.format("the original number is %d, reverse is %d, palandrome is %B\n", a, reverse(a), isPalandrome(a));
		a = -23432;
		System.out.format("the original number is %d, reverse is %d, palandrome is %B\n", a, reverse(a), isPalandrome(a));
	}

	public static boolean isPalandrome(int x) {
	
		if (x == reverse(x))
			return true;
		else
			return false;
	}
	
	
	public static int reverse(int x)
	{
		int target = x, reverse = 0;

		while (x != 0) {
			reverse *= 10;
			reverse += x % 10;
			x /= 10;
		}
		return reverse;
		
	}
}
