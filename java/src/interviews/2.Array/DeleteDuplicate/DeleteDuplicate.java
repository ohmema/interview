package DeleteDuplicate;

public class DeleteDuplicate {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 3, 4, 5, 5, 7, 8, 9, 11, 22, 22, 23, 45 };
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();

//		int entries = deleteDuplicate(array);
//		for (int i = 0; i < entries; i++)
//			System.out.print(array[i] + " ");
//
//		System.out.println();
//
//		int[] arra = { 1, 2, 3, 4 };
//		for (int i : arra)
//			System.out.print(i + " ");
//		System.out.println();
//
//		entries = deleteDuplicate(arra);
//		for (int i = 0; i < entries; i++)
//			System.out.print(array[i] + " ");
		
		
		
		int entries = deleteSortedDuplicate(array);
		for (int i = 0; i < entries; i++)
			System.out.print(array[i] + " ");

		System.out.println();

		int[] arra = { 1, 2, 3, 4 };
		for (int i : arra)
			System.out.print(i + " ");
		System.out.println();

		entries = deleteSortedDuplicate(arra);
		for (int i = 0; i < entries; i++)
			System.out.print(array[i] + " ");

	}
	//////////////////////////////////////////////////////////////
	// This is for unsorted O of N*M
	//////////////////////////////////////////////////////////////
	static int deleteDuplicate(int[] array) {
		int lastIndex = 0;
		for (int i = 0; i < array.length; i++) {
			boolean dup = false;
			int j = lastIndex - 1; // This was lastIndex --> 1,2,3,4 -->2,3,4
			while (j >= 0) {
				if (array[j--] == array[i]) {
					dup = true;
					break;
				}
			}
			if (!dup) {
				array[lastIndex++] = array[i];
			}
		}
		return lastIndex;
	}
	////////////////////////////////////////////////////////////////////
	// This is for sorted O of N
	////////////////////////////////////////////////////////////////////
	static int deleteSortedDuplicate(int[] array) {
		int lastIndex = 1;
		for (int i = lastIndex; i < array.length; i++) {
			if ( array[lastIndex-1] != array[i]) {
				array[lastIndex++] = array[i];
			}

		}
		return lastIndex;
	}

}
