package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q1012 {

	// 입력 1 : T (test case)
	// 입력 2 : 가로 M (1<=M<=50), 세로 N (1<=N<=50), 배추가 심어져 있는 위치의 개수 K (1<=K<=2500),
	// 배추의 위치 X(0<=X<=M-1),Y(0<=Y<=N-1)

	static int[][] adj;
	static int bug;
	static Queue<Integer> bugCnt;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			bugCnt = new LinkedList<Integer>();
			int t = Integer.parseInt(br.readLine());
			
			for (int i = 0; i < t; i++) {
				String[] tmp = br.readLine().split(" ");
				int m = Integer.parseInt(tmp[0]);
				int n = Integer.parseInt(tmp[1]);
				int k = Integer.parseInt(tmp[2]);

				search(br, m, n, k);
			}

			while (!bugCnt.isEmpty()) {
				bw.write(String.valueOf(bugCnt.poll()) + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void dfs(int x, int y, int m, int n) {

		adj[x][y] = 0;

		for (int i = 0; i < 4; i++) {
			int newX = x + dx[i];
			int newY = y + dy[i];

			if (newX < 0 || newX >= m || newY < 0 || newY >= n)
				continue;
			if (adj[newX][newY] == 1)
				dfs(newX, newY, m, n);

		}
	}

	static void search(BufferedReader br, int m, int n, int k) throws Exception {

		adj = new int[m][n];
		bug = 0;

		for (int i = 0; i < k; i++) {
			String[] tmp = br.readLine().split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			adj[a][b] = 1;
		}

		for (int p = 0; p < m; p++) {
			for (int q = 0; q < n; q++) {
				if (adj[p][q] == 1) {
					bug++;
					dfs(p, q, m, n);
				}
			}
		}
		bugCnt.add(bug);
	}
}
