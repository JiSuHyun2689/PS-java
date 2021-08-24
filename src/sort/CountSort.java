package sort;

public class CountSort {

	public static int[] countSort(int[] array) {

		int[] temp = new int[array.length];

		for (int i = 0; i < array.length; i++)
			temp[array[i]]++;

		return temp;
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array[i]; j++)
				System.out.print(i + " ");
	}

	public static void main(String[] args) {
		int[] array = { 7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2 };
		int[] temp = countSort(array);
		printArray(temp);
	}

}
