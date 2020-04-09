package programmers;

public class L1_StringToInt {
	class Solution {
		public int solution(String s) {
			int answer = 0;
			boolean sign = false;

			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == '-')
					sign = true;
				else if (ch != '+')
					answer = answer * 10 + (ch - '0');

			}

			return sign ? -1 * answer : answer;
			// return Integer.parseInt(s);
		}
	}
}
