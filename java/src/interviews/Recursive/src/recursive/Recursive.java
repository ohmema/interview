package recursive;


	public class Recursive {
		public boolean binarySearch(int[] array,int lower, int upper, int target){
			if( lower > upper)
				return false;
			else{
				int mid=(lower+upper)/2;
				if(array[mid]==target)
					return true;
				else if(target<array[mid])
					return binarySearch(array, lower, mid-1, target);
				else
					return binarySearch(array, mid+1, upper, target);
			}
			
		}
		
		public boolean iterBinarySearch(int[] array,int lower, int upper, int target){
			if(lower > upper)
				return false;
			int mid=0;
			
			while(true){
				if(lower > upper)
					return false;
				mid=(lower+upper)/2;
				if(array[mid] == target)
					return true;
				else if (target < array[mid])
					  upper= mid-1;
				else if( target >array[mid])
					lower = mid +1;
				
			}
			
		}
		
		/*******************************************************************************************/
		public void charPermutation(String s){
			char[] array = s.toCharArray();
			permutation(array, 0);
		}
		public void permutation(char[] array, int index){
	
			if(index == array.length){
				for( int j=0;j<index;j++)
					System.out.printf("%c",array[j]);
				System.out.println();
				return;
			}
			
			for(int i=index;i<array.length;i++){
				swap(array, index, i);
				permutation(array, index+1);
		
			}	
		}
		
		public static void swap(char[] array, int index, int target)
		{
		
			char  t = array[target];
			array[target]=array[index];
			array[index] =t;
		}
		/*******************************************************************************************/
		
		
		
	  	public static void main(String[] args) {
	  		int[] intArray={1,4,9,12,17,23,27,34,38,46,48,56,58,66,69,71,75,83,87,98,99};
	  		int find = 99;
	  		Recursive rec = new Recursive();
	  		/*
	  		boolean sure= rec.binarySearch(intArray,0, intArray.length-1, find);
	  		if(sure)
	  			System.out.printf("Find the int %d", find);
	  		else
	  			System.out.printf("Cannot find the int %d", find);
	  		 
	  		boolean sure= rec.iterBinarySearch(intArray,0, intArray.length-1, find);
	  		if(sure)
	  			System.out.printf("Find the int %d", find);
	  		else
	  			System.out.printf("Cannot find the int %d", find);
	  		*/
	  		
	  		String s = "abc";
	  		rec.charPermutation(s);
	  		
	  		
	  	}

}
