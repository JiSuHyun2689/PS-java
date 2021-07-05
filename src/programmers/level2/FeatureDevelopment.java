package programmers.level2;

import java.util.*;

public class FeatureDevelopment {

	class Solution {
		public int[] solution(int[] progresses, int[] speeds) {
			Queue<Integer> done = new LinkedList<>();
			Queue<Integer> result = new LinkedList<>();
			int cnt = 0;

			for (int i = 0; i < progresses.length; i++) {
				int day = -1;
				while (progresses[i] + (speeds[i] * day) < 100)
					day++;
				done.offer(day);
			}

			int last = done.peek();

			while (!done.isEmpty()) {
				int current = done.peek();

				if (current > last) {
					result.offer(cnt);
					last = current;
					cnt = 1;
				} else {
					cnt++;
				}
				done.poll();
				if (done.isEmpty())
					result.offer(cnt);
			}

			int[] answer = new int[result.size()];
			for (int i = 0; i < answer.length; i++)
				answer[i] = result.poll();

			return answer;
		}
	}
}
