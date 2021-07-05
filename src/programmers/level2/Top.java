package programmers.level2;

import java.util.Stack;

class Top {
	int idx;
	int height;

	public Top(int idx, int height) {
		this.idx = idx;
		this.height = height;
	}

	public int[] solution(int[] heights) {
		int[] answer = new int[heights.length];
		Stack<Top> stack = new Stack<Top>();

		for (int i = 0; i < heights.length; i++) {

			Top top = new Top(i + 1, heights[i]);
			int idx = 0;

			while (!stack.isEmpty()) {
				Top before = stack.peek();

				if (top.height < before.height) {
					idx = before.idx;
					break;
				}
				stack.pop();
			}
			stack.push(top);
			answer[i] = idx;
		}

		return answer;
	}

}

/*
 * class Solution { public int[] solution(int[] heights) { int[] answer = new
 * int[heights.length];
 * 
 * for(int i=heights.length-1; i>=0; i--){ for(int j=i-1; j>=0; j--){
 * if(heights[i] < heights[j]){ answer[i] = j+1; break; } } }
 * 
 * return answer; } }
 */