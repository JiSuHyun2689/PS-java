package programmers;

public class L1_FindKim {
	class Solution {
		public String solution(String[] seoul) {
			String answer = "";
			if (seoul.length > 0 && seoul.length <= 1000) {
				for (int i = 0; i < seoul.length; i++) {
					if (seoul[i].equals("Kim")) {
						answer = "�輭���� " + i + "�� �ִ�";
						break;
					}
				}
			}
			return answer;
		}
	}
}
