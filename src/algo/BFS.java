package algo;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {

	public static void main(String[] args) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 3);
		g.addEdge(1, 3);
		g.addEdge(2, 3);

		g.BFS(0);
	}

	/* LinkedList�� �̿��� ���⼺ �ִ� �׷��� Ŭ���� */
	static class Graph {
		private int V; // ����� ����
		private LinkedList<Integer> adj[]; // ���� ����Ʈ

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) // ���� ����Ʈ �ʱ�ȭ
				adj[i] = new LinkedList();
		}

		/* ��带 ���� v->w */
		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		/* s�� ���� ���� �� BFS�� Ž���ϸ鼭 Ž���� ������ ��� */
		void BFS(int s) {
			// ����� �湮 ���� �Ǵ� �迭
			boolean visited[] = new boolean[V];
			// BFS ������ ���� ť ����
			LinkedList<Integer> queue = new LinkedList<Integer>();

			// ���� ��带 ����� ������ ǥ���ϰ� ť�� ����
			visited[s] = true;
			queue.add(s);

			// ť�� ������ ������ �ݺ�
			while (queue.size() != 0) {
				// �湮�� ��带 ť���� �����ϰ� ���� ���
				s = queue.poll();
				System.out.println(s);

				// �湮�� ���� ������ ��� ��带 �����´�.
				Iterator<Integer> it = adj[s].listIterator();
				while (it.hasNext()) {
					int n = it.next();
					// �湮���� ���� ����� �湮�� ������ ǥ���ϰ�, ť�� ����
					if (!visited[n]) {
						visited[n] = true;
						queue.add(n);
					}
				}
			}

		}

	}

}
