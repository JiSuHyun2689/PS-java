package algo.book1.search;

import java.util.Arrays;

public class FreezeDrinks {

	public static int graph[][];
	public static int n, m;

	public static boolean dfs(int x, int y) {

		if (x <= -1 || x >= n || y <= -1 || y >= m)
			return false;

		if (graph[x][y] == 0) {
			graph[x][y] = 1;
			dfs(x - 1, y);
			dfs(x + 1, y);
			dfs(x, y + 1);
			dfs(x, y - 1);
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		// n = 4;
		// m = 5;
		// String str = "00110\n" + "00011\n" + "11111\n" + "00000";

		n = 15;
		m = 14;
		String str = "00000111100000\n11111101111110\n11011101101110\n11011101100000\n11011111111111\n11011111111100\n11000000011111\n01111111111111\n00000000011111\n01111111111000\n00011111111000\n00000001111000\n11111111110011\n11100011111111\n11100011111111\n";

		graph = new int[n][m];
		for (int i = 0; i < n; i++) {
			String[] t = str.split("\n");
			String[] temp = t[i].split("");
			for (int j = 0; j < m; j++)
				graph[i][j] = Integer.parseInt(temp[j]);
		}

		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (dfs(i, j))
					answer++;
			}
		}
		System.out.println(answer);
	}
}
