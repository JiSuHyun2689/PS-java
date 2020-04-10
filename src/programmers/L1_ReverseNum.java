package programmers;

import java.util.Stack;

class L1_ReverseNum {
	public int[] solution(long n) {
		int[] answer = new int[(int) (Math.log10(n) + 1)];
		/*
		 * Stack<Integer> stack = new Stack<Integer>();
		 * 
		 * if (n != 0) { for (int i = 1; i <= answer.length; i++) stack.add((int) (n /
		 * Math.pow(10, answer.length - i) % 10));
		 * 
		 * for (int i = 0; i < answer.length; i++) answer[i] = stack.pop(); }
		 */

		int i = 0;
		while (n > 0) {
			answer[i++] = (int) (n % 10);
			n /= 10;
		}
		
		return answer;
	}
}
