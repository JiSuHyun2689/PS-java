package programmers.level1;

public class CreateWeirdString {

	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] strs = s.split(" ", -1);

			for (int i = 0; i < strs.length; i++) {
				for (int j = 0; j < strs[i].length(); j++) {
					String str = strs[i].split("")[j];
					if (j % 2 != 0)
						answer += str.toLowerCase();
					else
						answer += str.toUpperCase();
				}
				if (i != strs.length - 1)
					answer += " ";

			}
			return answer;
		}
	}
}
