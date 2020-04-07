package programmers;

import java.util.*;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0, idx;
		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < moves.length; i++) {
			idx = moves[i] - 1;

			for (int j = 0; j < board[0].length; j++) {
				if (board[j][idx] != 0) {
					if (stack.isEmpty()) {
						stack.push(board[j][idx]);
					} else {
						if (board[j][idx] == stack.peek()) {
							stack.pop();
							answer += 2;
						} else {
							stack.push(board[j][idx]);
						}
					}
					board[j][idx] = 0;
					break;
				}
			}
		}
		return answer;
	}
}