package algo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DFS_3 {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

			String[] tmp = br.readLine().split(" ");
			int n = Integer.parseInt(tmp[0]); // 정점 개수
			int m = Integer.parseInt(tmp[1]); // 간선 개수
			int v = Integer.parseInt(tmp[2]) - 1; // 시작 정점 번호
			int[][] adj = new int[n][n];
			boolean[] visited = new boolean[n];

			for (int i = 0; i < m; i++) {
				tmp = br.readLine().split(" ");
				int a = Integer.parseInt(tmp[0]) - 1;
				int b = Integer.parseInt(tmp[1]) - 1;

				adj[a][b] = adj[b][a] = 1;
			}

			dfs(adj, visited, v);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void dfs(int[][] adj, boolean[] visited, int v) {
		
		if (visited[v])
			return;
		visited[v] = true;
		visit(v);

		for (int i = 0; i <= adj.length - 1; i++) {
			if (adj[v][i] == 1 && !visited[i])
				dfs(adj, visited, i);
		}
	}

	static void visit(int v) {
		System.out.print((v+1) + " ");
	}
}
