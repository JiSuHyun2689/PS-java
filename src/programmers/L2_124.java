package programmers;

public class L2_124 {
	public String solution(int n) {
		String answer = "";
		int r = 0;

		while (n > 0) {
			r = n % 3;
			n /= 3;

			if (r == 0) {
				r = 4;
				n -= 1;
			}
			answer = r + answer;
		}
		return answer;
	}

	public String sol_v2(int n) {
		String[] num = { "4", "1", "2" };
		String answer = "";

		while (n > 0) {
			answer = num[n % 3] + answer;
			n = (n - 1) / 3;
		}
		return answer;
	}
}
