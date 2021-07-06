package algo.book1.implementation;

public class Time {

	public static int solution(int n) {
		int count = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j < 60; j++) {
				for (int k = 0; k < 60; k++) {
					if (Integer.toString(i).contains("3") || Integer.toString(j).contains("3")
							|| Integer.toString(k).contains("3"))
						count++;
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		System.out.println(solution(5));
	}

}
