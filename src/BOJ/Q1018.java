package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1018 {

	static int n, m;
	static String[][] chessBoard;

	static String[][] wb = { { "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" },
			{ "W", "B", "W", "B", "W", "B", "W", "B" }, { "B", "W", "B", "W", "B", "W", "B", "W" } };
	static String[][] bw = { { "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" },
			{ "B", "W", "B", "W", "B", "W", "B", "W" }, { "W", "B", "W", "B", "W", "B", "W", "B" } };

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			chessBoard = new String[n][m];
			int min = 10000;

			for (int i = 0; i < n; i++) {
				tmp = br.readLine().split("");
				for (int j = 0; j < m; j++) {
					chessBoard[i][j] = tmp[j];
				}
			}

			for (int i = 0; i <= n - 8; i++) {
				for (int j = 0; j <= m - 8; j++) {
					int needChange = Math.min(countBw(i, j), countWb(i, j));
					if (min > needChange)
						min = needChange;
				}
			}

			bw.write(String.valueOf(min));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int countBw(int a, int b) {
		int cnt = 0;

		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (!chessBoard[i + a][j + b].equals(bw[i][j]))
					cnt++;

		return cnt;
	}

	static int countWb(int a, int b) {
		int cnt = 0;

		for (int i = 0; i < 8; i++)
			for (int j = 0; j < 8; j++)
				if (!chessBoard[i + a][j + b].equals(wb[i][j]))
					cnt++;
		return cnt;
	}
}
