package MAXDifference;

public class MaxDifference {

	public static void main(String[] args) {
		
		int[] array = { 1, 3, 56, - 3, 4, 66, -7, 8};
		
		int diff = maxNeighborDifference(array);
		for (int i : array)
			System.out.print(i + " ");

		System.out.println();
		System.out.print("max neighbor difference is " + diff);
		
		
		
		
		diff = maxBuyingAndSellingDifference(array);
		
		System.out.println();
		System.out.print("max buying nd selling difference is " + diff);
		
		
		System.out.println();
		System.out.print("max sum is " + maxSum(array));
		
	}
	
	static int maxNeighborDifference(int[] array)
	{
		int max_diff = Integer.MIN_VALUE;
		
		for(int i =0; i < array.length -1; i++)
		{
			int temp_diff = Math.abs(array[i]-array[i+1]);
			max_diff = Math.max(max_diff, temp_diff);
		}
		return max_diff;
	}
	/*
	 *
	 */
	static int maxBuyingAndSellingDifference(int[] array)
	{
		int max_diff = array[1]-array[0];
		int min_value = array[0];
		for(int i =2; i < array.length ; i++)
		{
			min_value = Math.min(min_value, array[i-1]);
			max_diff = Math.max(max_diff, array[i]-min_value);
		}
		return max_diff;
	}
	
	static int maxSum(int[] array)
	{
		int max_sum = 0;
		
		for(int i =0; i < array.length; i++)
		{
			int temp_sum = max_sum + array[i];
			max_sum = Math.max(max_sum, temp_sum);
		}
		return max_sum;
	}

}
