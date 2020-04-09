package programmers;

public class L1_CaeserCipher {
	public static String solution(String s, int n) {
		String answer = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int temp = 0;
			if (ch == ' ') {
				answer += ch;
				continue;
			}

			if (ch >= 65 && ch <= 90) {
				temp = ch + n;
				if (temp > 90)
					temp = 65 + ((temp - 91) % 26);
			} else if (ch >= 97 && ch <= 122) {
				temp = ch + n;
				if (temp > 122)
					temp = 97 + ((temp - 123) % 26);
			}

			answer += (char) temp;
		}
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("B G W Z a x y s t", 10));
	}
}
