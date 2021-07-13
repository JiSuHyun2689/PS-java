package algo.book1.sort;

public class SelectionSort {

	static int[] array = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
	
	public static void selectionSort(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			int minIdx = i;
			for(int j=i+1; j<array.length; j++) {
				if(array[j] < array[minIdx])
					minIdx = j;
			}
			swap(i, minIdx, array[i], array[minIdx]);
		}
	}
	
	public static void swap(int idxA, int idxB, int a, int b) {
		
		array[idxA] = b;
		array[idxB] = a;
		
	}
	
	public static void main(String[] args) {
		
		selectionSort(array);
		for(int target : array)
			System.out.print(target + " ");
	}
}
