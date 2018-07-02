package deleteKeyFromArray;

public class DeleteKeyFromArray {

	public static void main(String[] args) {
	 int[] array = {3,5,6,77,8,3,5,9,11,5,6,0,5, -1};
	 for(int i:array)
		 System.out.print(i + " ");
	 System.out.println();
	 
	 int entries = deleteKey(array,3); 
	 for(int i =0; i<entries;i++)
		 System.out.print(array[i] + " ");
	 
	 System.out.println();
	 for(int i:array)
		 System.out.print(i + " ");
	}
	
	public static int deleteKey(int[] array, int key)
	{
		int lastIndex = 0;
		
		for(int i =0; i<array.length;i++)
		{
			if(array[i] == key)
				i++;
			array[lastIndex] = array[i];
			lastIndex++;
		}
		for(int i = lastIndex ; i<array.length;i++)
			array[i]=0;
		return lastIndex;
	}

}
