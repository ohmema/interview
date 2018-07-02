public class QuickSort {

	public static void quicksort1(int[] numbers, int low, int high) {
		if(low >= high)
			return;
		int i = low, j = high;
		int pivot = numbers[(high + low) / 2];

		while (i <= j) {

			while ( numbers[i] < pivot) 
				i++;
			
			while (numbers[j] > pivot) 
				j--;
			
			if (i <= j) 
				swap(numbers, i++, j--);
		}
			quicksort1(numbers, low, j);
			quicksort1(numbers, i, high);
	}

	static void quicksort2(int[] a , int left, int right)
	{
		if(left >= right)
			return;
		
		int p = partition(a, left, right);
		quicksort2(a, left, p-1);
		quicksort2(a, p+1, right);
	}
	
	static int partition(int[] a, int left, int right)
	{
		int p = a[(left+ right)/2];
		
		while(left < right)
		{
			while(a[left] < p)
				left ++;
			while(a[right] > p)
				right--;
			if(left < right)
				swap (a, left, right);
		}
		
		return right;
	}
	private static void swap(int[] numbers, int i, int j) {
		int temp = numbers[i];
		numbers[i] = numbers[j];
		numbers[j] = temp;
	}

	public static void main(String[] args) {
		int[] tmp = {-62,-2,-23,-12,5,8 };

		quicksort2(tmp, 0, tmp.length-1);

		for (int i : tmp) {
			System.out.print(i + " ");
		}

	}
}
