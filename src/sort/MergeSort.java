package sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MergeSort {

	static int[] sorted;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			sorted = new int[n];

			for (int i = 0; i < n; i++)
				arr[i] = Integer.parseInt(br.readLine());

			mergeSort(arr, 0, arr.length - 1);

			for (int target : arr)
				bw.write(target + " ");

			br.close();
			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void merge(int[] arr, int start, int mid, int end) {

		int i = start;
		int j = mid + 1;
		int k = start;

		// ���� ������� sorted �迭�� ����
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j])
				sorted[k++] = arr[i++];
			else
				sorted[k++] = arr[j++];
		}

		// ������ ���� ���� ���, ���� �迭 ������ ����
		if (i > mid)
			for (int t = j; t <= end; t++, k++)
				sorted[k] = arr[t];
		else
			for (int t = i; t <= mid; t++, k++)
				sorted[k] = arr[t];

		// ���ĵ� �迭�� ���� �迭�� ����
		for (int t = start; t <= end; t++)
			arr[t] = sorted[t];

	}

	static void mergeSort(int[] arr, int start, int end) {
		// ũ�Ⱑ 1�� �ƴ� ���
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

}
