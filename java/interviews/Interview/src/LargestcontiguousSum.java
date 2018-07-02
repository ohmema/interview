
public class LargestcontiguousSum {

	public static void main(String[] args) {
	
		int[] a ={3,45,43,-1,34,4,43,-45,545,-2};
		int sum = largestSum(a);
		int sum1 = cheapLargestSum(a);
		System.out.println(sum);	
		System.out.println(sum1);	
	}
	static int largestSum(int a[])
	{
		int largest = Integer.MIN_VALUE;
		for(int i =0; i < a.length;i++)
		{
			int sum = a[i];
			for(int j=i;j< a.length; j++)
			{
				sum += a[j];
				if(sum > largest)
					largest = sum;
			}
		}
		return largest;
	}
	
	static int cheapLargestSum(int a[])
	{
		int maxSum =a[0], currentSum = a[0]
				;
		for(int i =0; i < a.length;i++)
		{
			currentSum = Math.max(currentSum, a[i]); 
			maxSum = Math.max(currentSum,maxSum);
			
		}
		return maxSum;
	}
}
