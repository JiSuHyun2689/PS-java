package programmers.level1;

public class MakePrimeNumber {
	class Solution {
		public int sum = 0;
		public int answer = 0;

		public int solution(int[] nums) {

			boolean[] visited = new boolean[nums.length];

			combination(nums, visited, 0, 3);

			return answer;
		}

		void combination(int[] arr, boolean[] visited, int start, int r) {
			if (r == 0) {
				print(arr, visited);
				return;
			} else {
				for (int i = start; i < arr.length; i++) {
					visited[i] = true;
					combination(arr, visited, i + 1, r - 1);
					visited[i] = false;
				}
			}
		}

		public boolean checkPrimeNumber(int n) {
			if (n < 2)
				return false;
			else if (n == 2)
				return true;
			else {
				for (int i = 2; i < n; i++) {
					if (n % i == 0)
						return false;
				}
				return true;
			}
		}

		public void print(int[] arr, boolean[] visited) {
			sum = 0;
			for (int i = 0; i < arr.length; i++)
				if (visited[i] == true)
					sum += arr[i];

			if (checkPrimeNumber(sum))
				answer++;
		}
	}
}
