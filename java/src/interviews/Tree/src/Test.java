import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		
		smallistDivisiable(3033);
	}

	static ArrayList<Integer> NextNumber(ArrayList<Integer> numArray)
	{
		ArrayList<Integer> newNum =  new ArrayList<Integer>();
		for(Integer i : numArray)
		{
			if(i != 0)
			{
				newNum.add(Integer.parseInt(i.toString() + "0"));
				newNum.add(Integer.parseInt(i.toString() + "9"));
			}
			if(i == 0)
				newNum.add(Integer.parseInt(i.toString() + "9"));
		}
		return newNum;
	}
	
	static int smallistDivisiable(int div)
	{
		int start =0;
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(start);
		while(true)
		{
			num = NextNumber(num);
			for(int i: num)
			{
				if((i%div) == 0)
				{
					System.out.println(i);
					return i;
				}
			}
		}
	}
	
	static int[] ss()
	{
		
		return new int[]{1,2};
	}
}
