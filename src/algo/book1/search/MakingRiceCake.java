package algo.book1.search;

import java.util.Arrays;

public class MakingRiceCake {

	public static void main(String[] args) {

		int n = 4, m = 6;
		int[] array = { 19, 15, 10, 17 };
		Arrays.sort(array);

		int start = 0, result = 0;
		int end = array[array.length - 1];

		while (start <= end) {
			int total = 0;
			int mid = (start + end) / 2;

			for (int target : array)
				if (target > mid)
					total += target - mid;
			
			if(total < m)
				end = mid - 1;
			else {
				result = mid;
				start = mid + 1;
			}

		}

		System.out.println(result);
	}

}
