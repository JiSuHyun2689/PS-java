package programmers;

public class L1_StringHandle {
	class Solution {
		public boolean solution(String s) {

			return s.length() == 4 || s.length() == 6 ? s.matches("^[0-9]+$") : false;
		}
	}
}
