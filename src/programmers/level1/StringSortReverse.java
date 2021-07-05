package programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class StringSortReverse {

	class Solution {
		public String solution(String s) {
			String answer = "";
			String[] strs = s.split("");
			Arrays.sort(strs, Collections.reverseOrder());

			for (String target : strs)
				answer += target;
			return answer;
			// return Stream.of(str.split("")).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		}
	}
}