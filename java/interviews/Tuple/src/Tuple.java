
import java.util.PriorityQueue;


public class Tuple implements Comparable<Tuple>{

	public char a;
	public int a1;
	public int a2;
	
	public Tuple(char ch, int i1, int i2 )
	{
		a= ch;
		a1 =i1;
		a2 = i2;
	}
	
	public static class Duple{
		public char a;
		public int a1;
		public Duple(char ch   , int i1 )
		{
			a= ch;
			a1 =i1;
		}
		
	}
	public static void main(String[] args) {
		Tuple[] tuple = {new Tuple('a', 5,6), new Tuple('c', 4,5), new Tuple('a', 1,2),new Tuple('a', 3,4) ,new Tuple('b', 3,4)};
		
		Duple[] dou = ConvertToDou(tuple);
		print(dou);
		Duple[] dou1 = ConvertToDouPQ(tuple);
		print(dou1);
	}
	
	public static Duple[] ConvertToDou(Tuple[] tuple)
	{
		Duple[] dou = new Duple[tuple.length];
		boolean[] isUsed = new boolean[tuple.length];

		int minInt = Integer.MAX_VALUE;
		int minIndex=0;
		char minChar = 0;
		for(int i = 0; i<tuple.length; i ++)
		{
			minInt = Integer.MAX_VALUE;
			for(int j = 0; j<tuple.length; j ++)
			{
				if(tuple[j].a1 < minInt && isUsed[j] == false)
				{
					minInt = tuple[j].a1;
					minChar = tuple[j].a;
					minIndex =j;
				}
			}
			dou[i] = new Duple(minChar,minInt);
			isUsed[minIndex] = true;
		}
		
		return dou;
	}
	
	public static Duple[] ConvertToDouPQ(Tuple[] tuple)
	{
		PriorityQueue<Tuple> pq = new PriorityQueue<Tuple>();
		
		for(int i =0;i< tuple.length;i++){
			pq.add(tuple[i]);
		}
		
		Duple[] dou = new Duple[tuple.length];
		int i =0;
		while(!pq.isEmpty())
		{
			Tuple one = pq.poll();
			dou[i++] = new Duple(one.a, one.a1);
			
		}
			
			
		return dou;
	}
	
	public static  void print(Duple[] duple)
	{
		for(int i =0; i< duple.length; i++)
		{
			System.out.print("{" + duple[i].a + ", "+duple[i].a1+"}");
		}
		System.out.println();
	}

	public int compareTo(Tuple a) {
		return this.a1 - a.a1;
	}
	
}
