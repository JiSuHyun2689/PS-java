package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q2606 {

	/**
	 * 입력 1 : 컴퓨터의 수 (노드의 수) 100 이하, 1번부터 번호 입력 2 : 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수
	 * (간선의 수) 컴퓨터 X번이 웜 바이러스에 걸렸을 때, X번 컴퓨터를 통해 웜 바이러스에 걸리게 되는 컴퓨터의 수 출력 컴퓨터 X번과
	 * 연결된 컴퓨터 수 찾기
	 * 
	 * 
	 * DFS 실행 속도 : 80ms
	 * BFS 실행 속도 : 76ms
	 **/
	static int[][] adj;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int v = Integer.parseInt(br.readLine()); // 노드의 수(컴퓨터의 수)
			int n = Integer.parseInt(br.readLine()); // 간선의 수(컴퓨터들끼리 연결된 쌍의 수)
			adj = new int[v + 1][v + 1];
			visited = new boolean[v + 1];
			cnt = 0;

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				adj[a][b] = adj[b][a] = 1;
			}

			// bw.write(String.valueOf(searchBfs(1)));
			searchDfs(1);
			bw.write(String.valueOf(cnt));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static int searchBfs(int start) {
		int answer = 0;

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(start);
		visited[start] = true;

		while (!queue.isEmpty()) {
			int current = queue.poll();

			for (int i = 1; i <= adj.length - 1; i++) {
				if (adj[current][i] == 1 && !visited[i]) {
					queue.add(i);
					visited[i] = true;
					answer++;
				}
			}
		}
		return answer;
	}

	static void searchDfs(int start) {

		if (visited[start])
			return;
		visited[start] = true;

		for (int i = 1; i <= adj.length - 1; i++) {
			if (adj[start][i] == 1 && !visited[i]) {
				searchDfs(i);
				cnt++;
			}
		}
	}

}
