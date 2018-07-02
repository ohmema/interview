package initiation2D;

public class Piramid2D {

	int[][] twoD;
	
	public Piramid2D(int c)
	{
		twoD = new int[c][];
		int col =1;
		for(int i =0 ; i<twoD.length;i++ )
			twoD[i] = new int[col++];
		
	}
	public static void main(String[] args) {
		Piramid2D p = new Piramid2D(5);

	}

}
