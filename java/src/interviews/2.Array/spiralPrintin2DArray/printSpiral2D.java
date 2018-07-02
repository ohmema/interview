package spiralPrintin2DArray;

public class printSpiral2D {

	public static void main(String[] args) {
		int[][] array = {{1,2,3,4}, {4,5,6,9},{7,8,9,7},{3,4,5,6}};
		
//		int[][] array = {{1,2,3, 4, 5}, {4,5,6, 7, 8},{7,8,9,9,10},{1,2,3,4,5}};
//		int[][] array = {{1,2}, {4,5},{7,8},{9,10},{11,12},{13,14},{15,16}};
		
		print(array);
		printSpiral(array);


	}
	
	static void printSpiral(int[][] array)
	{
		int rotation = (int)Math.sqrt(Math.min(array.length,  array[0].length));
	
		for(int p = 0; p < rotation ; p++)
		{
			for(int j = p; j <array[0].length -p;j++)
				System.out.print( array[p][j] + " ");
			
			for(int i = p+1; i <array.length -p;i++)
				System.out.print( array[i][array[0].length -1 -p] + " ");
			
			for(int j = array[0].length -2-p; j >= p;j--)
				System.out.print( array[array.length-1-p][j] + " ");
			
			for(int i = array.length-2-p; i >= 1+p; i--)
				System.out.print( array[i][p] + " ");
			
		}
	}
	
	static void print(int[][] array)
	{
		for(int i=0; i<array.length; i ++)
		{
			for(int j =0; j <array[0].length; j++)
				System.out.print(array[i][j] + " ");
			System.out.println();
		}
		System.out.println();
	}
}
