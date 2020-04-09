package programmers;

public class L1_Digit {
	public int solution(int n) {
		int answer = 0;
		int size = (int) (Math.log10(n) + 1);

		for (int i = 1; i <= size; i++) {
			answer += (n / Math.pow(10, size - i)) % 10;
		}
		
//		while (n != 0) {
//            answer += n % 10;
//            n /= 10;
//        }

		return answer;
	}

}
