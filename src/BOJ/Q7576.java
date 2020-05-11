package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Q7576 {

	// 입력 1 : 상자의 크기 M, N (2 <= M, N <= 1000)
	// 입력 2 : 하나의 상자에 저자된 토마토들의 정보(N개의 줄)
	// -1은 토마토가 들어있지 않음
	// 토마토가 모두 익을 때까지의 최소 날짜 출력
	// 저장될 때부터 모든 토마토가 익어있는 상태면 0 출력, 모두 익지 못하는 상황에는 -1 출력

	static int n, m;
	static int[][] adj;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	static Queue<Node> queue;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			queue = new LinkedList<Node>();

			n = Integer.parseInt(tmp[0]);
			m = Integer.parseInt(tmp[1]);
			adj = new int[m][n];

			for (int i = 0; i < m; i++) {
				tmp = br.readLine().split(" ");
				for (int j = 0; j < n; j++) {
					int num = Integer.parseInt(tmp[j]);
					adj[i][j] = num;
					if (num == 1)
						queue.add(new Node(i, j, 0));
				}
			}

			bw.write(String.valueOf(dfs()));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int dfs() {

		int day = 0;

		while (!queue.isEmpty()) {

			Node current = queue.poll();
			day = current.day;

			for (int i = 0; i < 4; i++) {
				int newX = current.x + dx[i];
				int newY = current.y + dy[i];

				if (0 <= newX && newX < m && 0 <= newY && newY < n) {
					if (adj[newX][newY] == 0) {
						adj[newX][newY] = 1;
						queue.add(new Node(newX, newY, day + 1));
					}
				}
			}
		}

		if (checkAdj())
			return day;
		else
			return -1;

	}

	static boolean checkAdj() {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				if (adj[i][j] == 0)
					return false;
		}
		return true;
	}

	static class Node {
		int x;
		int y;
		int day;

		public Node(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}
}
