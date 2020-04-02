package sort;

public class QuickSort {

	static int number = 10;
	static int[] data = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };

	public static void main(String[] args) {
		
		quickSort(data, 0, number - 1);

		for (int target : data) {
			System.out.print(target + " ");
		}
	}

	static void quickSort(int[] data, int start, int end) {
		if (start >= end) { // 원소가 1개인 경우
			return;
		}

		int pivot = start; // pivot 값은 첫번째 원소
		int i = start + 1;
		int j = end;
		int temp;

		while (i <= j) { // 엇갈릴 때까지 반복
			while (i <= end && data[i] <= data[pivot]) { // 피봇값보다 큰 값을 만날 때 까지
				i++;
			}
			while (j > start && data[j] >= data[pivot] ) { // 피봇값보다 작은 값을 만날 떄까지
				j--;
			}
			
			if (i > j) {// 현재 엇갈린 상태면 피봇값과 교체
				temp = data[j];
				data[j] = data[pivot];
				data[pivot] = temp;
			}else { // 엇갈리지 않았다면 i와 j를 교체
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}

		}
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}

}
