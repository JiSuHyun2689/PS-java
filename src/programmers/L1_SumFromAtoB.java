package programmers;

public class L1_SumFromAtoB {

	public long solution(int a, int b) {
		long answer = 0;
		int min = a, max = b;
		if (a > b) {
			min = b;
			max = a;
		}

		for (int i = min; i < max; i++)
			answer += i;
		return answer;
	}

}
