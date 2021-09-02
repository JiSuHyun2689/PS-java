package algo.book1.search;

import java.util.Arrays;

public class FindPartsByBinarySearch {

	public static void main(String[] args) {
		int n = 5, m = 3;
		int[] parts = { 8, 3, 7, 9, 2 };
		int[] needParts = { 5, 7, 9 };

		Arrays.sort(parts);

		for (int target : needParts) {
			int result = binarySearch(parts, target, 0, n - 1);
			if (result == -1)
				System.out.print("no ");
			else
				System.out.print("yes ");
		}

	}

	public static int binarySearch(int[] array, int target, int start, int end) {

		while (start <= end) {
			int mid = (start + end) / 2;
			if (array[mid] == target)
				return mid;
			else if (array[mid] > target)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
