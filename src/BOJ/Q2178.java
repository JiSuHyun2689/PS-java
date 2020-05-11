package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q2178 {

	// (1,1) 위치에서 출발할 때, (N,M) 위치까지 지나가야하는 최소의 칸 수 출력
	// 입력 1 : 두 정수 N, M (2<=N, M<=100)
	// 입력 2 : N개의 줄에 M개의 정수로 미로가 주어짐

	static int[][] adj;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static int n, m;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			adj = new int[n][m];

			for (int i = 0; i < n; i++) {
				tmp = br.readLine().split("");

				for (int j = 0; j < m; j++) {
					adj[i][j] = Integer.parseInt(tmp[j]);
				}
			}

			bw.write(String.valueOf(bfs()));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static int bfs() {

		Queue<Node> queue = new LinkedList<Node>();
		queue.add(new Node(0, 0, 1));
		adj[0][0] = 0;

		while (!queue.isEmpty()) {

			Node current = queue.poll();

			if ((n - 1) == current.x && (m - 1) == current.y)
				return current.cnt;

			for (int j = 0; j < 4; j++) {
				int newX = current.x + dx[j];
				int newY = current.y + dy[j];

				if (0 <= newX && newX < n && 0 <= newY && newY < m) {
					if (adj[newX][newY] == 1) {
						adj[newX][newY] = 0;
						queue.add(new Node(newX, newY, current.cnt + 1));
					}
				}
			}
		}
		return 0;
	}

	static class Node {
		int x;
		int y;
		int cnt;

		public Node(int x, int y, int cnt) {
			this.x = x;
			this.y = y;
			this.cnt = cnt;
		}

	}
}
