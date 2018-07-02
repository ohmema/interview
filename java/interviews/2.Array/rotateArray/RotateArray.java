package rotateArray;

public class RotateArray {

	public static void main(String[] args) {
		int[] array = { 1, 3, 56, - 3, 4, 66, 77,88,-7, 8,9,10, 15, 17,18, 19, 20};
		rotate(array, 2);
		
		for (int i : array)
			System.out.print(i + " ");

	}
	
	public static void rotate(int[] array, int k)
	{
		int[] tmp = new int[k];
	
		for( int i = 0; i<k; i++)
		{
			tmp[i] = array[i];
		}
		
		for(int i = array.length -1;i >= k; i--)
		{
			array[(i+k)%array.length]=array[i] ;
		}
		
		for( int i = k, j =0 ; j< tmp.length; i++,j++)
		{
			array[i] = tmp[j];
		}
		
	}
	

}
