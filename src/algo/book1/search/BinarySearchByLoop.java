package algo.book1.search;

import java.util.Scanner;

public class BinarySearchByLoop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] inputData = scanner.nextLine().split(" ");
		int n = Integer.parseInt(inputData[0]);
		int target = Integer.parseInt(inputData[1]);
		inputData = scanner.nextLine().split(" ");
		int[] array = new int[n];

		for (int i = 0; i < n; i++)
			array[i] = Integer.parseInt(inputData[i]);

		int result = binarySearch(array, target, 0, n - 1);
		if (result == -1)
			System.out.println("target이 리스트에 존재하지 않습니다.");
		else
			System.out.println(result + 1);

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
