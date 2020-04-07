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

		// 작은 순서대로 sorted 배열에 삽입
		while (i <= mid && j <= end) {
			if (arr[i] <= arr[j])
				sorted[k++] = arr[i++];
			else
				sorted[k++] = arr[j++];
		}

		// 한쪽이 먼저 끝난 경우, 남은 배열 데이터 삽입
		if (i > mid)
			for (int t = j; t <= end; t++, k++)
				sorted[k] = arr[t];
		else
			for (int t = i; t <= mid; t++, k++)
				sorted[k] = arr[t];

		// 정렬된 배열을 원래 배열에 삽입
		for (int t = start; t <= end; t++)
			arr[t] = sorted[t];

	}

	static void mergeSort(int[] arr, int start, int end) {
		// 크기가 1이 아닌 경우
		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}

}
