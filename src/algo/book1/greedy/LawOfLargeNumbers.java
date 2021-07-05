package algo.book1.greedy;

import java.util.Arrays;

public class LawOfLargeNumbers {

	public static int solution(int n, int m, int k, int[] arr) {

		// n = �迭�� ũ��, m = ���ڰ� �������� Ƚ��, k = �����ؼ� ������ �� �ִ� Ƚ��
		Arrays.sort(arr);
		int a = (m / k) * k;
		int b = m % k;

		return arr[n - 1] * a + arr[n - 2] * b;
	}

	public static void main(String[] args) {
		int[] temp = { 2, 4, 5, 4, 6 };

		System.out.println(solution(5, 8, 3, temp));

	}
}
