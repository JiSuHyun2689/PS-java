package algo;

import java.util.Iterator;
import java.util.LinkedList;

import algo.BFS.Graph;

public class DFS {

	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addEdge(4, 3);
		g.addEdge(4, 1);
		g.addEdge(0, 1);
		g.addEdge(2, 3);
		g.addEdge(2, 0);

		
		g.DFS(2); // �־��� ��带 ���� ���� DFS Ž��
		// g.DFS(); // �񿬰��� �׷����� ���
		
	}

	static class Graph {
		private int V; // ��� ����
		private LinkedList<Integer> adj[]; // ���� ����Ʈ

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) // ���� ����Ʈ �ʱ�ȭ
				adj[i] = new LinkedList();
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		/* DFS�� ���� ���Ǵ� �Լ� */
		void DFSUtil(int v, boolean visited[]) {
			// ���� ��带 �湮�� ������ ǥ���ϰ� ���� ���
			visited[v] = true;
			System.out.println(v);

			// �湮�� ���� ������ ��� ��带 ������
			Iterator<Integer> it = adj[v].listIterator();

			while (it.hasNext()) {
				int n = it.next();
				// �湮���� ���� �����, �ش� ��带 ���� ���� �����Ͽ� �ٽ� DFSUtil ȣ��
				if (!visited[n])
					DFSUtil(n, visited);
			}
		}
		
	
		/* �־��� ��带 ���� ���� DFS Ž�� */
		void DFS(int v) {
			// ����� �湮 ���� �Ǵ�
			boolean visited[] = new boolean[V];
			
			// v�� ���� ���� DFSUtil ȣ��
			DFSUtil(v, visited);
		}

		
		/* DFS Ž�� */
		void DFS() {
			// ����� �湮 ���� �Ǵ�
			boolean visited[] = new boolean[V];
			
			// �񿬰��� �׷����� ���, ��� ������ �ϳ��� �湮
			for(int i=0; i<V; ++i) {
				if(visited[i] == false)
					DFSUtil(i, visited);
			}
		}
		
	}

}
