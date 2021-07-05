package programmers.level2;

import java.util.Stack;

class IronBar {
	public int solution(String arrangement) {
		int answer = 0;
		String[] strs = arrangement.split("");
		Stack<String> bars = new Stack<String>();

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].equals("("))
				bars.push(strs[i]);
			else if (strs[i].equals(")")) {
				if (strs[i - 1].equals("("))
					answer += bars.size() - 1;
				else
					answer++;
				bars.pop();
			}
		}
		return answer;
	}
}
