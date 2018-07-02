import java.util.ArrayList;


public class PlayArray {

	public static void main(String[] args) {
	int[] a = {100,-2,-3,-4,0, 20 };
//		int[] a = {-1,-2,-3,-4 };
//		int[] a = {0,0,0,0 };
		maxProductOfSequence(a);
//		maxSumOfSequence(a);
	}
	
	public static void maxSumOfSequence(int[] array)
	{
		int sum =0, ssum=array[0];
		
		for(int i =0 ; i <array.length;i++)
		{
			sum += array[i];
			if(sum < 0)
				sum =0;
			ssum = Math.max(ssum, sum);
		}
		System.out.println(ssum);
	}
	public static void maxProductOfSequence(int[] array)
	{
//		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int MaxProduct = 1, MinProduct = 1, MMProduct= Integer.MIN_VALUE;
		
		for(int i = 0 ;i<array.length;i++)
		{
			if(array[i] > 0)
			{
//				MaxProduct = Math.max(array[i], Math.max(MaxProduct, MaxProduct*array[i]));
//				if(MinProduct < 0)
//					MinProduct = Math.min(array[i], Math.min(MinProduct, MinProduct*array[i]));
//				else
//					MinProduct = Math.min(array[i], Math.min(MinProduct, MinProduct*array[i]));
				
				MaxProduct =  MaxProduct*array[i];
				MinProduct =  Math.min(1, MinProduct*array[i]);
				System.out.print(MaxProduct + " ");
				System.out.println(MinProduct);
				
			}
			if(array[i] < 0)
			{ 
				
//				if(MinProduct < 0){
//					MaxProduct = Math.max(array[i], Math.max(MaxProduct, MinProduct*array[i]));
//					MinProduct = array[i];
//				}
//				else
//					MinProduct = Math.min(array[i], Math.min(MinProduct, MaxProduct*array[i]));
//				
				int temp = 	 MaxProduct;
//				MaxProduct = Math.max(1, MinProduct*array[i]);
				MaxProduct = MinProduct*array[i];
				MinProduct =  temp*array[i];
				
				System.out.print(MaxProduct + " ");
				System.out.println(MinProduct);
	
			}
			if(array[i] == 0)
			{
				
				MaxProduct = 1;
				MinProduct = 1;
			}
			
			MMProduct = Math.max(MMProduct, MaxProduct);

		}
		
		System.out.println( Math.max(MMProduct, MaxProduct));
	}

}
