package programmers.level1;

import java.util.*;

public class PickTwoAndSum {

	class Solution {
		Set<Integer> set = new TreeSet<>();

		public int[] solution(int[] numbers) {
			int[] answer = {};
			int i = 0;
			boolean[] visited = new boolean[numbers.length];

			combination(numbers, visited, 0, 2);
			answer = new int[set.size()];

			for (int target : set)
				answer[i++] = target;

			return answer;
		}

		public void combination(int[] arr, boolean[] visited, int n, int r) {
			if (r == 0) {
				addSet(arr, visited);
				return;
			}
			for (int i = n; i < arr.length; i++) {
				visited[i] = true;
				combination(arr, visited, i + 1, r - 1);
				visited[i] = false;
			}
		}

		public void addSet(int[] arr, boolean[] visited) {

			int sum = 0;

			for (int i = 0; i < arr.length; i++)
				if (visited[i] == true)
					sum += arr[i];
			set.add(sum);
		}
	}
}
