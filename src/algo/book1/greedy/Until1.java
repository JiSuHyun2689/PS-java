package algo.book1.greedy;

public class Until1 {

	public static int solution(int n, int k) {

		int count = 0;

		while (n != 1) {
			n = n % k == 0 ? n / k : n--;
			count++;
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(25, 5));
	}

}
