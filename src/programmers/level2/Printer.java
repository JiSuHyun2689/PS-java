package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

class Printer {
	public int solution(int[] priorities, int location) {
		int answer = 1;
		PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < priorities.length; i++)
			pQueue.offer(priorities[i]);

		while (!pQueue.isEmpty()) {
			for (int i = 0; i < priorities.length; i++) {
				if (priorities[i] == pQueue.peek()) {
					if (location == i)
						return answer;
					pQueue.poll();
					answer++;
				}
			}
		}

		return answer;
	}
}
