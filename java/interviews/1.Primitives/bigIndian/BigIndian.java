package bigIndian;

public class BigIndian {

	/**
	 * @param args
	 */
	
	public static boolean isBigendianess()
	{
		boolean result;
		short  i =1 ;
		byte b = (byte) (i >>> 15);
		
		if( b == 1){
			System.out.print("big indian\n");
			result =true;
		}
		else{
			System.out.print("little indian\n");
			result = false;
		}
		return result;
	}
	
	public static int numToBinary(int num){
		int val=0;
		while(num!=0)
		{
			if((num&1)==1)
				val++;
			num=num>>>1;
		}	
		return val;
	}
	
	public static void BinaryPresentation(int num){
		
		for(int i =0;i<32;i++)
		{
			//using sign Bits
			if((num&-1) < 0)
				System.out.print("1");
			else
				System.out.print("0");
			num=num<<1;
		}	
		return;
	}
	
	static void printAscii()
	{
		for(int i=10 ;i<='z';i++)
		{
			System.out.print((char)i);
			if(i%10 ==0)
				System.out.println();
		}
	}
	
	public static int reverseBinary(int num){
		int reverseInt =0;
		for(int i =0;i<32;i++)
		{
			if((num&1) == 1)
				reverseInt = reverseInt|1;
			if(i != 31)
				reverseInt = reverseInt <<1;
			num= num >>> 1;
		}	
		return reverseInt;
	}
	
	static void printBinary(int m)
	{
		int reverseInt = reverseBinary(m);
		for(int i = 0;i<32;i++)
		{
			if((reverseInt&1) == 1)
				System.out.print("1");
			else
				System.out.print("0");
			reverseInt =reverseInt >> 1;
		}
		System.out.println();
		return;
	
	}
	public static void main(String[] args) {
		int val=1;
		
		for( int i = 0; i>= -20 ;i--)
		{
			System.out.println(Long.MAX_VALUE );
			printBinary(-i);
			System.out.print("\t");
			printBinary(i);
		}
//		printAscii();

	}
}