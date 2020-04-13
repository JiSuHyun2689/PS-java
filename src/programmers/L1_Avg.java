package programmers;

public class L1_Avg {
	class Solution {
		public double solution(int[] arr) {
			double answer = 0;

			for (int i = 0; i < arr.length; i++) {
				answer += arr[i];
			}
			return answer / arr.length;
			//  return (int) Arrays.stream(array).average().orElse(0);
		}
	}
}
