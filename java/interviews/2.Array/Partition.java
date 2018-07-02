public class Partition {

	public static void main(String[] args) {
		// int[] array = {2, 5, 3, -1, 2, 1, 2,2};//This does not work if there
		// are duplicates
		// int[] array = {2, 5, 3, -1, 4, 1, 8, 9,34, 2, 1, 43,5};
		int[] array = { 30, 28, 111, 10, 2, 3, 6 };
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();

		// int r = partition(array, 0 , array.length-1);
		// int r = partitionWithDuplication(array, 0 , array.length-1);
		int r = partitionRadomWithDuplication(array, 0, array.length - 1);
		System.out.println(" Pivot Index = " + r);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

	static int partition(int arr[], int left, int right) {
		int i = left, j = right;
		int tmp;
		int pivot = arr[(left + right) / 2];
		System.out.print("Pivot = " + pivot);
		while (i < j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;

		}

		return j;
	}

	static int partitionWithDuplication(int array[], int left, int right) {
		int p = 0, tmp = 0;
		int pivot = array[left];
		System.out.print("Pivot = " + pivot);

		for (int i = 1; i < array.length; i++) {
			if (array[i] <= pivot) {
				p++;
				tmp = array[i];
				array[i] = array[p];
				array[p] = tmp;
			}
		}

		tmp = array[left];
		array[left] = array[p];
		array[p] = tmp;

		return p;
	}

	static int partitionRadomWithDuplication(int array[], int left, int right) {
		int p = 0, tmp = 0;
		int pivot_i = (left + right) / 2;
		int pivot = array[pivot_i];
		swap(array, left, pivot_i);

		System.out.print("Pivot = " + pivot);

		for (int i = 1; i < array.length; i++) {
			if (array[i] <= pivot) {
				p++;
				swap(array, i, p);
			}
		}

		swap(array, left, p);

		return p;
	}

	static void swap(int[] array, int left, int right) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
}
