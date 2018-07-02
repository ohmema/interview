package FaceBook;

import java.util.Random;

public class MaxIndex {

	public static void main(String[] args) {
		int[] a = { 6, 4, 6, -1, 6, 3, 6 };
//		System.out.println(maxIndex(a));
		System.out.println(maxIndexRandomAndNoExtraMemory(a));
//		for(int i: a)
//		{
//			System.out.print(i+ " ");
//		}

	}

	public static int maxIndex(int[] array) {
		int max = Integer.MIN_VALUE;
		int max_index = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
				max_index = i;
			}
		}
		return max_index;
	}

	// Requirement if there are duplicate indexes,
	// 1. return random of the duplicated indexes
	// 2. do not use extra memory, {1,1,1,1,1} use O(1)
	public static int maxIndexRandomAndNoExtraMemory(int[] array) {
//		int max = Integer.MIN_VALUE;
//		int k = 0;
		int max = array[0];
		int k = 1;
		array[0] = 0;
		for (int i = 1; i < array.length; i++) {
			if(array[i]> max)
			{
				k = 0;
				max = array[i];
				array[k++] = i;
			}
			else if(array[i] == max)
			{
				array[k++] = i;
			}
		}
		for(int i: array)
		{
			System.out.print(i+ " ");
		}
		System.out.println(" k= " + k);
		Random r = new Random();
		int random_max_index = r.nextInt(k);
		return array[random_max_index];
	}
	
}
