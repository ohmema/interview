public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] A = { 3, 44, 5, 67, 45, 3, 2, 656, 65, 44, 64, 4576 };
		int[] A = { 4,6,17,1,2,3,8,5};
		// insertionSort(A);
//		selectionSort(A);
//		 MergeSort(A, 0, A.length-1);
		quickSort(A, 0, A.length-1);
		for (int i : A) {
			System.out.print(i + " ");
		}
	}

	public static void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j - 1] > array[j])
					swap(array, j - 1, j);
			}
		}
	}

	public static void selectionSort(int[] arr) {

		int i, j, minIndex;

		for (i = 0; i < arr.length - 1; i++) {
			minIndex = i;
			for (j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			swap(arr, i, minIndex);

		}
	}

	public static void MergeSort(int[] arr, int left, int right) {
		if(left >= right)
			return;
		int mid = (left +right)/2;
		MergeSort(arr, left, mid);
		MergeSort(arr, mid+1, right);
		Merge(arr, left, mid, right);
	}
	public static void Merge(int[] arr, int left,int mid,  int right) 
	{

		int[] tmp = new int[arr.length];	
		for(int i = left ; i<arr.length;i++)
		{
			tmp[i] = arr[i];
		}
		
		int i = left, j = mid +1, k = left;
				
		while(i <= mid && j <= right)
		{
			if(tmp[i] <= tmp[j])
				arr[k++] = tmp[i++];
			else
				arr[k++] = tmp[j++];
		}
		
		while( i <= mid)
			arr[k++] = tmp[i++];		
		while( j <= right)
			arr[k++] = tmp[j++];		
		
	}
	static int partition(int arr[], int left, int right) 
	{ 
	      int i = left, j = right; 
	      int pivotIndex = (left+right)/2;
	      int pivot = arr[pivotIndex]; 
	      while (i < j) { 
	            while (arr[i] < pivot && i <=right) 
	                  i++; 

	            while (arr[j] > pivot && j >=left) 
	                  j--; 
	            

	            
	            if (i < j) {
	            	swap(arr,i,j);
		            if(arr[i] == pivot)
		            	pivotIndex =i;
		            if(arr[j] == pivot)
		            	pivotIndex =j;
		            i++;
		            j--;
	            }
	      } 
	      return pivotIndex ; 
	}  

	static void  quickSort(int arr[], int left, int right) { 
	    if(left >= right)
	    	return;
		int index = partition(arr, left, right);
			
//	      if (left < index - 1) 
	            quickSort(arr, left, index ); 
//	      if (index < right) 
	            quickSort(arr, index+1, right); 
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
