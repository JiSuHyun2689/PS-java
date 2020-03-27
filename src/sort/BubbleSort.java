package sort;

public class BubbleSort {

	public static void main(String[] args) {

		int i, j, temp;
		int[] arr = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		int size = arr.length;
		for (i = 0; i < size; i++) {
			for (j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int target : arr)
			System.out.print(target + " ");

	}
}
