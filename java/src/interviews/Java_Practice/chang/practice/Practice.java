

package chang.practice;

public class Practice {
	public static final double pi =3.14;
	
	public static void main(String[] args) {
		FileOut.FileOutTxt();
		FileIn.FileInTxt();
//		new Practice().test2();		

		System.exit(0);
	}
	public void test()
	{
		{
		double i = pi;
		}
		switch(new Integer(3).toString())
		{
		case "3":
			System.out.println(false);
			break;
		case "6":	
			System.out.println("vvvv");
			break;
		}
		System.out.println(pi);
	}
	
	public void test1()
	{
		int i[] = new int[1];
		i[0] = 100;
		Integer[] iii = new Integer[1];
		iii[0] = new Integer(100);
		test1_foo(i, iii);
		System.out.println( i[0] + " "+ iii[0]);
	}
	public void test1_foo(int[] i, Integer[] ii)
	{
		i[0] = 3;
		ii[0] = 3;
	}
	
		
	public void test2()
	{
		int i = 0;
		try
		{
			if(i ==0)
			{
				throw new Exception();
			}
			
		}
		catch( Exception e)
		{
			System.out.println("catch");
			System.exit(0);
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("function last");
		}
		
}
