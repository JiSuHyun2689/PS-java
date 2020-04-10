package programmers;

import java.util.Arrays;
import java.util.Collections;

public class L1_ReverseInt {

	class Solution {
		public long solution(long n) {
			long answer = 0;
			Integer[] arr = new Integer[(int) (Math.log10(n) + 1)];
			int i = 0;

			while (n > 0) {
				arr[i++] = (int) (n % 10);
				n /= 10;
			}

			Arrays.sort(arr, Collections.reverseOrder());
			for (int j = arr.length - 1, k = 0; j >= 0; j--, k++)
				answer += arr[k] * Math.pow(10, j);

			return answer;
			// String answer = "";
			// Integer.toString(n).chars().sorted().forEach(c -> answer = Character.valueOf((char)c) + answer);
		}
	}
}
