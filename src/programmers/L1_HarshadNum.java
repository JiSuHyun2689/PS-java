package programmers;

public class L1_HarshadNum {
	class Solution {
		public boolean solution(int x) {
			int sum = 0;
			int origin = x;

			while (x > 0) {
				sum += x % 10;
				x = x / 10;
			}

			return origin % sum == 0 ? true : false;
			
	        // return x % (String.valueOf(x).chars().map(ch -> ch - '0').sum()) == 0;
		}
	}
}
