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
		if (start >= end) { // ���Ұ� 1���� ���
			return;
		}

		int pivot = start; // pivot ���� ù��° ����
		int i = start + 1;
		int j = end;
		int temp;

		while (i <= j) { // ������ ������ �ݺ�
			while (i <= end && data[i] <= data[pivot]) { // �Ǻ������� ū ���� ���� �� ����
				i++;
			}
			while (j > start && data[j] >= data[pivot] ) { // �Ǻ������� ���� ���� ���� ������
				j--;
			}
			
			if (i > j) {// ���� ������ ���¸� �Ǻ����� ��ü
				temp = data[j];
				data[j] = data[pivot];
				data[pivot] = temp;
			}else { // �������� �ʾҴٸ� i�� j�� ��ü
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}

		}
		quickSort(data, start, j - 1);
		quickSort(data, j + 1, end);
	}

}
