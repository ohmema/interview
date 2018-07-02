
public class RotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] array = {10,12,13,14, 2,4,6,8};
//		int[] array = {10,12,13,14,15,16,17,18, 2};
//		int[] array = {0,1,2,3,4,5,6,7,19, 21};
		int[] array = {7,1};
		System.out.println(findMin(array));
//		System.out.println(find(array,12));
//		System.out.println(binarySearch(array, 10));
	}
	
	public static int binarySearch(int[] a, int key) {
	    int low = 0;
	    int high = a.length -1;
	    int mid;
	    while (low<=high) {
	        mid = (low+high) /2;
	        if (a[mid] > key) 
	            high = mid -1;
	        else if (a[mid] < key) 
	            low = mid +1;
	        else 
	            return mid;
	    }
	    return -1;
	}
	
	 public static int findMin(int[] num) {
	        int first =0, last = num.length-1;
	        int mid =0;
	        while(first <= last)
	        {
	        	System.out.println(first + " "+last);
	            mid = (first + last)/2;
	            if(last-first  <=1)
	            	return num[first] <num[last]? first:last;
	            
	            if(num[first] > num[mid])
	            {
	            	last = mid;
	            }
	            else
	            {
	            	first = mid;
	            }
	        }
	        return -1;
	    }
	 
	 public static int find(int[] num, int target)  {
	        int first =0, last = num.length-1;
	        int mid =0;
	        while(first <= last)
	        {
	        	System.out.println(first + " "+last);
	            mid = (first + last)/2;
	            if(num[mid] ==target)
	            	return mid;
	            
	            if(num[first] > num[mid])
	            {
	            	if(target>num[mid] && target <= num[last])
	            		first = mid+1;
	            	else
	            		last = mid;
	            }
	            else
	            {
	            	if(target >= num[first] && target < num[mid])
	            		last = mid;
	            	else
	            		first = mid+1;  		
	            } 
	        }
	        return -1;
	 }
}
