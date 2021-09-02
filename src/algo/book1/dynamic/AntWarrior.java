package algo.book1.dynamic;

public class AntWarrior {

	public static void main(String[] args) {

		int n = 4;
		int[] array = { 1, 3, 1, 5 };

		solution(n, array);
	}

	private static void solution(int n, int[] array) {

		int[] d = new int[100];

		d[0] = array[0];
		d[1] = max(array[0], array[1]);

		for (int i = 2; i < n; i++)
			d[i] = max(d[i - 1], d[i - 2] + array[i]);

		System.out.println(d[n - 1]);
	}

	private static int max(int i, int j) {
		return i > j ? i : j;
	}

}
