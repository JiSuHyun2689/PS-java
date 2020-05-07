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
	 * �Է� 1 : ��ǻ���� �� (����� ��) 100 ����, 1������ ��ȣ �Է� 2 : ��Ʈ��ũ �󿡼� ���� ����Ǿ� �ִ� ��ǻ�� ���� ��
	 * (������ ��) ��ǻ�� X���� �� ���̷����� �ɷ��� ��, X�� ��ǻ�͸� ���� �� ���̷����� �ɸ��� �Ǵ� ��ǻ���� �� ��� ��ǻ�� X����
	 * ����� ��ǻ�� �� ã��
	 * 
	 * 
	 * DFS ���� �ӵ� : 80ms
	 * BFS ���� �ӵ� : 76ms
	 **/
	static int[][] adj;
	static boolean[] visited;
	static int cnt;

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

			int v = Integer.parseInt(br.readLine()); // ����� ��(��ǻ���� ��)
			int n = Integer.parseInt(br.readLine()); // ������ ��(��ǻ�͵鳢�� ����� ���� ��)
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
