package programmers.level1;

import java.util.*;

public class RaceFailPlayer {

	class Solution {
		public String solution(String[] participant, String[] completion) {
			String answer = "";
			Map<String, Integer> hashMap = new HashMap<>();

			for (String name : participant)
				hashMap.put(name, hashMap.getOrDefault(name, 0) + 1);
			for (String name : completion)
				hashMap.put(name, hashMap.get(name) - 1);

			for (String target : hashMap.keySet()) {
				if (hashMap.get(target) != 0)
					answer += target;
			}
			return answer;
		}
	}
}
