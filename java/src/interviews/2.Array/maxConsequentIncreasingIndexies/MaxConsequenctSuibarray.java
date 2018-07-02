package maxConsequentIncreasingIndexies;

import java.util.ArrayList;

public class MaxConsequenctSuibarray {

	public static void main(String[] args) {
		int[] array = { 1, 3, 56, - 3, 4, 66, 77,88,-7, 8,9,10, 15, 17,18, 19, 20};
		ArrayList<Integer> al = subarrayIndexies(array);
		
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
		for (int i : al)
			System.out.print(i + " ");

	}
	
	public static ArrayList<Integer> subarrayIndexies(int[] array)
	{
		int first_i = 0, last_i = 0, first_max = 0, last_max = 0;
		
		int numOfIndexies = 0, numOfMaxIndexies = 0, i=0;
		
		for(i = 1 ;i < array.length ;i++)
		{
			
			if(array[i] > array[i-1])
			{
				last_i = i;
				numOfIndexies++;
			}
			else
			{
				if(numOfIndexies > numOfMaxIndexies)
				{
					numOfMaxIndexies = numOfIndexies;
					first_max = first_i;
					last_max = i-1;
				}
				first_i = i;
				numOfIndexies =0;
			}
		}
		//Missed this part
		if(numOfIndexies > numOfMaxIndexies)
		{
			numOfMaxIndexies = numOfIndexies;
			first_max = first_i;
			last_max = i-1;
		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(first_max);
		al.add(last_max);
		return al;
	}

}
