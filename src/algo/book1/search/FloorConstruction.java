package algo.book1.search;

public class FloorConstruction {

	public static void main(String[] args) {
		int n = 3;
		solution(n);
	}

	private static void solution(int n) {

		int[] d = new int[1001];

		d[1] = 1;
		d[2] = 3;
		for (int i = 3; i < n + 1; i++)
			d[i] = (d[i - 1] + (d[i - 2] * 2)) % 796796;

		System.out.println(d[n]);
	}

}
