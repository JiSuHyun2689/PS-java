package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1427 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			int num = Integer.parseInt(br.readLine());
			int temp = 0;
			List<Integer> list = new ArrayList<Integer>();

			while (num > 0) {
				temp = num % 10;
				num /= 10;
				list.add(temp);
			}

			int[] arr = list.stream().mapToInt(i -> i).toArray();
			mergeSort(arr, 0, arr.length - 1);

			for (int target : arr)
				bw.write(String.valueOf(target));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void merge(int[] arr, int start, int middle, int end) {

		int[] sorted = new int[arr.length];

		int i = start;
		int j = middle + 1;
		int k = start;

		while (i <= middle && j <= end) {
			if (arr[i] >= arr[j])
				sorted[k] = arr[i++];
			else
				sorted[k] = arr[j++];
			k++;
		}

		if (i > middle)
			for (int t = j; t <= end; t++)
				sorted[k++] = arr[t];
		else
			for (int t = i; t <= middle; t++)
				sorted[k++] = arr[t];

		for (int t = start; t <= end; t++)
			arr[t] = sorted[t];

	}

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int middle = (start + end) / 2;
			mergeSort(arr, start, middle);
			mergeSort(arr, middle + 1, end);
			merge(arr, start, middle, end);
		}
	}
}
