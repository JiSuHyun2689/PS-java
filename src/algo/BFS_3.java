package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_3 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]); // 정점 개수
			int m = Integer.parseInt(tmp[1]); // 간선 개수
			int v = Integer.parseInt(tmp[2]); // 시작 정점 번호
			int[][] adj = new int[n + 1][n + 1];
			boolean[] visited = new boolean[n + 1];

			for (int i = 0; i < m; i++) {
				tmp = br.readLine().split(" ");
				int a = Integer.parseInt(tmp[0]);
				int b = Integer.parseInt(tmp[1]);
				adj[a][b] = adj[b][a] = 1;
			}

			bfs(adj, visited, v);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void bfs(int[][] adj, boolean[] visited, int start) {
		Queue<Integer> queue = new LinkedList<Integer>();

		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int current = queue.remove();
			visit(current);

			for (int i = 1; i <= adj.length - 1; i++) {
				if (adj[current][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
				}
			}

		}

	}

	static void visit(int v) {
		System.out.print(v + " ");
	}
}
