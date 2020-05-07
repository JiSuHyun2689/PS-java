package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1260 {

	static public int[][] adj;
	static public boolean[] visited;

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]); // 정점 개수
			int m = Integer.parseInt(tmp[1]); // 간선 개수
			int v = Integer.parseInt(tmp[2]); // 시작 정점 번호
			adj = new int[n + 1][n + 1];
			visited = new boolean[n + 1];

			for (int i = 0; i < m; i++) {
				tmp = br.readLine().split(" ");
				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);

				adj[a][b] = adj[b][a] = 1;
			}

			dfs(adj, visited, v, bw);
			bw.write("\n");
			initVisited();
			bfs(adj, visited, v, bw);
		} catch (Exception e) {
		}

	}

	static void dfs(int[][] adj, boolean[] visited, int start, BufferedWriter bw) throws Exception {
		if (visited[start])
			return;

		visit(start, bw);
		visited[start] = true;

		for (int i = 1; i <= adj.length - 1; i++) {
			if (adj[start][i] == 1 && !visited[i])
				dfs(adj, visited, i, bw);
		}
	}

	static void bfs(int[][] adj, boolean[] visited, int start, BufferedWriter bw) throws Exception {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int current = queue.remove();
			visit(current, bw);

			for (int i = 1; i <= adj.length - 1; i++) {
				if (adj[current][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}

	}

	static void visit(int current, BufferedWriter bw) throws Exception {
		bw.write(String.valueOf(current) + " ");
	}

	static void initVisited() {
		for (int i = 0; i < visited.length; i++)
			visited[i] = false;
	}
}