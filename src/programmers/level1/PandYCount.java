package programmers.level1;

public class PandYCount {

	class Solution {
		boolean solution(String s) {
			// s.toUpperCase();
			// s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
			int pC = 0, yC = 0;

			for (int i = 0; i < s.length(); i++) {
				String str = s.split("")[i];
				if (str.equalsIgnoreCase("p"))
					pC++;
				else if (str.equalsIgnoreCase("y"))
					yC++;
			}

			return pC == yC ? true : false;
		}
	}
}
