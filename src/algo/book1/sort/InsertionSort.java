package algo.book1.sort;

public class InsertionSort {

	static int[] array = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

	public static void insertionSort(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j - 1])
					swap(j, array[j], array[j - 1]);
			}
		}
	}
	
	public static void swap(int idx, int a, int b) {
		array[idx] = b;
		array[idx-1] = a;
	}

	public static void main(String[] args) {
		insertionSort(array);
		for(int target : array)
			System.out.println(target);
	}

}
