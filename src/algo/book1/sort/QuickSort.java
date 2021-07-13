package algo.book1.sort;

public class QuickSort {

	static int[] array = { 7, 5, 9, 0, 3, 1, 6, 2, 4, 8 };

	static void quickSort(int[] array, int start, int end) {

		if (start >= end)
			return;

		int pivot = start;
		int left = start + 1;
		int right = end;

		while (left <= right) {
			while (left <= end && array[left] <= array[pivot])
				left++;

			while (right > start && array[right] >= array[pivot])
				right--;

			if (left > right)
				swap(pivot, right);
			else
				swap(left, right);

			quickSort(array, start, right - 1);
			quickSort(array, right + 1, end);
		}

	}

	public static void swap(int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {

		quickSort(array, 0, array.length - 1);

		for (int target : array)
			System.out.println(target);
	}

}
