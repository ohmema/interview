package initiation2D;

public class Init {

	public class Int{
		int i;
		public Int(int v)
		{
			i =v;
		}
		public String toString()
		{
			return new String(""+i);
		}
	}
	
	int[][] twoDInt;
	Integer[][] twoDInteger;
	Int[][] twoInt;

	public Init(int capacity) {
		twoDInt = new int[capacity][capacity];
		twoDInteger = new Integer[capacity][capacity];
		twoInt = new Int[capacity][capacity];
	}

	public void set(int i, int j) {
		twoDInt[i][j] = 1;
		twoDInteger[i][j] = 1;
		twoInt[i][j] = new Int(1);
	}

	public String toString(int option) {
		StringBuffer sb = new StringBuffer();
		if (option == 1) {
			for (int i = 0; i < twoDInt.length; i++) {
				for (int j = 0; j < twoDInt.length; j++) {
					sb.append(twoDInt[i][j] + " ");
				}
				sb.append("\n ");
			}
		}
		else if(option ==2)
		{
			for (int i = 0; i < twoDInteger.length; i++) {
				for (int j = 0; j < twoDInteger.length; j++) {
					sb.append(twoDInteger[i][j] + " ");
				}
				sb.append("\n ");
			}
			
		}
		else if(option ==3)
		{
			for (int i = 0; i < twoInt.length; i++) {
				for (int j = 0; j < twoInt.length; j++) {
					sb.append(twoInt[i][j] + " ");
				}
				sb.append("\n ");
			}
			
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Init graph = new Init(10);

		graph.set(1, 4);
		graph.set(2, 5);

		System.out.println(graph.toString(3));

	}

}
