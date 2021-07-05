package algo.book1.greedy;

public class NumberCardGame {

	public static int solution(int n, int m, int[][] arr) {

		int max = 0;

		for (int i = 0; i < n; i++) {
			int min = 100000;
			for (int j = 0; j < m; j++) {
				if (min > arr[i][j])
					min = arr[i][j];
			}
			max = min < max ? max : min;
		}

		return max;

	}

	public static void main(String[] args) {

		 int[][] arr = { { 3, 1, 2 }, { 4, 1, 4 }, { 2, 2, 2 } };
		 System.out.println(solution(3, 3, arr));

		//int[][] arr = { { 7, 3, 1, 8 }, { 3, 3, 3, 4 } };
		//System.out.println(solution(2, 4, arr));

	}

}
