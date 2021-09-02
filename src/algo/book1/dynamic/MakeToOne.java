package algo.book1.dynamic;

public class MakeToOne {

	public static void main(String[] args) {
		int x = 26;
		makeToOne(x);
	}

	public static void makeToOne(int x) {

		int[] d = new int[30001];

		for (int i = 2; i < x + 1; i++) {
			d[i] = d[i - 1] + 1;
			if (i % 2 == 0)
				d[i] = min(d[i], d[i / 2] + 1);
			if (i % 3 == 0)
				d[i] = min(d[i], d[i / 3] + 1);
			if (i % 5 == 0)
				d[i] = min(d[i], d[i / 5] + 1);
		}
		System.out.println(d[x]);
	}

	public static int min(int a, int b) {
		return a > b ? b : a;
	}
}


