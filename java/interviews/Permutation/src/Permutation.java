
public class Permutation {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4};
		permutation(array,0);
	}
	
	public static void permutation(int[] array, int pos)
	{
		if(pos  == array.length)
			print(array);
		
		for(int i =pos;i < array.length;i++)
		{
			swap(array,pos,i);
			permutation(array,pos+1);
			swap(array,i,pos);
		}
		
	}
	public static void swap(int[] array, int i , int j)
	{
		int temp = array[i];
		array[i]= array[j];
		array[j]= temp;
	}
	
	public static void print(int[] array)
	{
		for(int i = 0 ; i<array.length;i++)
		{
			System.out.print(array[i]);
		}
		System.out.println();
	}
	
}
