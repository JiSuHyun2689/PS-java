package programmers;

import java.util.*;

class L3_Network {
	static int cnt;

	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[n];

		for (int[] target : computers)
			System.out.println(Arrays.toString(target));

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (computers[i][j] == 1) {
					System.out.println("computers[" + i + "][" + j + "] = " + computers[i][j]);
					cnt++;
					dfs(computers, visited, i, n);
				}
			}
		}

		System.out.println(cnt);
		return answer;
	}

	static void dfs(int[][] adj, boolean[] visited, int node, int n) {

		if (visited[node])
			return;
		visited[node] = true;
		System.out.println("visit : " + node);
		for (int i = 0; i < n; i++) {
			if (adj[node][i] == 1 && !visited[i]) {
				dfs(adj, visited, node, n);
			}
		}

	}
}