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

		
		g.DFS(2); // 주어진 노드를 시작 노드로 DFS 탐색
		// g.DFS(); // 비연결형 그래프의 경우
		
	}

	static class Graph {
		private int V; // 노드 개수
		private LinkedList<Integer> adj[]; // 인접 리스트

		Graph(int v) {
			V = v;
			adj = new LinkedList[v];
			for (int i = 0; i < v; ++i) // 인접 리스트 초기화
				adj[i] = new LinkedList();
		}

		void addEdge(int v, int w) {
			adj[v].add(w);
		}

		/* DFS에 의해 사용되는 함수 */
		void DFSUtil(int v, boolean visited[]) {
			// 현재 노드를 방문한 것으로 표시하고 값을 출력
			visited[v] = true;
			System.out.println(v);

			// 방문한 노드와 인접한 모든 노드를 가져옴
			Iterator<Integer> it = adj[v].listIterator();

			while (it.hasNext()) {
				int n = it.next();
				// 방문하지 않은 노드라면, 해당 노드를 시작 노드로 설정하여 다시 DFSUtil 호출
				if (!visited[n])
					DFSUtil(n, visited);
			}
		}
		
	
		/* 주어진 노드를 시작 노드로 DFS 탐색 */
		void DFS(int v) {
			// 노드의 방문 여부 판단
			boolean visited[] = new boolean[V];
			
			// v를 시작 노드로 DFSUtil 호출
			DFSUtil(v, visited);
		}

		
		/* DFS 탐색 */
		void DFS() {
			// 노드의 방문 여부 판단
			boolean visited[] = new boolean[V];
			
			// 비연결형 그래프의 경우, 모든 정점을 하나씩 방문
			for(int i=0; i<V; ++i) {
				if(visited[i] == false)
					DFSUtil(i, visited);
			}
		}
		
	}

}
