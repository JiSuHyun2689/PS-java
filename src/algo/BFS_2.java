package algo;

import java.util.LinkedList;
import java.util.Queue;

public class BFS_2 {

	public static void main(String[] args) {
		Graph g = new Graph(5);

		g.addEdge(4, 3);
		g.addEdge(4, 1);
		g.addEdge(0, 1);
		g.addEdge(2, 3);
		g.addEdge(2, 0);

		g.bfs(2);

	}

	static class Graph {
		class Node {
			int data;
			LinkedList<Node> adj;
			boolean visited;

			Node(int data) {
				this.data = data;
				this.visited = false;
				adj = new LinkedList<Node>();
			}
		}

		Node[] nodes;

		public Graph(int size) {
			nodes = new Node[size];
			for (int i = 0; i < size; i++) {
				nodes[i] = new Node(i);
			}
		}

		void addEdge(int a, int b) {
			Node n1 = nodes[a];
			Node n2 = nodes[b];

			if (!n1.adj.contains(n2))
				n1.adj.add(n2);
			if (!n2.adj.contains(n1))
				n2.adj.add(n1);
		}

		void visit(Node n) {
			System.out.print(n.data + " ");
		}

		void bfs(int start) {
			Node root = nodes[start];
			Queue<Node> queue = new LinkedList<Node>();

			queue.add(root);
			root.visited = true;

			while (!queue.isEmpty()) {
				Node r = queue.remove();
				visit(r);

				for (Node n : r.adj) {
					if (n.visited == false) {
						n.visited = true;
						queue.add(n);
					}
				}
			}
		}
	}
}